package secao2AptdaLingagemJavaConcBasico;

public class FuncoesParaString {

	public static void main(String[] args) {
		
		String original =  "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2 , 9);
		String s05 = original.replace('a', 'X');
		String s06 = original.replace("abc", "XY");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original  = -" + original + "-");
		System.out.println("toLowerCase = - " + s01 + "-");
		System.out.println("toUpperCase = - " + s02 + "-");
		System.out.println("trim =  -" + s03 + "-");
		System.out.println("Substring (2.9)=  -" + s04 + "-");
		System.out.println("Substring ('a', 'X')=  -" + s05 + "-");
		System.out.println("Substring ('abc', 'XY')=  -" + s06 + "-");
		System.out.println("Index of 'bc' = " + i );
		System.out.println("Last index of 'bc' = " + j );
		System.out.println("--------------------------------------------------");
		
		String s = "potato apple lemon" ;
		
		String[ ] vect = s.split( " ");
		
		System.out.println("Antes de separar : " + s);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
		
		
	}

}
