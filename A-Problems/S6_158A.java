//https://codeforces.com/problemset/problem/158/A
import java.util.Scanner;

public class S6_158A
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		boolean isCheck = false;
		int ans = 0;
		

		for(int i = 1 ; i<=n ; i++ )
		{

			int no = sc.nextInt();

			if(isCheck)
			{
				if(no == ans)
				{
					count = i;
				}
				else{
					count = --i;
					break;
				}
			}


			if(i == k)
			{
				if(no <= 0)
					break;
				isCheck = true;
				ans = no;
				count = i;
			}
			
		}

		System.out.println(count);
	}
}