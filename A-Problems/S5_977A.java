import java.util.Scanner;


public class S5_977A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		while(k != 0)
		{
			int lastDigit = n % 10;
			if(lastDigit != 0)
				n--;
			else
				n /=  10;


			k--;
		}


		System.out.println(n);

	}
}