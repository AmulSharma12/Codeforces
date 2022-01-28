class Super
{
    //super class method
    public void superMeth()
    {
        System.out.println("super class method");
    }

}

class Sub extends Super
{
    //super class method
    public void subMeth()
    {
        System.out.println("sub class method");
    }

}

public class Main{
    public static void main(String[] args)
    {
        // creating object of both the classes
        Super superClass = new Super();
        Sub subClass = new Sub();


        //calling by super class object
        superClass.superMeth();

        //calling by sub class object
        subClass.superMeth();
        subClass.subMeth();
    }

}
