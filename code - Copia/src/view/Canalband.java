package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Canalband implements ActionListener{
	JFrame janelab = new JFrame("Canal Band");
	JButton donos = new JButton("Donos da bola ");
	JButton chef = new JButton("Master chef");
	private JButton cadastrar = new JButton("Cadastrar");

	public Canalband(){
		//////////////////// jframe
		janelab.setVisible(true);
		janelab.setSize(600, 500);	
		janelab.setLayout(null);
		janelab.setLocationRelativeTo(null);
		janelab.setResizable(false);
		//////////////////// botão donos
		donos.setBounds(0, 50, 150, 50);
		donos.setFont(new Font("Arial",Font.BOLD, 20));
		donos.setForeground(new Color(220,220,220));
		donos.setBackground(new Color(0, 0, 0));
		janelab.add(donos);
		//////////////////// botão chef
		chef.setBounds(0, 150, 150, 50);
		chef.setFont(new Font("Arial",Font.BOLD, 20));
		chef.setForeground(new Color(220,220,220));
		chef.setBackground(new Color(0, 0, 0));
		janelab.add(chef);
		//////////////////// botão cadastrar
		cadastrar.setBounds(0, 200, 150, 50);
		cadastrar.setFont(new Font("Arial",Font.BOLD, 20));
		cadastrar.setForeground(new Color(220,220,220));
		cadastrar.setBackground(new Color(0, 0, 0));
		janelab.add(cadastrar);
		cadastrar.addActionListener(this);
		donos.addActionListener(this);
		chef.addActionListener(this);
				
	}
    public static void main(String[] args) {
    	new Canalband();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == donos) {
			janelab.dispose();
		    new Pbdonos();
		}
		else if (e.getSource() == chef) {
		    janelab.dispose();
		    new Pbchef();
		}
		else if (e.getSource() == cadastrar) {
			    janelab.dispose();
			    new CadastroPrograma();
			    }
	}

}


