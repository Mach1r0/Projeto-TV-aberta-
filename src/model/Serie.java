package model;

import dao.SerieDAO;


public class Serie extends Programa {

	public Serie(String n, String d, String r, String h, String qp) {
		this.titulo = n;
		this.duracao = d;
		this.resumo = r; 
		this.horario = h;
		this.quantidadep = qp;
	}

	public int getCodDesenho() {
		return CodDesenho;
	}

	public void setCodDesenho(int codDesenho) {
		CodDesenho = codDesenho;
	}

	private String quantidadep;
	private int CodDesenho;

	public String getQuantidadep() {
		return quantidadep;
	}

	public void setQuantidadep(String quantidadep) {
		this.quantidadep = quantidadep;
	}
	public void cadastroPrograma(Serie serie) throws Exception {
		new SerieDAO().cadastrarSerie(serie);
	}
	@Override
	public String toString() {
			return "Titulo: " + titulo + ", duração:" + duracao + ", Horario: " + horario +
					   ", dia semana: " + diasemana + ", ano:" + ano +", Quantidade de ep:" + quantidadep;
	}

}