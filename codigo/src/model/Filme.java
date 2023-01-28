package model;

public class Filme extends Programa {
	private String diretor;

	public  Filme(String n, String d, String r, String h, String ds, int a, String di) {	
		this.titulo = n;
		this.duracao = d;
		this.resumo = r; 
		this.horario = h;
		this.diasemana = ds; 
		this.ano = a;
		this.diretor = di;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}	
	
}
