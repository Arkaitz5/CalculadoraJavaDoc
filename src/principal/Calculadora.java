package principal;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import logs.LogConsolaMasFichero;
import menu.Menu;
import operaciones.Operaciones;

/**
 * Calculadora main
 * 
 * @author Arkaitz Ortiz version 1.0
 *
 */

public class Calculadora {
	public static void main(String[] args) {
		final Logger LOGGER = Logger.getLogger(LogConsolaMasFichero.class.getName());
		int resultado = 0;
		String operacion = "";
		int[] operandos = new int[2];
		
		Handler consoleHandler = null;
	    Handler fileHandler  = null;
	    
		Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();
		
		try {
			 consoleHandler = new ConsoleHandler();
	         fileHandler  = new FileHandler("./operaciones0.log" , true);
	         LOGGER.addHandler(consoleHandler);
	         LOGGER.addHandler(fileHandler);
	         
	         consoleHandler.setLevel(Level.ALL);
	         fileHandler.setLevel(Level.ALL);
	         LOGGER.setLevel(Level.ALL);
	         LOGGER.removeHandler(consoleHandler);
	         LOGGER.log(Level.FINE, "Nivel de log cambiado a FINE");
	        LOGGER.finer("Ejemplo con log FINE en LOGGER completado.");
	        
		} 	catch (ArithmeticException | SecurityException | IOException e) {
			LOGGER.log(Level.WARNING, "No se puede dividir entre 0");
		}
		
		
		
		
		do {
			operandos = menu.pedirNumeros();
			operacion = menu.menuOpciones();
			
		        try { 
				if (operacion.equalsIgnoreCase("+")) {
					resultado = operaciones.sumar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE,"Suma, numero1: " + operandos[0] + ", numero2: " + operandos[1] ,  resultado);
				} else if (operacion.equalsIgnoreCase("-")) {
					resultado = operaciones.restar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE,"Resta, numero1: " + operandos[0] + ", numero2: " + operandos[1] ,  resultado);
				} else if (operacion.equalsIgnoreCase("*")) {
					resultado = operaciones.multiplicar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE,"Multiplicacion, numero1: " + operandos[0] + ", numero2: " + operandos[1] ,  resultado);
				} else if (operacion.equalsIgnoreCase("/")) {
					resultado = operaciones.dividir(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE,"Division, numero1: " + operandos[0] + ", numero2: " + operandos[1] ,  resultado);
					
				} else if (operacion.equalsIgnoreCase("%")) {
					resultado = operaciones.resto(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE,"Resto, numero1: " + operandos[0] + ", numero2: " + operandos[1] ,  resultado);
				} else {
					System.out.println("Operación no válida");
				}
				
				
		        }catch (ArithmeticException e) {
					LOGGER.log(Level.WARNING, "No se puede dividir entre 0");
				}
				
				
		

		} while (menu.repetir());
		consoleHandler.close();
		fileHandler.close();
	}
}
