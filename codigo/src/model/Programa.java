package model;
// nome classe 
	public abstract class Programa {
	// atributos
	protected String titulo;
	protected String horario; 
	protected String diasemana;
	protected String resumo;
	protected String genero;
	protected int ano;
	protected String duracao;
public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	// metodos gets e sets
	public Programa() {
		super();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario){
		this.horario = horario;
	}
	public String getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public void CadastrarPrograma() {
		
	}
	
}