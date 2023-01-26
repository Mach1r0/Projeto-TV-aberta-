package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Canalsbt implements ActionListener{
	JFrame janelasbt = new JFrame("Canal sbt");
	JButton silvio = new JButton("Programa Silvio Santos");
	JButton ratinho = new JButton("Programa do Ratinho");

	public Canalsbt() {
///////////// Jframe 
		janelasbt.setVisible(true);
		janelasbt.setSize(600, 500);	
		janelasbt.setLayout(null);
		janelasbt.setLocationRelativeTo(null);
		janelasbt.setResizable(false);
///////////// botão silvio santos 
		silvio.setBounds(0, 50, 150, 50);
		silvio.setFont(new Font("Arial",Font.BOLD, 20));
		silvio.setForeground(new Color(220,220,220));
		silvio.setBackground(new Color(0, 0, 0));
		janelasbt.add(silvio);
///////////// botão Ratinho
		ratinho.setBounds(-20, 150, 280, 50);
		ratinho.setFont(new Font("Arial",Font.BOLD, 20));
		ratinho.setForeground(new Color(220,220,220));
		ratinho.setBackground(new Color(0, 0, 0));
		janelasbt.add(ratinho);
		ratinho.addActionListener(this);
		silvio.addActionListener(this);

	}
    public static void main(String[] args) {
    	new Canalsbt();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == silvio) {
			janelasbt.dispose();
		    new Pssilvio();
		}
		else if (e.getSource() == ratinho) {
			janelasbt.dispose();
		    new Psratinho();
		}		
	}
}
