class StringEquals {

	static boolean isEqual (String a, String b) {

		int counter =0;

		if (a.length() == b.length()) {

			for (int i= 0; i<a.length(); ++i ) {

				if(a.charAt(i) != b.charAt(i))
					++counter;
			}

			if(counter>0) 
				return false;
			else
				return true;
		} 

		else {
			return false;
		}
	}

	public static void main(String... s) {
		String a  = "Java Programming";
		String b = "Java Programming";

		System.out.println ();
		System.out.println ("Caomparing String a and String b");
		System.out.println (isEqual(a, b));

		String c  = "India is the best country";
		String d  = "India is a good country";

		System.out.println ();
		System.out.println ("Comparing String c and String d");
		System.out.println (isEqual(c,d));
	}
}