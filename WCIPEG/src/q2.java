import java.util.Scanner;

public final class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		name = name.toLowerCase();
		int a = name.length() - name.replace("a", "").length();
		int vowel = name.length() - name.replace("e", "").length();
		vowel += name.length() - name.replace("i", "").length();
		vowel += name.length() - name.replace("o", "").length();
		vowel += name.length() - name.replace("u", "").length();
		if (a >= vowel) {
			System.out.println("Advance to next round");
		} else {
			System.out.println("Does not advance to next round");
		}
	}

}
