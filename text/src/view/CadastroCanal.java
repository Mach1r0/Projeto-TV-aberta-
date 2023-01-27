package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCanal extends JFrame implements ActionListener{
    JLabel Canal = new JLabel("Nome canal:");
    JTextField txtCanal = new JTextField();
    JButton Cadastrar = new JButton("Cadastrar");
    JLabel Titulo = new JLabel("Cadastro Canal");
    JButton Cancelar = new JButton("Cancelar");
    JButton Excluir = new JButton("Excluir");
    JButton Consultar = new JButton("Consultar");

    public CadastroCanal() {
        setSize(600, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        // Titulo
        Titulo.setBounds(230, 20, 200, 20);
        Titulo.setFont(new Font("Arial", Font.BOLD, 20));
        add(Titulo);
                              
        Canal.setBounds(80, 80, 100, 25);
        add(Canal);

        txtCanal.setBounds(155, 80, 200, 25);
        add(txtCanal);

        Cadastrar.setBounds(80, 120, 100, 25);
        add(Cadastrar);
        
        Excluir.setBounds(200, 120, 100, 25);
        add(Excluir);
        

        Cancelar.setBounds(320, 120, 100, 25);
        add(Cancelar);
        
        Consultar.setBounds(440, 120, 100, 25);
        add(Consultar);
        
        


        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroCanal();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		dropbox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JComboBox cb = (JComboBox)e.getSource();
		        String opcaoSelecionada = (String)cb.getSelectedItem();
		        if (opcaoSelecionada.equals("Série")) {
		            JTextArea txtSinopse = new JTextArea();
		            txtSinopse.setBounds(180, 400, 300, 120);
		            add(txtSinopse);
		            txtSinopse.setVisible(true);
		        }
		    }
		});

		
	}
}
