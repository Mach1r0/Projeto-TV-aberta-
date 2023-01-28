package Controller;

import model.Canal;

public class CanalController {
	public boolean cadastroCanal(String nome) {
		if(nome != null && nome.length() > 0 ) {
			Canal canal = new Canal(nome);
			canal.cadastroCanal();
		return true;	
		}
		return false;
	}
}
