//https://codeforces.com/problemset/problem/59/A
import java.util.Scanner;

public class S9_59A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int noOfUpperCase = 0;
		int noOfLowerCase = 0;

		for(int i = 0; i<n; i++)
		{
			char ch = s.charAt(i);
			if(ch < 'A' && ch > 'Z')
				noOfUpperCase++;
		}

		noOfLowerCase = n - noOfUpperCase;

		if(noOfUpperCase > noOfLowerCase)
			System.out.println(s.toUpperCase());
		else
			System.out.println(s.toLowerCase());
	}
}