package model;

import java.util.ArrayList;

import dao.CanalDAO;
import dao.ExceptionDAO;

// classe 

public class Canal {
	private String nome;
	private String horario;
	private String dia;
	private int Codcanal;
// construtor 
	public Canal() {
		
	}
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getCodcanal() {
		return Codcanal;
	}

	public void setCodcanal(int codcanal) {
		Codcanal = codcanal;
	}

	public Canal(String n) {
			nome  = n;
	}
	
// atributos 
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Nome Canal: " + nome;
	}

	public void cadastroCanal(Canal canal) throws Exception {
		new CanalDAO().cadastrarCanal(canal);
	}
	public ArrayList <Canal> listarCanais(String nome) throws ExceptionDAO{
		return new CanalDAO().listarCanais(nome);
	}
	public void alterarCanal(Canal canal) throws Exception {
		new CanalDAO().alterarCanal(canal);
	}
	public void excluirCanal(Canal canal) throws Exception{
		new CanalDAO().excluirCanal(canal);
	}
	
}
