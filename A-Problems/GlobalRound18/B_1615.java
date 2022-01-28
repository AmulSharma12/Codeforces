package GlobalRound18;

import java.util.Scanner;
import java.util.HashMap;
//https://codeforces.com/contest/1615/problem/B
public class B_1615 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        HashMap<Integer,Integer> GivePow = calculatePowerOf2();
//        while(t != 0)
//        {
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//            System.out.println(minDeletions(l,r,GivePow));
//            t--;
//        }

        System.out.println(GivePow);
    }


    //    precomputation technique
    public static HashMap<Integer,Integer>  calculatePowerOf2()
    {
        int pow = 1;
        int key = 2;
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        result.put(1,0);


        for(pow = 1; pow<= 2*100000; pow++)
        {
            int number = (int)Math.pow(key,pow);
            if(number > 200000)
                break;
            result.put(number,pow);
        }


        return result;
    }



    public static int minDeletions(int l, int r,HashMap<Integer,Integer> givePow)
    {

        int count = 0;
        for(int i = l ; i<=r; i++)
        {
                if(givePow.containsKey(l))
                {
                    count += givePow.get(l);
                }
        }

        return count;
    }




}
