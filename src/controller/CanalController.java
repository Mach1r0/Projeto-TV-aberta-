package controller;

import java.util.ArrayList;

import dao.ExceptionDAO;
import model.Canal;

public class CanalController {
	public boolean cadastroCanal(String nome) throws Exception {
		if(nome != null && nome.length() > 0 ) {
			Canal canal = new Canal(nome);
			canal.cadastroCanal(canal);
		return true;	
		}
		return false;
	}
	public ArrayList <Canal> listarCanais(String nome) throws ExceptionDAO{
		return new Canal().listarCanais(nome);
		
	}
	public boolean alterarCanal(int codCanal, String nome) throws Exception {
		if(nome != null && nome.length() > 0 ) {
			Canal canal = new Canal(nome);
			canal.setCodcanal(codCanal);
			canal.alterarCanal(canal);
		return true;	
		}
		return false;
	}
	public boolean excluirCanal(int codCanal) throws Exception{
		if (codCanal == 0)
			return false;
		else {
			Canal canal = new Canal();
			canal.setCodcanal(codCanal);
			canal.excluirCanal(canal);  
			return true;	
		}
	}
}
	