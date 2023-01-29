package model;

import dao.DesenhoDAO;

//import dao.DesenhoDAO;

public class Desenho  extends Programa {
//construtor
		public Desenho(String t, String r, String id, String h, String g) {	
			this.titulo = t;
			this.genero = g;
			this.resumo = r; 
			this.horario = h;
			this.idademin = id;
		}	
// atributos 		
		private String idademin;
		private int CodDesenho;



		public int getCodDesenho() {
			return CodDesenho;
		}

		public void setCodDesenho(int codDesenho) {
			CodDesenho = codDesenho;
		}

		//gets e sets 
		public String getIdademin() {
			return idademin;
		}

		public void setIdademin(String idademin) {
			this.idademin = idademin;
		}
		public void cadastroPrograma(Desenho desenho) throws Exception {
			new DesenhoDAO().cadastrarDesenho(desenho);
		}
		
		@Override
		public String toString() {
			return "Titulo: " + titulo + ", duração:" + duracao + ", Horario: " + horario +
					   ", diasemana: " + diasemana + ", ano:" + ano;
		}

}