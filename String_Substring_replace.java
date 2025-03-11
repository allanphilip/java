package newpack1;

public class String_Substring_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "WelcomeToTesting";
		int count = str.length();
		System.out.println("total : " + count);

		String sub_str = str.substring(8);
		System.out.println("substrins is : " + sub_str);

		String sub_str2 = str.substring(0, 8);
		System.out.println("substrins is : " + sub_str2);

		String rep1 = str.replace('w', 'm');
		System.out.println("replace1 is : " + rep1);

		String rep2 = str.replace("welcome", "thanks");
		System.out.println("replace2 is : " + rep2);

		String rep3 = str.replaceAll("[A-Z]", "");
		System.out.println("replaceall is : " + rep3);

		String str2 = "exam";
		boolean b1 = str2.matches("....");
		System.out.println("Match1 is : " + b1);
		boolean b2 = str.matches("(.)*g");
		System.out.println(b2);
		String str3 = "antman";

		boolean b3 = str3.matches("(.)*man");
		System.out.println(b3);

		String rept = str.repeat(5);
		System.out.println("Repeat is : " + rept);

	}

}
