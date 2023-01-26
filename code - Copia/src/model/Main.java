package model;

public class Main {
	 static Canal c;
	 static Desenho d;
	 static Serie s;
	
	 public static void main(String[] args) {
		c = new Canal("Ratinho", 15, "humoristico", 11);
		d = new Desenho();
		d.setIdademin("14 anos");
		s = new Serie();
		s.setQuantidadep("quantidade de episodeos: 2 temp de 24 ep");
		s.setResumo("Resumo: Ratinho é um programa legal");
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(s.getResumo());	
		System.out.println(s.getQuantidadep());	
		}
}