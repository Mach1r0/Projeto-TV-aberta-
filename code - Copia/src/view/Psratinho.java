package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Psratinho {
    JFrame janelatext = new JFrame("Ratinho");
    JLabel titulo = new JLabel("Ratinho");
    JTextArea texto = new JTextArea("A TV Globinho é um programa de televisão infantil brasileiro "
    		+ "\nproduzido e exibido pela TV Globo. A transmissão ocorria "
    		+ "\npelas manhãs, às 9h30. A programação contava com "
    		+ "\ndiversos desenhos animados que entretinham as crianças, "
    		+ "\n como Dragon Ball e Três Espiãs Demais");
	public Psratinho(){
        janelatext.setSize(400, 500);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(130, 0, 200, 50);
        janelatext.add(titulo);
        janelatext.setBackground(new Color(173, 173, 173));
        janelatext.setLayout(null);
    	janelatext.setLocationRelativeTo(null);
    	janelatext.getContentPane().setBackground(new Color(173, 173, 173));
        texto.setBounds(25, 50, 330, 300);
        texto.setBackground(new Color(173, 173, 173));
        janelatext.add(texto);
        janelatext.setVisible(true);
    }
	public static void main(String[] args) {
		}
	}
