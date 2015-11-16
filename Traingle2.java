class Triangle2 {

	static void makeTraingle2(String s) {

		for (int i=s.length(); i>=0; --i) {
			
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