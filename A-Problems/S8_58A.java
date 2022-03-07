import java.util.Scanner;

public class S8_58A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int n = s.length();
		String x = "hello";
		int currIndex = 0;

		for(int i = 0; i<n && currIndex<5 ; )
		{
			while(s.charAt(i) != x.charAt(currIndex))
				i++;


			if(s.charAt(i) == x.charAt(currIndex))
			{
				currIndex++;
			}
		}

		if(currIndex == 5)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}