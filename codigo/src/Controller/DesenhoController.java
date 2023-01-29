package Controller;

import model.Desenho;


public class DesenhoController{

	public boolean cadastrarDesenho(String titulo, String genero, String resumo, String horario, String idademin) {
    if(titulo != null && titulo.length() > 0 && genero != null && resumo != null && resumo.length() > 0 && horario != null && idademin != null && idademin.length() > 0  ) {
        Desenho desenho = new Desenho(titulo, idademin, resumo, horario, genero);
        desenho.CadastrarPrograma();
        return true;
    }
    return false;
	  
}}