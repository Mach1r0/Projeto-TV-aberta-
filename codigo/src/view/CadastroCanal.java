package view;

import javax.swing.*;

import Controller.CanalController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCanal extends JFrame implements ActionListener{
    JLabel nome = new JLabel("Nome canal:");
    JTextField txtnome = new JTextField();
    JButton Cadastrar = new JButton("Cadastrar");
    JLabel Titulo = new JLabel("Cadastro Canal");
    JButton Cancelar = new JButton("Cancelar");
    JButton Excluir = new JButton("Excluir");
    JButton Consultar = new JButton("Consultar");
    

    public CadastroCanal() {
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        
        Excluir.setBounds(200, 120, 100, 25);
        add(Excluir);
        

        Cancelar.setBounds(320, 120, 100, 25);
        add(Cancelar);
        
        Consultar.setBounds(440, 120, 100, 25);
        add(Consultar);
               
        


        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroCanal();
    }
    public void cadastrarCanal(java.awt.event.ActionEvent e ) {
    	String nome = txtnome.getText();
    	boolean sucesso = true;
    	
 		try {	
 			CanalController canalcontrol = new CanalController(); 		
 			sucesso = canalcontrol.cadastroCanal(nome);
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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == Cadastrar) {
				cadastrarCanal(e);
			}
	}
}
