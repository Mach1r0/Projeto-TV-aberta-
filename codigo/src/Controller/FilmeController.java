package Controller;
import model.Filme;

public class FilmeController {
	
		public boolean cadastrarFilme(String titulo, String genero, String resumo, String  horario, String diretor) {
	    if(titulo != null && titulo.length() > 0 && genero != null && resumo != null && resumo.length() > 0 && horario != null && diretor != null && diretor.length() > 0) {
	        Filme filme = new Filme(titulo, genero, resumo,  horario, diretor);
	        filme.CadastrarPrograma();
	        return true;
	    }
	    return false;
	    }

		}
	
