class FindReplace {

	static String findReplace ( String s1, String s2, String s3 ) {

		int position = findString(s1, s2);
		int i;

		if (position == 0) {
			return ("String \""+ s2 +"\" not found in String --> \""+s1);
		}

		String result = "";

		for ( i=0; i<position; ++i) {
			result += s1.charAt(i);
		}

		for (i=0; i<s3.length(); ++i) {
			result += s3.charAt(i);
		}

		int lengthOfs2 = s2.length();

		for (i=(position + lengthOfs2); i<s1.length(); ++i ) {
			result += s1.charAt(i);
		}
		return result;
	}


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
		String b = "good";
		String c = "fantastic";

		String d = findReplace(a,b,c);

		System.out.println();
		System.out.println("Original string ==> "+ a);
		System.out.println();

		System.out.println("Replacing string \'"+ b +"\' with string \'"+ c +"\'");		
		System.out.println();

		System.out.println("Final string ==> "+ d);
		System.out.println();

	}



}