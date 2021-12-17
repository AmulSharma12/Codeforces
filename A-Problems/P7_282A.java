import java.util.Scanner;

public class P7_282A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ans = 0;

		while(t!=0)
		{
			String s = sc.nextLine();
			if("+".contains(s))
				ans++;
			else
				ans--;
			t--;
		}


		System.out.println(ans);
	}
}