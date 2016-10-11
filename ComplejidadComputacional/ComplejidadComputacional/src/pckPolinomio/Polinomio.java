package pckPolinomio;


import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Polinomio {

		private double[] coeficientes;
		private int grado;

		public Polinomio(String ruta) {
			Locale.setDefault(new Locale("en", "us"));
			Scanner sc = null;
			try {
				sc = new Scanner(new File(ruta));
				this.grado = sc.nextInt();
				if (sc.hasNext()) {
					this.coeficientes = new double[this.grado + 1];
					this.coeficientes[this.grado] = sc.nextDouble();
				}
				while (sc.hasNext()) {
					this.coeficientes[sc.nextInt()] = sc.nextDouble();
				}
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					sc.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

		public double evaluarMSucesivas(double x) { // O(no)
			double acum = 0;
			for (int i = 0; i < this.coeficientes.length; i++) {
				if (this.coeficientes.length != 0) {
					double multSuc = 1;
					for (int j = 0; j < i; j++) {
						multSuc *= x;
					}
					acum += (multSuc * this.coeficientes[i]);
				}
			}
			return acum;
		}

		public double evaluarRecursiva(double x) { // O(no)
			double acum = 0;
			for (int i = 0; i < coeficientes.length; i++) {
				acum += (this.coeficientes[i] * this.potencia(x, i));
			}
			return acum;
		}

		public double potencia(double x, int n) {
			double res = 0;
			if (n > 1) {
				res = x * potencia(x, n - 1);
			}
			if (n == 1)
				res = x;
			if (n == 0)
				res = 1;
			return res;
		}

		public double evaluarRecursivaPar(double x) { // O(no)
			double acum = 0;
			for (int i = 0; i < coeficientes.length; i++)
				acum += (this.coeficientes[i] * this.potenciaPar(x, i));
			return acum;
		}

		public double potenciaPar(double x, int n) {
			double res = 0;
			if (n % 2 == 0)
				if (n == 0)
					res = 1;
				else
					res = potenciaPar(x * x, n - 1);
			else
				res = x * potenciaPar(x, n - 1);
			return res;
		}

		public double evaluarProgDinamica(double x) { // O(n)
			double acum = 0;
			double[] vectorPotencia = new double[this.coeficientes.length];
			for (int i = 0; i < vectorPotencia.length; i++) {
				vectorPotencia[i] = 0;
			}
			acum = this.coeficientes[0];
			vectorPotencia[0]= 1;
			for (int i = 1; i < coeficientes.length; i++) {
				vectorPotencia[i] = x * vectorPotencia[i-1];
							
				acum += this.coeficientes[i] * vectorPotencia[i];
			}
			return acum;
		}

		public double evaluarMejorada(double x) { // O(n)
			double xn = 1.0;
			double result = this.coeficientes[0];
			for (int i = 1; i < coeficientes.length; i++) {
				xn*=x;
				result+=this.coeficientes[i]*xn;
			}
			return result;
		}

		public double evaluarPow(double x) { // O(1)
			double acum = 0;
			for (int i = 0; i < coeficientes.length; i++) {
				acum += this.coeficientes[i] * Math.pow(x, i);
			}
			return acum;
		}

		public double evaluarHorner(double x) { // O(n)
			double acum = 0;
			for (int i = this.coeficientes.length - 1; i >= 0; i--) {
				acum = acum * x + this.coeficientes[i];
			}
			return acum;
		}

		public void main (String args){
		}
}
