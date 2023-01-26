package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Canalglobo implements ActionListener{
	JFrame janelac = new JFrame("Canal Globo");
	JButton tv = new JButton("Tvglobinho");
	JButton jornal = new JButton("Jornal Hoje");
	public Canalglobo() {
		janelac.setVisible(true);
		janelac.setSize(600, 500);	
		janelac.setLayout(null);
		janelac.setLocationRelativeTo(null);
		janelac.setResizable(false);
		tv.setBounds(0, 50, 150, 50);
		tv.setFont(new Font("Arial",Font.BOLD, 20));
		tv.setForeground(new Color(220,220,220));
		tv.setBackground(new Color(0, 0, 0));
		janelac.add(tv);
		jornal.setBounds(0, 150, 150, 50);
		jornal.setFont(new Font("Arial",Font.BOLD, 20));
		jornal.setForeground(new Color(220,220,220));
		jornal.setBackground(new Color(0, 0, 0));
		janelac.add(jornal);
		tv.addActionListener(this);
		jornal.addActionListener(this);
			
	}
	public static void main(String[] args) {
		new Canalglobo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tv) {
			    new PgTv();
			}
			else if (e.getSource() == jornal) {
			    janelac.dispose();
			    new Pgjornal();
			}		
	}
}
