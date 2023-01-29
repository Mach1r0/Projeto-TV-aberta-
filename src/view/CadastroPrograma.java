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
import controller.DesenhoController;
import controller.FilmeController;
import controller.SerieController;

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
JLabel lhorario = new JLabel("Horario:");
JLabel canal = new JLabel("");
JSpinner spinerDuracao = new JSpinner();
String[] genero = {"Selecione um gênero", "Série", "Desenho", "Filme"};
JComboBox combogenero = new JComboBox(genero);
JTextArea txtquantidadeep = new JTextArea();
JLabel Quantidadeep  = new JLabel("Quantidade de episodeos:");
JLabel diretor = new JLabel("Qual é o diretor:");
JLabel idademin = new JLabel("Idade minima:");
JTextArea txtidademin = new JTextArea();
JTextArea txtdiretor = new JTextArea();
DesenhoController programacontrol = new DesenhoController();
FilmeController filmecontroller = new FilmeController();
SerieController seriecontroller = new SerieController();

String[] horario = {"Selecione um horario", "00:00 - 07:00", "07:00 - 12:00", "12:00 - 18:00","18:00 - 21:00", "21:00 - 00:00" };
JComboBox selecionarhorario = new JComboBox(horario);


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
    
    lhorario.setBounds(125, 140, 200, 25);
    add(lhorario);
    
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
               
        
           setVisible(true);
       

    

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
	                	
	                    Quantidadeep.setBounds(80, 450, 200, 25);
	                    add(Quantidadeep);
	                    txtquantidadeep.setBounds(235, 450, 200, 25);
	                    add(txtquantidadeep); 
	                    setSize(580, 550);
	                               
	                    break;

	                case 2:
	                	revalidate(); // atualiza o painel
	                	repaint(); 
	                    idademin.setBounds(100, 450, 200, 25);
	                    add(idademin);
	                    txtidademin.setBounds(180, 450, 200, 25);
	                    add(txtidademin); 
	                    setSize(580, 550);
	                   	                    
	                    break;
	                
	                case 3:
	                	repaint(); // redesenha o painel
	                  	revalidate(); // atualiza o painel
	                    diretor.setBounds(40, 450, 200, 25);
	                    add(diretor);
	                    txtdiretor.setBounds(135, 450, 200, 25);
	                    add(txtdiretor); 
	                    setSize(580, 550);
	                    
	                    break;
	                default:
	                    break;
	            }				
		}

   });}
	public void cadastrarPrograma(java.awt.event.ActionEvent e ) {
		String horario = spinerDuracao.getValue().toString();
		String genero = combogenero.getSelectedItem().toString();
		boolean sucesso = false;	
	if (genero == "Desenho"){
		try {	
			sucesso = programacontrol.cadastrarDesenho(txtPrograma.getText(), genero, txtResumo.getText(), horario, txtidademin.getText());
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
	if (genero == "Filme"){
		try {	
			sucesso = filmecontroller.cadastrarFilme(txtPrograma.getText(), genero, txtResumo.getText(), horario, txtdiretor.getText());
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
	if (genero == "Série"){
		try {	
			sucesso = seriecontroller.cadastrarSerie(txtPrograma.getText(), genero, txtResumo.getText(), horario, txtquantidadeep.getText());
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
	}
	
	
	

	private void ExcluirCadastroPrograma(ActionEvent evt) {
		
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