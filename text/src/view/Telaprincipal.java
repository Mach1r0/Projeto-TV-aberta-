package view;

import javax.swing.*;

public class Telaprincipal extends JFrame {
   
	public Telaprincipal() {
        // Define o título da janela
        setTitle("Tela principal");

        // Cria a barra de menu
        JMenuBar barramenu = new JMenuBar();

        // Cria o menu "Arquivo" e adiciona à barra de menu
        JMenu canais = new JMenu("Canais");
        barramenu.add(canais);

        // Cria o item "Abrir" e adiciona ao menu "Arquivo"
        JMenuItem Globo = new JMenuItem("Globo");
        canais.add(Globo);
        
        JMenuItem Record = new JMenuItem("Record");
        canais.add(Record);
        
        JMenuItem Band = new JMenuItem("Band");
        canais.add(Band);

        JMenu Cadastro = new JMenu("Cadastro");
        barramenu.add(Cadastro);
        
        JMenuItem Canal = new JMenuItem("Canal");
        Cadastro.add(Canal);
        	
        JMenuItem Programa = new JMenuItem("Programa");
        Cadastro.add(Programa);
        

        

        

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
}