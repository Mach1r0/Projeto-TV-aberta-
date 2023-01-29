package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.CanalController;
import dao.ExceptionDAO;
import model.Canal;

public class ConsultaCanal extends JFrame implements ActionListener, MouseListener{
    private JLabel lblCanal = new JLabel("Consultar canal:");
    private JTextField txtCanal = new JTextField();
    private JButton btnConsultar = new JButton("Consultar");
    private JTable tabela;
    private CadastroCanal cadastro;
    private DefaultTableModel modelo = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int linha, int coluna) {
			return false;
		}
	};
    

    public ConsultaCanal() {
    	
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        
        // Adicione as colunas para a tabela
        btnConsultar.addActionListener(this);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        tabela = new JTable(modelo);
        tabela.addMouseListener(this);
        
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(10, 80, 560, 400);
        add(scroll);

        lblCanal.setBounds(10, 10, 150,50);
        txtCanal.setBounds(120, 25, 200, 25);
        btnConsultar.setBounds(330, 25, 150, 25);

        add(lblCanal);
        add(txtCanal);
        add(btnConsultar);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        new ConsultaCanal();
    }

    public void consultaCanal(java.awt.event.ActionEvent evt) {
    	String nome = txtCanal.getText();
    	DefaultTableModel tabelaModel = (DefaultTableModel) tabela.getModel();
    	tabelaModel.setRowCount(0);
    	CanalController controle = new CanalController();
    	try {
    		ArrayList <Canal> canais = controle.listarCanais(nome);
    		canais.forEach((Canal canal) -> {
    			tabelaModel.addRow(new Object [] {canal.getCodcanal(),
    											  canal.getNome()});
			});
    		tabela.setModel(tabelaModel);
		} catch(ExceptionDAO e) {
			Logger.getLogger(CadastroCanal.class.getName()).log(null, null, e);;
		}
	}
    	public void canalTableMouseClicked(java.awt.event.MouseEvent evt) {
		if(evt.getClickCount() == 2) {
			Integer codCanal = (Integer) tabela.getModel().getValueAt(tabela.getSelectedRow(), 0);
			String nome = (String) tabela.getModel().getValueAt(tabela.getSelectedRow(), 1);
			
			cadastro = new CadastroCanal();
			this.cadastro.buscarCanal(codCanal, nome);
			this.cadastro.setVisible(true);
			this.dispose();
			
		} 
	}
    @Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == btnConsultar) {
			consultaCanal(e);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object src = e.getSource();
		if(src == tabela) {
			canalTableMouseClicked(e);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}