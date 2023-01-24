package menu;

/**
 * menu
 * 
 * @author Arkaitz_Ortiz version 1.0
 */

import java.util.Scanner;

public class Menu {
	private static Scanner teclado = new Scanner(System.in);

	/**
	 * menu Pedirnumeros
	 * @param ret Guarda el primer valor
	 * @param ret Guarda el segundo valor
	 * 
	 * @return ret Devuelve los valores
	 */

	public int[] pedirNumeros() {
		int[] ret = new int[2];
		System.out.print("Operando 1: ");
		ret[0] = teclado.nextInt();
		System.out.print("Operando 2: ");
		ret[1] = teclado.nextInt();
		return ret;
	}

	/**
	 * Escribir operacion deseada
	 * 
	 * @param ret
	 * @return ret
	 */

	public String menuOpciones() {
		String ret = "";
		do {
			System.out.print("Operaciones [+, -, *, /, %]: ");
			ret = teclado.next();
		} while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) || (ret.equalsIgnoreCase("*"))
				|| (ret.equalsIgnoreCase("/")) || (ret.equalsIgnoreCase("%"))));
		return ret;
	}

	/**
	 * @param ret
	 * @param String respuesta
	 * 
	 * @return ret
	 */
	public boolean repetir() {
		boolean ret = false;
		String respuesta;
		do {
			System.out.print("¿Desea continuar trabajando con la calculadora? [s / n]");
			respuesta = teclado.next();
		} while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))));

		if (respuesta.equalsIgnoreCase("s")) {
			ret = true;
		}
		return ret;
	}
}