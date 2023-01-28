package Controller;
import model.Canal;


public class CanalController {
	public boolean cadastroCanal(String nome) {
		if(nome != null && nome.length() > 0 ) {
			Canal canal = new Canal(nome, null, null);
			canal.cadastroCanal(canal);
		return true;	
		}
		return false;
	}
}
