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

		StringBuilder result = new StringBuilder();
		if(noOfUpperCase > noOfLowerCase)
		{
			for(int i =0; i<n; i++)
			{
				char ch = s.charAt(i);
				if(Character.isLowerCase(ch))
				{
					ch = Character.toUpperCase(ch);
				}
				result.append(ch);

			}
		}
			
		else
			{
				for(int i = 0; i<n; i++)
				{
					char ch = s.charAt(i);
				if(Character.isUpperCase(ch))
				{
					ch = Character.toLowerCase(ch);
				}
				result.append(ch);
				}

			}


			System.out.println(result.toString());
	}
}