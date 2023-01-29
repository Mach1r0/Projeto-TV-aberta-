package view;

import javax.swing.*;

import controller.CanalController;
import dao.ExceptionDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroCanal extends JFrame implements ActionListener{
    JLabel nome = new JLabel("Nome canal:");
    JTextField txtnome = new JTextField();
    JButton Cadastrar = new JButton("Salvar");
    JLabel Titulo = new JLabel("Cadastro Canal");
    JButton Cancelar = new JButton("Cancelar");
    JButton Excluir = new JButton("Excluir");
    JButton Consultar = new JButton("Consultar");
    private Integer codCanal = 0;

    public CadastroCanal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        // Titulo
        Titulo.setBounds(230, 20, 200, 20);
        Titulo.setFont(new Font("Arial", Font.BOLD, 20));
        add(Titulo);
                              
        nome.setBounds(80, 80, 100, 25);
        add(nome);

        txtnome.setBounds(155, 80, 200, 25);
        add(txtnome);

        Cadastrar.setBounds(80, 120, 100, 25);
        Cadastrar.addActionListener(this);
        add(Cadastrar);
        Consultar.addActionListener(this);
        Excluir.addActionListener(this);


        Excluir.setBounds(200, 120, 100, 25);
        add(Excluir);
        

        Cancelar.setBounds(320, 120, 100, 25);
        Cancelar.addActionListener(this);
        add(Cancelar);
        
        Consultar.setBounds(440, 120, 100, 25);
        add(Consultar);
               
        


        setVisible(true);
    }

 
    public void cadastrarCanal(java.awt.event.ActionEvent e ) {
    	String nome = txtnome.getText();
    	boolean sucesso = true;
    	
 		try {	
 			CanalController canalcontrol = new CanalController(); 
 			if(this.codCanal == 0)
		 			sucesso = canalcontrol.cadastroCanal(nome); 
 			else
		 			sucesso = canalcontrol.alterarCanal(codCanal, nome); 

 			if (sucesso == true) {
 				JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso!." );
 				this.limparTelacadastro(e);
				}
			else {
			JOptionPane.showMessageDialog(null,"Os campos não foram preenchidos corretamente.");
			}
		}
		
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro:" + ex);
		}
	}
	
	private void limparTelacadastro(ActionEvent evt) {
		txtnome.setText("");
	}
	public void excluirCanal(java.awt.event.ActionEvent evt) throws Exception {
		boolean sucesso = false;
		CanalController controleCanal = new CanalController();
		try {
			sucesso = controleCanal.excluirCanal(this.codCanal);
			if(sucesso) {
				JOptionPane.showMessageDialog(null,"Canal apagado com sucesso!");
				this.limparTelacadastro(evt);
			} else {
				JOptionPane.showMessageDialog(null, "O canal não foi apagado, selecione um ator");
			}
		} catch (ExceptionDAO ex) {
			Logger.getLogger(CadastroCanal.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public static void main(String[] args) {
		CadastroCanal tela = new CadastroCanal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == Cadastrar) {
				cadastrarCanal(e);
			}
			if(src == Consultar) {
				new ConsultaCanal();
			}
			if(src == Excluir) {
				try {
					excluirCanal(e);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			if(src == Cancelar) {
				limparTelacadastro(e);
			}
	}


	public void buscarCanal(Integer codCanal, String nome) {
		this.codCanal = codCanal;
		this.txtnome.setText(nome);
	}		


	
	}
