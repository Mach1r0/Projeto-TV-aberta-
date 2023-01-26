package model;

// classe 

public class Canal {
	private String programa;
	private String horario;
	private String genero;
	private String dia;
// construtor 
	
	public Canal(String p, String h, String g, String d) {
			programa = p;
			horario = h;
			genero = g;
			dia = d;
	}
	
// atributos 
	
	public Canal(String varPrograma, int i, String varGenero, int varDia) {
		
	}

	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	} 
// tostring
	@Override
	public String toString() {
		return "Programa: " + this.programa + ", Horario: " + this.horario +
			   ", Dia: " + this.dia + ", Genero: " + this.genero;
	}
}
