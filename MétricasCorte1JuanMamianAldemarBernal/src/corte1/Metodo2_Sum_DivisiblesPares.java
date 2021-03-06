package corte1;
import java.util.Arrays;
import java.util.stream.IntStream;

//M?TODO 2: UTILIZANDO STREAM DE JAVA, PASAMOS POR PARAMETROS EL N?M DIVISIBLE Y EL ARREGLO 
public class Metodo2_Sum_DivisiblesPares {
	public int sumaDivisiblePares( int numDivisible, final int[] ar) {
		//
        return (int) IntStream.range(0, ar.length)
            .mapToLong(baseIndex -> 
                Arrays.stream(ar, baseIndex + 1, ar.length)
                    .filter(value -> (ar[baseIndex] + value) % numDivisible == 0)
                    .count())
            .sum();
    }

}
