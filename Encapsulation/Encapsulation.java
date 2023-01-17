public class Encapsulation{

    public static int a;
    private int b;

    /*public Encapsulation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }*/

    public static int getvalue()
    {
        return a;
    }
     
    public static void setvalue(int value)
    {
        a=value;
        System.out.println("Main method: " + a);
    }
    
    static
    {
        a=100;
        System.out.println("Static in parent: " + a);
    }

    /* Encapsulation(int a)
    {
        System.out.println("Constructore in parent : " + a);
    }

     Encapsulation()
    {
        System.out.println("Constructore in parent : " + a);
    }*/
    
}
