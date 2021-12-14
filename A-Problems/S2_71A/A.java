import java.util.Scanner;


public class A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n >= 0)
		{
			String s = sc.nextLine();
			String result = longWords(s);
			System.out.println(result);
			n--;
		}


	}


	public static String longWords(String str)
	{
		int n = str.length();

		if(n>10)
		{
			StringBuilder sb = new StringBuilder();

		int firstIndex = 0;
		sb.append(str.charAt(firstIndex));

		int no = n - 2;
		sb.append(no);

		int lastIndex = n - 1;
		sb.append(str.charAt(lastIndex));


		return sb.toString();
		}
		return str;

	}
}