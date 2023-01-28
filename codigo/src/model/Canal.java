package model;

// classe 

public class Canal {
	private String nome;
	private String horario;
	private String dia;
// construtor 
	
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

	public void cadastroCanal() {
		
	}
}
