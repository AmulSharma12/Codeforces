import java.util.Scanner;


public class A_281
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		char ch = s.charAt(0);
		if(ch >= 97 && ch <= 122)
			 ch = (char)((int)s.charAt(0) - 32);

		sb.append(ch);

		int n = s.length();
		for(int i = 1; i<n ; i++)
			sb.append(s.charAt(i));

		System.out.println(sb);
	}
}