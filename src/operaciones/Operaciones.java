package operaciones;

/**
 * operaciones
 * 
 * @author Arkaitz_Ortiz version 1.0
 */

public class Operaciones {

	/**
	 * Operacion_Sumar
	 * 
	 * @param valor1 Primer_numero_introducido
	 * @param valor2 Segundo_numero_introducido
	 * @param numero
	 * @return numero Devuelve la suma de los valores
	 */

	public int sumar(int valor1, int valor2) {
		int numero;
		numero = valor1 + valor2;
		return numero;
	}

	/**
	 * Operacion Restar
	 * 
	 * @param valor1 Primer_numero_introducido
	 * @param valor2 Segundo_numero_introducido
	 * @param numero
	 * @return numero Devuelve la suma de los valores
	 */

	public int restar(int valor1, int valor2) {
		int numero;
		numero = valor1 - valor2;
		return numero;
	}

	/**
	 * Operacion Multiplicar
	 * 
	 * @param valor1 Primer_numero_introducido
	 * @param valor2 Segundo_numero_introducido
	 * @param numero
	 * @return numero Devuelve la suma de los valores
	 */

	public int multiplicar(int valor1, int valor2) {
		int numero;
		numero = valor1 * valor2;
		return numero;
	}

	/**
	 * Operacion Dividir
	 * 
	 * @throws ArithmeticException Devuelve la excepcion 0/0
	 * @param valor1 Primer_numero_introducido
	 * @param valor2 Segundo_numero_introducido
	 * @param numero
	 * @return numero Devuelve la suma de los valores
	 */
	public int dividir(int valor1, int valor2) throws ArithmeticException {
		int numero;
		numero = valor1 / valor2;
		return numero;
	}

	/**
	 * Operacion Resto
	 * 
	 * @param valor1 Primer_numero_introducido
	 * @param valor2 Segundo_numero_introducido
	 * @param numero
	 * @return numero Devuelve la suma de los valores
	 */
	public int resto(int valor1, int valor2) {
		int numero;
		numero = valor1 % valor2;
		return numero;
	}
}