package model;

import java.util.ArrayList;

import dao.FilmeDAO;

public class Filme extends Programa {
	private String diretor;
	private int CodFilme;

	public int getCodFilme() {
		return CodFilme;
	}

	public void setCodFilme(int codFilme) {
		CodFilme = codFilme;
	}

	public Filme() {
		
	}

	public  Filme(String t, String d, String r, String h, String g) {	
		this.titulo = t;
		this.genero = g;
		this.resumo = r; 
		this.horario = h;
		this.diretor = d;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}	
	public void cadastroPrograma(Filme filme) throws Exception {
		new FilmeDAO().filmeCadastro(filme);
	}
	public ArrayList<Filme> listarFilmes(String nome) throws Exception{
		return new FilmeDAO().listarFilmes(nome);
		
	}
}
