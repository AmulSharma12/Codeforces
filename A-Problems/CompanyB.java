import java.util.*;

public class CompanyB {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        list  =  allComb("",0, n, list);
    }


    public static  List<String>   allComb(String s,int index, int n, List<String> ds)
    {
        if(index == n)
        {
            ds.add(s);
        }
        s += "A";
        ds.add(s);
        return ds;
    }
}
