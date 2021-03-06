package corte1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Corte 1
		 * 
		 * M?tricas de software
		 * 
		 * Autores: JUAN CAMILO MAMIAN RUIZ, ALDEMAR BERNAL HERNANDEZ
		 * 
		 * UNIVERSIDAD LIBRE
		 * 
		 */

		// VARIABLES PARA MEDIR EL TIEMPO
		long inicio, fin, resultado;

		// MENSAJE EN PANTALLA
		System.out.println(
				"*************************************************************************************************************************************");
		System.out.println("* Programa que retorna cu?ntos "
				+ "pares hay en un arreglo de tama?o n, por ejemplo, a y b, que sumados estos dos dan un n?mero que es  * \n"
				+ "* divisible por el n?mero preguntado por pantalla. Por ejemplo, un arreglo de [1,2,3,4,5,6], y el                                   *\n"
				+ "* n?mero preguntado es 5, entonces las pares son [1,4] = 5, [2,3] = 5, [4,6]= 10, el resultado de                                   *\n"
				+ "* la suma de los pares dan un n?mero que es divisible con el n?mero preguntado en pantalla.                                         *");
		System.out.println(
				"*************************************************************************************************************************************");

		// ENTRADA DEL TECLADO
		Scanner entradaTeclado = new Scanner(System.in);

		// GUARDA EL N?MERO PREGUNTADO
		System.out.print("Ingresa el n?mero divisible: ");
		int numDivisible = entradaTeclado.nextInt();
		System.out.println();

		// CONTADOR DE PRUEBAS
		int contador = 1;	
		for (int longitudArr = 1000; longitudArr <= 30000; longitudArr+=1000) {
			System.out.println("PRUEBA #" + contador +" con: " + longitudArr + " datos.");

			// DECLARAR EL ARREGLO
			int arreglo[] = new int[longitudArr];

			// LLENAR EL ARREGLO
			for (int j = 0; j < longitudArr; j++) {
				arreglo[j] = j + 1;
			}

			/*
			 * //IMPRIMIR EL ARREGLO for (int i = 0; i < arreglo.length; i++) { if(i == 0)
			 * System.out.print("[ "); if(i <= longitudArr - 2) System.out.print(" " +
			 * arreglo[i] + " ,"); if(i == longitudArr - 1) System.out.print("  " +(i + 1) +
			 * " ]"); }
			 */

			System.out.println("");

			// M?TODO 1
			inicio = System.currentTimeMillis();

			// M?TODO 1 LLAMAMOS LA FUNCI?N Y LE PASAMOS LA LONGITUD DEL ARREGLO, EL
			// DIVISIBLE Y EL ARREGLO
			Metodo1_Sum_DivisiblesPares metodo1 = new Metodo1_Sum_DivisiblesPares();
			int resultado1 = metodo1.sumaDivisiblePares(longitudArr, numDivisible, arreglo);

			fin = System.currentTimeMillis();
			resultado = fin - inicio;
			System.out.println("M?todo 1.");
			System.out
					.println("La cantidad de pares que sumados son divisibles de " + numDivisible + " son: " + resultado1);
			System.out.println("Tiempo ejecutando: " + resultado + "ms.");

			// REINICIO DE VARIABLES
			inicio = fin = resultado = 0;

			// M?TODO 2
			inicio = System.currentTimeMillis();

			// M?TODO 2 LLAMAMOS LA FUNCI?N Y LE PASAMOS EL DIVISIBLE Y EL ARREGLO
			Metodo2_Sum_DivisiblesPares metodo2 = new Metodo2_Sum_DivisiblesPares();
			int resultado2 = metodo2.sumaDivisiblePares(numDivisible, arreglo);

			fin = System.currentTimeMillis();
			resultado = fin - inicio;
			System.out.println("M?todo 2.");
			System.out.println("La cantidad de pares que sumados son divisibles de " + numDivisible + " son: " + resultado2);
			System.out.println("Tiempo ejecutando: " + resultado + "ms.");
			System.out.println("****************************************");
			contador++;
		}
	}
}
