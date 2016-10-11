package pckTest;


import pckPolinomio.Polinomio;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class TestPolinomio {
	/*
		// EVALUAR M SUCESIVAS
		@Test
		public void casoPolinomioIncompletoConEvaluarMSucesivas() {
			pckPolinomio.Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConEvaluarMSucesivas:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio1ConEvaluarMSucesivas() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo1.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio1ConEvaluarMSucesivas:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo1.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio2ConEvaluarMSucesivas() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo2.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio2ConEvaluarMSucesivas:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo2.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio3ConEvaluarMSucesivas() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo3.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio3ConEvaluarMSucesivas:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			
			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo3.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		// EvaluarRecursiva
		@Test
		public void casoPolinomioIncompletoConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConevaluarRecursiva:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));
			
			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio1ConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo1.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio1ConevaluarRecursiva:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo1.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio2ConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo2.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio2ConevaluarRecursiva:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo2.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomio3ConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/polinomioLargo3.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomio3ConevaluarRecursiva:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/polinomioLargo3.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioIncompletoConevaluarRecursivaPar() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursivaPar(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConevaluarRecursivaPar:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioIncompletoConevaluarProgDinamica() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarProgDinamica(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConevaluarProgDinamica:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioIncompletoConevaluarPow() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarPow(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConevaluarPow:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioIncompletoConevaluarHorner() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.0.PolinomioIncompleto.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarHorner(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioIncompletoConevaluarHorner:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.0.PolinomioIncompleto.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioConTerminoIndependienteConEvaluarMSucesivas() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConEvaluarMSucesivas:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependiente:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarRecursivaPar() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursivaPar(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConevaluarRecursivaPar:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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
*/
		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarProgDinamica() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarProgDinamica(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConevaluarProgDinamica:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarMejorada() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMejorada(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConevaluarMejorada:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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
/*
		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarPow() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarPow(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConevaluarPow:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioConTerminoIndependienteConevaluarHorner() {
			Polinomio pol1 = new Polinomio(
					"./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.1.PolinomioConTerminoIndependiente.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarHorner(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioConTerminoIndependienteConevaluarHorner:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(new File(
						"./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.1.PolinomioConTerminoIndependiente.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioEvaluado0ConEvaluarMSucesivas() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.2.PolinomioEvaluado0.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarMSucesivas(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioEvaluado0ConEvaluarMSucesivas:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.2.PolinomioEvaluado0.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioEvaluado0ConevaluarRecursiva() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.2.PolinomioEvaluado0.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarRecursiva(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioEvaluado0:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.2.PolinomioEvaluado0.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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
*/
		@Test
		public void casoPolinomioEvaluado0ConevaluarProgDinamica() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.2.PolinomioEvaluado0.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarProgDinamica(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioEvaluado0ConevaluarProgDinamica:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.2.PolinomioEvaluado0.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioEvaluado0ConevaluarPow() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.2.PolinomioEvaluado0.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarPow(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println(
					"T.Ejecucion casoPolinomioEvaluado0ConevaluarPow:" + (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.2.PolinomioEvaluado0.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

		@Test
		public void casoPolinomioEvaluado0ConevaluarHorner() {
			Polinomio pol1 = new Polinomio("./Preparacion de Prueba/Lote de Prueba/Entrada/Caso0.2.PolinomioEvaluado0.in");
			
			Calendar tIni = new GregorianCalendar();
			double resActual = pol1.evaluarHorner(0.01);
			Calendar tFin = new GregorianCalendar();
			
			System.out.println("T.Ejecucion casoPolinomioEvaluado0ConevaluarHorner:"
					+ (tFin.getTimeInMillis() - tIni.getTimeInMillis()));

			Scanner sc = null;
			try {
				sc = new Scanner(
						new File("./Preparacion de Prueba/Lote de Prueba/SalidaEsperada/Caso0.2.PolinomioEvaluado0.out"));
				double resEsperado = sc.nextDouble();
				sc.useLocale(Locale.ENGLISH);
				Assert.assertTrue(resActual == resEsperado);
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

}
