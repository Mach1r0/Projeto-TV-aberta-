package model;


public class Serie extends Programa {

	public Serie(String n, String d, String r, String h, String qp) {
		this.titulo = n;
		this.duracao = d;
		this.resumo = r; 
		this.horario = h;
		this.quantidadep = qp;
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
			return "Titulo: " + titulo + ", duração:" + duracao + ", Horario: " + horario +
					   ", dia semana: " + diasemana + ", ano:" + ano +", Quantidade de ep:" + quantidadep;
	}

}