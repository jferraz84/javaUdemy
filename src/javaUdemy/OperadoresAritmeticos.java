package javaUdemy;

import java.net.SocketTimeoutException;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);    // Formula de báscara. 
		
	   System.out.println("O resultado da Bascara é " +x1);
	   
	   double n1 = 10;
	   double n2 = 30;
	   String s = "ABC";
	   n1 *= 2;
	   n2 += n1;
	   s += "DEF";
	   
	   int a1 = 10;
	   int b2 = a1++;
	   
	  System.out.println(a1);
	  System.out.println(b2);
	   
	   System.out.println(n1);
	   System.out.println(n2);
	   System.out.println(s);
	   System.out.println("---------------------------");
	   
	   System.out.println(n1);
	   System.out.println(n2);
	   System.out.println(s);
	  
	   
		
		
		
	}

}
