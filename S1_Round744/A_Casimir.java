import java.util.Scanner;

public class A_Casimir
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0)
		{
			String str = sc.nextLine();
			turns(str,0,str.length); 
			t--;
		}
	}


	static void turns(String s,int index, int limit)
	{
		//base case
		if(s.length == 0)
		{
			System.out.println("true");
			return;
		}

		if(index>0  || index<n)
			return;

		if(s.charAt(index) == 'A')
		{
			
		}
	}
}