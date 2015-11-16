class SolveExpression {

	static int solveExpression (String s) {

		int sum =0, flag =0, len =0;
		String temp = "";

		for (int i= 0; i<s.length(); ++i ) {
			
			while (i<s.length() && (s.charAt(i) != '+'))  {
				temp += s.charAt(i);
				++i;				
			}

			sum += stringToNum(temp);
			temp = "";
		}

		return sum;
	}

	static int stringToNum (String s) {
		int num =0, factor =1;

		for (int i=s.length()-1; i>=0; --i ) {
			
			num += (s.charAt(i) - '0')*factor;
			factor *= 10;
		}

		return num;
	}

	public static void main(String[] args) {
		
		String a = "10+20+50";
		
		System.out.println();
		System.out.println("Given expression = "+ a);

		int sum = solveExpression(a);
		
		System.out.println();
		System.out.println("Sum => "+sum);
		System.out.println();

	}

}