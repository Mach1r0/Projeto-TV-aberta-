package model;

// classe 

public class Canal {
	private String programa;
	private String horario;
	private String dia;
// construtor 
	
	public Canal(String p, String i,  String d) {
			programa = p;
			horario = i;
			dia = d;
	}
	
// atributos 
	
	public Canal() {
		
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
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	} 
// tostring
	@Override
	public String toString() {
		return "Programa: " + programa + ", Horario: " + horario +
			   ", Dia: " + dia;
	}

	public void cadastroCanal(Canal canal) {
		
	}
}
