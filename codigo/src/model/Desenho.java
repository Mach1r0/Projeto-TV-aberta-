package model;

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
//gets e sets 
		public String getIdademin() {
			return idademin;
		}

		public void setIdademin(String idademin) {
			this.idademin = idademin;
		}
		public void cadastroPrograma(Desenho desenho) throws Exception {
			//new DesenhoDAO().cadastrarPrograma(desenho);			
		}
		
		@Override
		public String toString() {
			return "Titulo: " + titulo + ", duração:" + duracao + ", Horario: " + horario +
					   ", diasemana: " + diasemana + ", ano:" + ano;
		}

}