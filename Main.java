import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// 10 is the number of candidies
		// 5 is the minimum candies in a jar


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n>5)
			System.out.println("INVALID INPUT");
		else
		{
			System.out.println("NUMBER OF CANDIES SOLD : " + n);
			System.out.println("NUMBER OF CANDIES AVAILABLE : " + (10-n));
		}
	}
}