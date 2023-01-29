package Controller;
import model.Serie;

public class SerieController {
	
		public boolean cadastrarSerie(String titulo, String genero, String resumo, String horario, String quantidadep) {
	    if(titulo != null && titulo.length() > 0 && genero != null && resumo != null && resumo.length() > 0 && horario != null && quantidadep != null && quantidadep.length() > 0) {
	        Serie serie = new Serie(titulo, genero, resumo, horario, quantidadep);
	        serie.CadastrarPrograma();
	        return true;
	    }
	    return false;
	    }
	}
