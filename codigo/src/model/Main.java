package model;

public class Main {
	 static Canal c;
	 static Desenho d;
	 static Serie s;
	
	 public static void main(String[] args) {
		c = new Canal("Ratinho", "15", "humoristico", "13");
		d = new Desenho("Caio", "Doan feio ", "Erick lindo ", "Isaque bonito ", "Nekotina", 11);
		s = new Serie("ratinho", "2 horas", "12:20", "Quarta feira", 2012, "12 temporadas e 20 episodeos");
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(s.toString());	
		}
}