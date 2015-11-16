/*
ducatducat
duca  ucat
duc    cat
du      at
d        t

*/

class Triangle4 {

	static void makeTriangle4 (String s) {

		for (int i= s.length()-1; i>=0; --i) {

			for (int j=0; j<=i; ++j ) {
				System.out.print(s.charAt(j));					
			}

			for (int k=i; k<s.length()-1; ++k) {
				System.out.print("  ");
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
		makeTriangle4(a);
		System.out.println();

	}

}