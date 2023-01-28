package Controller;
import model.Filme;

public class FilmeController {
	
		public boolean cadastrarSerie(String titulo, String genero, String resumo, Integer horario, String diretor) {
	    if(titulo != null && titulo.length() > 0 && genero != null && resumo != null && resumo.length() > 0 && horario != null && diretor != null && diretor.length() > 0) {
	        Filme filme = new Filme(titulo, genero, resumo, null, diretor, horario, null);
	        filme.CadastrarPrograma();
	        return true;
	    }
	    return false;
	    }
	}
