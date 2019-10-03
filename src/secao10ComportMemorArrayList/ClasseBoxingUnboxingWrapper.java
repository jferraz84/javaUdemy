package secao10ComportMemorArrayList;

public class ClasseBoxingUnboxingWrapper {

	public static void main(String[] args) {
	
		int x = 20;
		
		//Object obj = x; Boxing
		
		//Wrapper class
		Integer obj = x;
		
		System.out.println(obj);
		
		int y =  obj * 2;
		
		System.out.println(y);

	}

}
