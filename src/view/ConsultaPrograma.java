package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrograma extends JFrame implements ActionListener{
    private JLabel lblPrograma= new JLabel("Consultar Programa:");
    private JTextField txtPrograma= new JTextField();
    private JButton btnConsultar = new JButton("Consultar");
    private JTable tabela;
    private DefaultTableModel modelo;
    private CadastroCanal cadastrocanal;

    public ConsultaPrograma() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // Adicione as colunas para a tabela
        String[] colunas = {"Codigo", "Titulo","Genero", "Resumo", "Canal"};
        modelo = new DefaultTableModel(colunas, 0);
        
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(10, 80, 580, 400);
        add(scroll);

        lblPrograma.setBounds(10, 10, 200,50);
        txtPrograma.setBounds(120, 25, 200, 25);
        btnConsultar.setBounds(330, 25, 150, 25);

        add(lblPrograma);
        add(txtPrograma);
        add(btnConsultar);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new  ConsultaCanal();
    }

    public void ConsultaFilme(java.awt.event.ActionEvent evt) {
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}