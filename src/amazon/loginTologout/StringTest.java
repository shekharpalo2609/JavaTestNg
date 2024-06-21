package amazon.loginTologout;

public class StringTest {

	public static void main(String[] args) {

		String input = "reverse";
		
		String reverse = "";
		
		for(int i = input.length()-1; i>-1; i--) {
			char ch[] = input.toCharArray();
			reverse = reverse + ch[i];
		}
		
		if(reverse.equals(input)) {
			System.out.println("String is not reversed");
		}
		else {
			System.out.println("String is reversed");
			System.out.println(reverse);
		}
	}

}
