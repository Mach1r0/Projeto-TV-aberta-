package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Telaprincipal extends JFrame implements ActionListener {
    JMenuBar barramenu = new JMenuBar();
    JMenu Cadastro = new JMenu("Cadastro");
    JMenu canais = new JMenu("Canais");
    JMenuItem Canal = new JMenuItem("Canal");
    JMenuItem Programa = new JMenuItem("Programa");

	public Telaprincipal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Define o título da janela
        setTitle("Tela principal");

        // Cria a barra de menu

        // Cria o menu "Arquivo" e adiciona à barra de menu
        barramenu.add(canais);
 
        barramenu.add(Cadastro);
        
        Cadastro.add(Canal);
        	
        Cadastro.add(Programa);
        
        Programa.addActionListener(this);
        Canal.addActionListener(this);
        // Adiciona a barra de menu à janela
        setJMenuBar(barramenu);
        // Define as dimensões da janela
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Cria a janela e a torna visível
    	Telaprincipal janela = new Telaprincipal();
        janela.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == Programa) {
			new CadastroPrograma();
		}
		if(src == Canal) {
			new CadastroCanal();
		}
		
			
	}
}