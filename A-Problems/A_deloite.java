import java.util.ArrayList;

public class A_deloite {
    public static void main(String[] args)
    {
        int x = 5;
        int[] arr = {2,3,10};
        findFactors(x,arr);
    }


    public static void findFactors(int x, int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i<n; i++)
        {
            boolean isFactor = false;
            for(int j = 2; j*j <= x; j++)
            {
                if(arr[i]%j == 0)
                {
                    if(j == x || arr[i]/j == x)
                    {
                        isFactor = true;
                        break;
                    }
                }
            }


            if(isFactor)
                continue;
            else
                result.add(arr[i]);
        }


        for(Integer element:result)
        {
            System.out.println(element + " ");
        }
    }

}
