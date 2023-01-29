package model;

public class Main {
	 static Canal c;
	 static Desenho d;
	 static Serie s;
	
	 public static void main(String[] args) {
		c = new Canal(null);
		d = new Desenho("Caio", "Doan feio ", "Erick lindo ", "Isaque bonito ", "Nekotina");
		s = new Serie("ratinho", "2 horas", "12:20", "Quarta feira", "12 temporadas e 20 episodeos");
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(s.toString());	
		}
}