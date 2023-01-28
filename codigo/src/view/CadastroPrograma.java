package view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import Controller.ProgramaController;

public class CadastroPrograma extends JFrame implements ActionListener {
JLabel Genero = new JLabel("Gênero:");
JLabel Programa = new JLabel("Titulo:");
JTextArea txtPrograma = new JTextArea("");
JButton Cadastrar = new JButton("Cadastrar");
JLabel Titulo = new JLabel("Cadastro Programa");
JLabel Resumo = new JLabel("Resumo:");
JTextArea txtResumo = new JTextArea();
JButton Cancelar = new JButton("Cancelar");
JButton Excluir = new JButton("Excluir");
JButton Consultar = new JButton("Consultar");
JLabel horario = new JLabel("Horario:");
JLabel canal = new JLabel("");
JSpinner spinerDuracao = new JSpinner();
String[] genero = {"Selecione um gênero", "Série", "Desenho", "Filme"};
JComboBox combogenero = new JComboBox(genero);






public CadastroPrograma() {
    setSize(580, 500);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // Titulo
    Titulo.setBounds(200, 20, 200, 20);
    Titulo.setFont(new Font("Arial", Font.BOLD, 20));
    add(Titulo);
    
    Genero.setBounds(125, 110, 200, 25);
    add(Genero);
    
    horario.setBounds(125, 140, 200, 25);
    add(horario);
        
        String[] horario = {"Selecione um horario", "00:00 - 07:00", "07:00 - 12:00", "12:00 - 18:00","18:00 - 21:00", "21:00 - 00:00" };
        JComboBox selecionarhorario = new JComboBox(horario);
        combogenero.setBounds(180, 110, 200, 25);
    	JTextArea txtserie = new JTextArea();
    	add(combogenero);
        selecionarhorario.setBounds(180, 140, 200, 25);
        add(selecionarhorario);

        
        Programa.setBounds(135, 80, 100, 25);
        add(Programa);
        
        Resumo.setBounds(125, 175, 200, 25);
        add(Resumo);

        txtResumo.setBounds(180, 180, 300, 120);
        add(txtResumo);
        
        txtPrograma.setBounds(180, 80, 200, 25);
        add(txtPrograma);

        //////////////////////BOTÕES CRUD
        
        Cadastrar.setBounds(80, 400, 100, 25);
        add(Cadastrar);
        
        Excluir.setBounds(200, 400, 100, 25);
        add(Excluir);
        

        Cancelar.setBounds(320, 400, 100, 25);
        add(Cancelar);
        
              
        Consultar.setBounds(440, 400, 100, 25);
        add(Consultar);
        
        Cadastrar.addActionListener(this);
               
        
        combogenero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				   int selection = combogenero.getSelectedIndex();
					switch (selection) {
		                case 0:
		                    break;
			                case 1:			          							                
		                	revalidate(); // atualiza o painel
		                	repaint(); 
		                	
		                	JLabel Quantidadeep  = new JLabel("Quantidade de episodeos:");
		                    Quantidadeep.setBounds(80, 450, 200, 25);
		                    add(Quantidadeep);
		                    JTextArea txtquantidadeep = new JTextArea();
		                    txtquantidadeep.setBounds(235, 450, 200, 25);
		                    add(txtquantidadeep); 
		                    setSize(580, 550);
		                                
		                    break;

		                case 2:
		                	revalidate(); // atualiza o painel
		                	repaint(); // redesenha o painel
		                    JLabel idademin = new JLabel("Idade minima:");
		                    idademin.setBounds(100, 450, 200, 25);
		                    add(idademin);
		                    JTextArea txtidademin = new JTextArea();
		                    txtidademin.setBounds(180, 450, 200, 25);
		                    add(txtidademin); 
		                    setSize(580, 550);
		                   
	                    
		                    break;
		                
		                case 3:
		                	repaint(); // redesenha o painel
		                  	revalidate(); // atualiza o painel
		                    JLabel duracao = new JLabel("Qual é o diretor:");
		                    duracao.setBounds(40, 450, 200, 25);
		                    add(duracao);
		                    JTextArea txtduracao = new JTextArea();
		                    txtduracao.setBounds(135, 450, 200, 25);
		                    add(txtduracao); 
		                    setSize(580, 550);
		                    
		                    break;
		                default:
		                    break;
		            }				
			}

		
        	
        });

        setVisible(true);
       

    }
	public void cadastrarPrograma(java.awt.event.ActionEvent e ) {
		String horario = spinerDuracao.getValue().toString();
		String genero = combogenero.getSelectedItem().toString();
		boolean sucesso = false;	

		try {	
			ProgramaController programacontrol = new ProgramaController();
			sucesso = programacontrol.cadastrarDesenho(txtPrograma.getText(), genero, txtResumo.getText() , null);
			if (sucesso == true) {
				JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso!");
				this.ExcluirCadastroPrograma(e);
				}
			else {
			JOptionPane.showMessageDialog(null,"Os campos não foram preenchidos corretamente." );
			}
		}
		
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro:" + ex);
		}
	}
	

	private void ExcluirCadastroPrograma(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
	  new CadastroPrograma();
	}




@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == Cadastrar) {
	    cadastrarPrograma(e);
	}
	
	
		}
}