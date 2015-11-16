class FindString {

	static int findString( String s, String s2 ) {

		int pos =0, k=0,j=0, l=0;

		for (int i=0; i<s.length(); ++i) {

			if (s.charAt(i) == s2.charAt(0)) {      
			
				k = i+1;

				for (j=1; j<s2.length(); ++j) {
					
					if (s.charAt(k) == s2.charAt(j)) {
						
						pos = i;
						++k;
						l = j;
					}
				}
			}	
		}

		l += 1;

		if (l == s2.length())
			return pos;
		else
			return 0;
	}

	public static void main(String... s) {
	
		String a = "India is a good country.";
		String b = "day";

		int pos = findString(a,b);

		if (pos>0) {
		System.out.println();
		System.out.println("String --> \" "+ b +" \" found inside String --> \" "+ a +" \"");
		System.out.println("At position = "+ pos);
			
		}
		else {
			System.out.println();
			System.out.println("String --> \" "+ b +" \" not found in String --> \" "+ a +" \"");
		}

		System.out.println();

	}



}