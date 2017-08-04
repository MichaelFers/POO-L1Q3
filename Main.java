package Q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Poligono p1 = new Poligono();
		p1.addPonto2(new Ponto(0,0));
		p1.addPonto2(new Ponto(1,1));
		p1.addPonto2(new Ponto(2,2));
		p1.addPonto2(new Ponto(3,3));
		p1.addPonto2(new Ponto(4,4));
		p1.addPonto2(new Ponto(5,5));
		
		System.out.println(p1.calcularArea2());
	}
}
