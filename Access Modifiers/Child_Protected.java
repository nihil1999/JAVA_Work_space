package Protected1;
import Protected.*;

public class Child_Protected extends Parent_Protected
{

    public static void main(String arg[])
    {
        Child_Protected obj=new Child_Protected();

            System.out.println(obj.a+obj.b);

    }
}
/*
class Child_Protected 
{

    public static void main(String arg[])
    {
        Parent_Protected obj=new Parent_Protected();

            System.out.println(obj.a+obj.b);

    }
}*/
