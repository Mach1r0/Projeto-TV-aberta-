package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CadastroPrograma extends JFrame implements ActionListener {
JLabel Genero = new JLabel("Gênero:");
JLabel Programa = new JLabel("Nome Programa:");
JTextArea txtPrograma = new JTextArea();
JButton Cadastrar = new JButton("Cadastrar");
JLabel Titulo = new JLabel("Cadastro Programa");
JLabel Resumo = new JLabel("Resumo:");
JTextArea txtResumo = new JTextArea();
JButton Cancelar = new JButton("Cancelar");
JButton Excluir = new JButton("Excluir");
JButton Consultar = new JButton("Consultar");
JLabel horario = new JLabel("Horario:");
JLabel canal = new JLabel("");
JTextArea txtSinopse = new JTextArea();


public CadastroPrograma() {
    setSize(580, 700);
    setLayout(null);
    setLocationRelativeTo(null);

    



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
        String[] options = {"Selecione um gênero", "Série", "Desenho", "Filme"};
        JComboBox dropbox = new JComboBox(options);
        dropbox.setBounds(180, 110, 200, 25);
    	JTextArea txtserie = new JTextArea();
    	dropbox.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        Object item = dropbox.getSelectedItem();
    	        if (item.toString().equals("Série")) {
    	        	JLabel Quantidadeep = new JLabel("Quantidade de episodeos:");
    	        	Quantidadeep.setBounds(80, 450, 200, 25);
    	        	add(Quantidadeep);
    	        	JTextArea txtquantidadeep = new JTextArea();
    	        	txtquantidadeep.setBounds(100, 450, 200, 120);
    	        	add(txtquantidadeep);
    	        	System.out.println("Desenho");
    	        } 
    	        else if (item.toString().equals("Desenho")) {
    	        	JLabel idade = new JLabel("Idade minima:");
    	        	idade.setBounds(80, 450, 200, 25);
    	        	add(idade);
    	        	JTextArea txtidade = new JTextArea();
    	        	txtidade.setBounds(100, 450, 200, 120);
    	        	add(txtidade);
    	        }
    	        else if (item.toString().equals("Filme")) {
    	        	JLabel duracao = new JLabel("Idade minima:");
    	        	duracao.setBounds(80, 450, 200, 25);
    	        	add(duracao);
    	        	JTextArea txtduracao = new JTextArea();
    	        	txtduracao.setBounds(100, 450, 200, 120);
    	        	add(txtduracao);    	        }
    	    }
    	});

        add(dropbox);
        selecionarhorario.setBounds(180, 140, 200, 25);
        add(selecionarhorario);

        
        Programa.setBounds(80, 80, 100, 25);
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
        
        dropbox.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroPrograma();
        }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
			
	
	}
