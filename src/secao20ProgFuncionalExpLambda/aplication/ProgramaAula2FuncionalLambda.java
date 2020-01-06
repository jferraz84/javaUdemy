package secao20ProgFuncionalExpLambda.aplication;

import java.util.Arrays;

public class ProgramaAula2FuncionalLambda {
	
	public static int globalValue = 3;

	public static void main(String[] args) {

		int[] vect = new int[] { -1, 4, 3 , 5 , 7 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		 }
	 }

}
