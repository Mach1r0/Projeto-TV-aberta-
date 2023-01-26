package model;

public class Desenho  extends Programa {
//construtor
		public Desenho() {	
			super();
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
			return "Idade minima para assistir: " + this.idademin;
		}

}