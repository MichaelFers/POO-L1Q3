package Q3;

import java.util.ArrayList;
import java.util.List;

public class Poligono {

	List<Ponto> pontos;
	Ponto[] ponts;
	int quant;

	public Poligono() {
		pontos = new ArrayList();
		ponts = new Ponto[6];
		quant = 0;
	}

	public void addPonto2(Ponto p) {

		ponts[quant] = p;
		quant++;
	}

	public void addPonto(Ponto p) {

		pontos.add(p);
	}

	public void removerPonto(Ponto p) {
		pontos.remove(p);
	}

	public List<Ponto> getPontos() {
		return pontos;
	}

	public double calcularArea2() {
		double soma = 0;

		for (int i = 0; i < quant-1; i++) {
			System.out.println(ponts[i].getX());
			soma += ponts[i].getX() * ponts[i+1].getY() - ponts[i+1].getX() * ponts[i].getY();
			//soma += x[i] * y[i + 1] - x[i + 1] * y[i];
			System.out.println(soma);
		}

		// soma += x*y[i+1]-x[i+1]*y;
		 soma /= 2;
		return soma;

	}

	public double calcularArea() {
		double soma = 0;

		int[] x = new int[6];
		int[] y = new int[6];

		for (int k = 0; k < 6; k++) {
			System.out.println(pontos.get(k).getX() + " " + pontos.get(k).getY());
			x[k] = pontos.get(k).getX();
			y[k] = pontos.get(k).getY();
		}
		for (int i = 0; i < 5; i++) {
			soma += x[i] * y[i + 1] - x[i + 1] * y[i];
			System.out.println(soma);
		}

		// soma += x*y[i+1]-x[i+1]*y;
		// soma /= 2;
		return soma;

	}

	@Override
	public String toString() {
		return "Poligono [pontos=" + pontos + "]";
	}

}
