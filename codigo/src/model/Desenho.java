package model;

public class Desenho  extends Programa {
//construtor
		public Desenho(String n, String d, String r, String h, String ds, int a) {	
			this.titulo = n;
			this.duracao = d;
			this.resumo = r; 
			this.horario = h;
			this.diasemana = ds; 
			this.ano = a;
		}	
// atributos 		
		private String idademin;
//gets e sets 
		public String getIdademin() {
			return idademin;
		}

		public void setIdademin(String idademin) {
			this.idademin = idademin;
		}
		
		@Override
		public String toString() {
			return "Titulo: " + titulo + ", duração:" + duracao + ", Horario: " + horario +
					   ", diasemana: " + diasemana + ", ano:" + ano;
		}

}