class Triangle2 {

/*
ducat
duca
duc
du
d
*/

	static void makeTraingle2(String s) {

		for (int i= s.length()-1; i>=0; --i) {
			
			for (int j=0; j<=i; ++j ) {
					System.out.print(s.charAt(j));					
				}
				System.out.println();	
		}
	}

	public static void main(String... s) {
		
		String a = "ducat";
		System.out.println("Given string ==> "+ a);
		makeTraingle2(a);
	}

}