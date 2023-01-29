package model;

public class Filme extends Programa {
	private String diretor;

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
	
}
