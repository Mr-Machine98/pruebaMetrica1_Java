package corte1;

public class Metodo1_Sum_DivisiblesPares {
	
	
	//M?TODO 1, TOMA DOS ELEMENTOS DEL ARREGLO LOS SUMA Y COMPARA SU RESIDUO, SI ES IGUAL A 0 ACUMULA EL CONTADOR  
	public int sumaDivisiblePares(int longitud_Arr, int numDivisible, int arreglo[]) {
		int contador = 0;
		for (int indice1 = 0; indice1 < longitud_Arr; indice1++) {
			for (int indice2 = indice1 + 1; indice2 < longitud_Arr; indice2++) {
				if (indice1 < indice2) {
					int sum = arreglo[indice1] + arreglo[indice2];
					int residuo = sum % numDivisible;
					if (residuo == 0) {
						contador++;
					}
				}
			}
		}
		return contador;
	}
	
	
}
