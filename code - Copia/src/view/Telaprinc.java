package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class Telaprinc implements ActionListener{
		 private JButton record = new JButton("Record");
		 private JButton sbt = new JButton("Sbt");
		 private JButton globo = new JButton("Globo");
		 private JFrame janelap = new JFrame("Tela Principal");
		 private JButton band = new JButton("Band");
		 private JButton cadastrar = new JButton("Cadastrar");
		////////// criando o frame
			public Telaprinc() {
			janelap.setVisible(true);
			janelap.setSize(500, 400);	
			janelap.setLayout(null);
			janelap.setLocationRelativeTo(null);
			janelap.setResizable(false);
			///////// botão globo	
			globo.setBounds(0, 100, 150, 50);
			globo.setFont(new Font("Arial",Font.BOLD, 20));
			globo.setForeground(new Color(0,0,0));
			globo.setBackground(new Color(220, 220, 220));
			janelap.add(globo);
			//////// botão record 
			record.setBounds(0, 50, 150, 50);
			record.setFont(new Font("Arial",Font.BOLD, 20));
			record.setForeground(new Color(0,0,0));
			record.setBackground(new Color(220,220,220));
			janelap.add(record);
			//////// botão Band
			band.setBounds(0, 150, 150, 50);
			band.setFont(new Font("Arial",Font.BOLD, 20));
			band.setForeground(new Color(0,0,0));
			band.setBackground(new Color(220,220,220));
			janelap.add(band);
			//////// botão Sbt
			sbt.setBounds(00, 200, 150, 50);
			sbt.setFont(new Font("Arial",Font.BOLD, 20));
			sbt.setForeground(new Color(0,0,0));
			sbt.setBackground(new Color(220,220,220));
			janelap.add(sbt);
			globo.addActionListener(this);
			sbt.addActionListener(this);
			band.addActionListener(this);
			cadastrar.addActionListener(this);
			record.addActionListener(this);
			//////////////////////////// botão cadastrar 
			cadastrar.setBounds(0, 250, 150, 50);
			cadastrar.setFont(new Font("Arial",Font.BOLD, 20));
			cadastrar.setForeground(new Color(0,0,0));
			cadastrar.setBackground(new Color(220, 220, 220));
			janelap.add(cadastrar);
}

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == record) {
				    new Canalrecord();
				}
				else if (e.getSource() == sbt) {
				    new Canalsbt();
				}
				else if (e.getSource() == globo) {
				    new Canalglobo();
				}
				else if (e.getSource() == band) {
				    new Canalband();
				}
				else if (e.getSource() == cadastrar) {
				    new CadastroCanal();
				}
			}
		public static void main(String[] args) {
								new Telaprinc();
	}
	}
	