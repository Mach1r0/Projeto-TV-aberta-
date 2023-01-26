package model;


public class Serie extends Programa {
	public Serie() {
		super();
	}

	private String quantidadep;

	public String getQuantidadep() {
		return quantidadep;
	}

	public void setQuantidadep(String quantidadep) {
		this.quantidadep = quantidadep;
	}
	
	@Override
	public String toString() {
		return "Quantidade de ep: " + this.quantidadep;
	}

}