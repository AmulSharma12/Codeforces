import java.util.Scanner;
import java.util.Arrays;

public class S2_WaterMelon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isDivide = isDividable(n);
		if(isDivide)
			System.out.print("Yes");
		else
			System.out.print("No");
	}



	public static boolean isDividable(int x)
	{
		if(x % 2 == 0)
		{
			int firstTerm = x - 2;
			if(firstTerm % 2== 0  && firstTerm != 0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}