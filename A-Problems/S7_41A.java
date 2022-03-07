import java.util.Scanner;


public class S7_41A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		if(check(s,t))
			System.out.println("YES");
		else
			System.out.println("NO");
	}



	public static boolean check(String x, String y)
	{
		int m = x.length();
		int n = y.length();

		if(m !=n)
			return false;

		for(int i = 0, j = n-1; i<m && j<n; i++, j--)
		{
			if(x.charAt(i) != y.charAt(j))
				return false;
		}


		return true;
	}
}