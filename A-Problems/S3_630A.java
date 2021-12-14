import java.util.Scanner;


public class S3_630A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int mul = Math.pow(5,n) % 100;
		System.out.println(mul);
	}
}