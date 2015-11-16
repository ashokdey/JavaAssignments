class BinaryToDecimal {

	static long convertToDecimal (String s) {

		int len = s.length();
		long num   = 0;

		for (int i=0; i<len; ++i) {
			
			if (s.charAt(i) == '1') {
				num+= Math.pow(2, (len-1-i));
			}
		}

		return num;
	}

	public static void main(String... s) {

		String a = "111111111111111110000011111";

		System.out.println();
		System.out.println("Binary number in string is ==> "+ a);
		System.out.println();

		long decimal = convertToDecimal(a);
		System.out.println("Converted to decimal ==> "+ decimal);
		System.out.println();
	}

}