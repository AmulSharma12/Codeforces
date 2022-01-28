import java.util.Scanner;

public class A_1030 {

    public static void main(String[] args)
    {
        String s = "easy";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int num = sc.nextInt();
            if(num == 1)
            {
                s = "hard";
                break;
            }
        }


        System.out.println(s);

    }
}
