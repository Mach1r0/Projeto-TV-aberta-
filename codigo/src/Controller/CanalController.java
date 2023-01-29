package Controller;

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
}
