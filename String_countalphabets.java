package newpack1;

public class String_countalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count_alpha = 0;
		int count_digit = 0;
		int count_space = 0;
		String str = "slayer 1595 @6a1!";

		char ch[] = str.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			boolean b1 = Character.isAlphabetic(ch[i]);
			boolean b2 = Character.isDigit(ch[i]);
			boolean b3 = Character.isWhitespace(ch[i]);

			if (b1 == true) {
				count_alpha++;
			}
			if (b2 == true) {
				count_digit++;
			}
			if (b3 == true) {
				count_space++;
			}

		}
		int spcl = str.length() - (count_alpha + count_digit + count_space);

		System.out.println("alphabet " + count_alpha);
		System.out.println("digit " + count_digit);
		System.out.println("Space " + count_space);
		System.out.println("Special " + spcl);

	}
}