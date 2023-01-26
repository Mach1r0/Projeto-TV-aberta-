package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CadastroCanal extends JFrame  implements ActionListener{
    private JLabel Nome;
    private JTextField campoNome;
    private JButton botaoEnviar;
    private JLabel Programa;

    public CadastroCanal() {
        setLayout(new FlowLayout());

        Nome = new JLabel("Nome Canal:");
        add(Nome);
        campoNome = new JTextField(20);
        add(campoNome);

        botaoEnviar = new JButton("Enviar");
        
        add(botaoEnviar);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    	setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
    	new CadastroCanal();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}