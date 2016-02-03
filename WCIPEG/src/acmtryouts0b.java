import java.util.Scanner;

public final class acmtryouts0b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int length;
		for (int i = 0; i < cases; i++) {
			String a, b;
			length = in.nextInt();
			in.nextLine();
			a = in.nextLine();
			b = in.nextLine();
			for (int j = 0; j < length; j++) {
				//System.out.println(a.length() - 1 - j);
				System.out.print(b.substring(b.length() - 1 - j, b.length() - j));
				System.out.print(a.substring(a.length() - 1 - j, a.length() - j));
				
			}
			System.out.println();
		}
		in.close();
	}

}
