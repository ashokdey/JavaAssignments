/*
ducat
 ucat
  cat
   at
    t
*/

class Triangle3 {

	static void makeTriangle3 (String s) {

		for (int i=s.length()-1; i>=0; --i) {

			for (int k=i; k<s.length()-1; ++k) {
				System.out.print(" ");
			}

			for (int j=i; j>=0; --j) {
				System.out.print(s.charAt(s.length()-1-j));
			}
			System.out.println();
		}
	}

	public static void main(String... s) {
		String a = "ducat"; 
		System.out.println();
		makeTriangle3(a);
		System.out.println();

	}
}