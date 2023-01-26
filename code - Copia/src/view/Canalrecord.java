package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Canalrecord implements ActionListener{
	 JFrame JanelaRecord = new JFrame("Canal Record");
	 JButton btodomun = new JButton("Todo Mundo Odeia o Chris");
	 JButton bpicapau = new JButton("Pica-pau e seus amigos");
	
	public Canalrecord() {
		JanelaRecord.setVisible(true);
		JanelaRecord.setSize(600, 500);	
		JanelaRecord.setLayout(null);
		JanelaRecord.setLocationRelativeTo(null);
		JanelaRecord.setResizable(false);		
		btodomun.setBounds(0, 50, 150, 50);
		btodomun.setFont(new Font("Arial",Font.BOLD, 20));
		JanelaRecord.add(btodomun);
		bpicapau.setBounds(-20, 150, 280, 50);
		bpicapau.setFont(new Font("Arial",Font.BOLD, 20));
		bpicapau.setForeground(new Color(220,220,220));
		bpicapau.setBackground(new Color(0, 0, 0));
		JanelaRecord.add(bpicapau);
		btodomun.addActionListener(this);
		bpicapau.addActionListener(this);

	}
	

	public static void main(String[] args) {
							new Canalrecord();
}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bpicapau) {
			JanelaRecord.dispose();
		    new Prpicapau();
		}
		else if (e.getSource() == btodomun) {
			JanelaRecord.dispose();
		    new Prchris();
		}
		
	}
}
