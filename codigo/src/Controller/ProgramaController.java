package Controller;

import model.Desenho;

public class ProgramaController{

	public boolean cadastrarDesenho(String titulo, String genero, String resumo, Integer horario) {
    if(titulo != null && titulo.length() > 0 && genero != null && resumo != null && resumo.length() > 0 && horario != null ) {
        Desenho desenho = new Desenho(titulo, genero, resumo, null, null, horario);
        desenho.CadastrarPrograma();
        return true;
    }
    return false;
}
}