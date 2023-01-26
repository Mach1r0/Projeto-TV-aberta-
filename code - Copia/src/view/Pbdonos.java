package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Pbdonos {
    JFrame janelatext = new JFrame("Donos da bola");
    JLabel titulo = new JLabel("Donos da Bola");
    JTextArea texto = new JTextArea("MasterChef é um reality show de culinária brasileiro exibido "
    		+ "\nBandeirantes, baseado no consagrado formato original de mesmo "
    		+ "\nnome exibido pela BBC no Reino Unido "
    		+ "\nO programa é apresentado pela jornalista Ana Paula Padrão e os, "
    		+ "\njurados são os chefes Henrique Fogaça, ");
	public Pbdonos(){
        janelatext.setSize(400, 500);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(130, 0, 200, 50);
        janelatext.add(titulo);
        janelatext.setBackground(new Color(173, 173, 173));
        janelatext.setLayout(null);
    	janelatext.setLocationRelativeTo(null);
        janelatext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	janelatext.getContentPane().setBackground(new Color(173, 173, 173));
        texto.setBounds(25, 50, 330, 300);
        texto.setBackground(new Color(173, 173, 173));
        janelatext.add(texto);
        janelatext.setVisible(true);
    }
	public static void main(String[] args) {
		new Pbdonos();
	}
}
