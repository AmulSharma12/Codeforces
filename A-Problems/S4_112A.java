import java.util.Scanner;


public class S4_112A
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		boolean isExist = false;

		int n = s1.length();
		for(int i = 0; i<n ;i++)
		{
			int no1  =(int) s1.charAt(i);
			int no2 = (int) s2.charAt(i);

			if(no1 < no2)
			{
				isExist = true;
				System.out.println("-1");
				break;
			}
			if(no1 > no2)
			{
				isExist = true;
				System.out.println("1");
				break;
			}

	
		}

		if(!isExist)
			System.out.println("0");


		
	}
}