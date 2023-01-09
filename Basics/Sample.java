//instance variables

class Sample
{
    //instance variables
    int a=10;
    int b=15;
    public static void main(String arg[])
    {
        Sample obj=new Sample();
        System.out.println(obj.a+" " + obj.b);
        int sum=obj.add(obj.a,obj.b);            //instance variables can only be referenced by using object in static context. 
        System.out.println("addition: " +sum);
        int result=obj.sub();
        System.out.println("subtraction: " +result);
        System.out.println(obj.a+" " + obj.b);
    }
        
    public int add(int c,int d)
    {  
        return c+d; 
    }

     /*public static int add(int c,int d)
    {  
        
        return c+d; 
    }*/

    public int sub()
    { 
        a=7;           // reassigning the value
        int b=5;       //local variable
        System.out.println(a+" " + b);
        return a-b;
    }
}
