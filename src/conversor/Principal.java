package conversor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String[] opcionSalir = { "si", "no" };
		String[] opcionesMenu = { "Conversor de Moneda", "Conversor Decimal <-> Binario" };
		String[] tipoDeConversion = { "PesoMX a Dolar", "PesoMX a Euro", "PesoMX a Libras Esterlinas",
				"PesoMX a Yen Japones", "PesoMX a Won sur-coreano", "Dolar a PesoMX", "Euro a PesoMX",
				"Libra Esterlina a PesoMX", "Yen Japones a PesoMX", "Won sur-coreano a PesoMX" };
		String[] tipoDeSistema = { "Decimal a Binario", "Binario a Decimal" };

		double cantidad, resultado;
		int binario = 0, decimal = 0;
		String res;
		int salir = 1;

		String opcion = (String) JOptionPane.showInputDialog(null, "¿Qué desea convertir?", "Selecciones una opción",
				JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, opcionesMenu[0]);
		System.out.println(opcion);

		while (salir == 1) {
			try {
				switch (opcion) {
				case "Conversor de Moneda":
					String tipo = (String) JOptionPane.showInputDialog(null, "¿Qué tipo de conversion necesita?",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, tipoDeConversion,
							tipoDeConversion[0]);
					System.out.println(opcion);
					switch (tipo) {
					case "PesoMX a Dolar":
						cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
								"Ingrese la cantidad a convertir", "PesoMX a Dolar", JOptionPane.QUESTION_MESSAGE));
						resultado = pesoDolar(cantidad);
						JOptionPane.showMessageDialog(null, cantidad + " pesos es igual a " + resultado + " dolar");
						System.out.println(resultado);
						break;

					case "PesoMX a Euro":
						cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
								"Ingrese la cantidad a convertir", "PesoMX a Euro", JOptionPane.QUESTION_MESSAGE));
						resultado = pesoEuro(cantidad);
						JOptionPane.showMessageDialog(null, cantidad + " pesos es igual a " + resultado + " euro");
						System.out.println(resultado);
						break;
					case "PesoMX a Libras Esterlinas":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"PesoMX a Libra Esterlina", JOptionPane.QUESTION_MESSAGE));
						resultado = pesoLibra(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " pesos es igual a " + resultado + " libra esterlina");
						System.out.println(resultado);
						break;
					case "PesoMX a Yen Japones":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"PesoMX a Yen Japones", JOptionPane.QUESTION_MESSAGE));
						resultado = pesoYen(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " pesos es igual a " + resultado + " yen japonés");
						System.out.println(resultado);
						break;
					case "PesoMX a Won sur-coreano":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"PesoMX a Won sur-coreano", JOptionPane.QUESTION_MESSAGE));
						resultado = pesoWon(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " pesos es igual a " + resultado + " won sur-corano");
						System.out.println(resultado);
						break;

					case "Dolar a PesoMX":
						cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
								"Ingrese la cantidad a convertir", "Dolar a PesoMX", JOptionPane.QUESTION_MESSAGE));
						resultado = dolarPeso(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " dolar es igual a " + resultado + " pesos mexicanos");
						System.out.println(resultado);
						break;
					case "Euro a PesoMX":
						cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,
								"Ingrese la cantidad a convertir", "Euro a PesoMX", JOptionPane.QUESTION_MESSAGE));
						resultado = euroPeso(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " euro es igual a " + resultado + " pesos mexicanos");
						System.out.println(resultado);
						break;
					case "Libra Esterlina a PesoMX":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"Libra Esterlina a PesoMX", JOptionPane.QUESTION_MESSAGE));
						resultado = libraPeso(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " libra esterlina es igual a " + resultado + " pesos mexicanos");
						System.out.println(resultado);
						break;
					case "Yen Japones a PesoMX":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"Yen japonés a PesoMX", JOptionPane.QUESTION_MESSAGE));
						resultado = yenPeso(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " yen japonés es igual a " + resultado + " pesos mexicanos");
						System.out.println(resultado);
						break;
					case "Won sur-coreano a PesoMX":
						cantidad = Double
								.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
										"Won sur-coreano a PesoMX", JOptionPane.QUESTION_MESSAGE));
						resultado = wonPeso(cantidad);
						JOptionPane.showMessageDialog(null,
								cantidad + " won sur-coreano es igual a " + resultado + " pesos mexicanos");
						System.out.println(resultado);
						break;

					}
					salir = JOptionPane.showOptionDialog(null, "¿Desea salir del conversor?", "Selecciones una opción",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionSalir,
							opcionSalir[0]);
					break;
				case "Conversor Decimal <-> Binario":
					String sistema = (String) JOptionPane.showInputDialog(null, "¿Qué tipo de conversion necesita?",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, tipoDeSistema,
							tipoDeSistema[0]);
					System.out.println(opcion);

					switch (sistema) {
					case "Decimal a Binario":
						decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
								"Decimal a Binario", JOptionPane.QUESTION_MESSAGE));
						res = decimalBinario(decimal);
						JOptionPane.showMessageDialog(null, decimal + " a binario es: " + res);
						System.out.println(res);
						break;
					case "Binario a Decimal":
						binario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir",
								"Binario a Decimal", JOptionPane.QUESTION_MESSAGE));
						res = binarioDecimal(binario);
						JOptionPane.showMessageDialog(null, binario + " a decimal es: " + res);
						System.out.println(res);
						break;

					}

					salir = JOptionPane.showOptionDialog(null, "¿Desea salir del conversor?", "Selecciones una opción",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionSalir,
							opcionSalir[0]);
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null, "Programa Terminado");

	}

	// Conversiones de pesos a...

	public static double pesoDolar(double peso) {
		double resultado = 0;
		resultado = peso * 0.054;
		return resultado;
	}

	public static double pesoEuro(double peso) {
		double resultado = 0;
		resultado = peso * 0.051;
		return resultado;
	}

	public static double pesoLibra(double peso) {
		double resultado = 0;
		resultado = peso * 0.045;
		return resultado;
	}

	public static double pesoYen(double peso) {
		double resultado = 0;
		resultado = peso * 7.42;
		return resultado;
	}

	public static double pesoWon(double peso) {
		double resultado = 0;
		resultado = peso * 71.79;
		return resultado;
	}

	// Conversiones a pesos

	public static double dolarPeso(double peso) {
		double resultado = 0;
		resultado = peso * 18.38;
		return resultado;
	}

	public static double euroPeso(double peso) {
		double resultado = 0;
		resultado = peso * 19.46;
		return resultado;
	}

	public static double libraPeso(double peso) {
		double resultado = 0;
		resultado = peso * 22.14;
		return resultado;
	}

	public static double yenPeso(double peso) {
		double resultado = 0;
		resultado = peso * 0.13;
		return resultado;
	}

	public static double wonPeso(double peso) {
		double resultado = 0;
		resultado = peso * 0.014;
		return resultado;
	}

	// Convertidor binario

	public static String decimalBinario(int decimal) {
		String bin = "";
		double aux;
		while (decimal != 0) {
			aux = decimal % 2;
			if (aux == 0) {
				bin = "0" + bin;
			} else {
				bin = "1" + bin;
			}
			decimal = decimal / 2;
		}
		return bin;
	}

	public static String binarioDecimal(int binario) {
		String bin = String.valueOf(binario);
		double dec = 0;
		int tamano = bin.length();
		System.out.println(tamano);
		int j = 0;
		for (int i = (tamano - 1); i >= 0; i--) {

			System.out.println(i);
			System.out.println(bin.charAt(j));
			if (bin.charAt(j) == '1') {
				dec = dec + (1 * Math.pow(2, i));
			}
			j++;
		}

		return String.valueOf((int) dec);
	}

}
