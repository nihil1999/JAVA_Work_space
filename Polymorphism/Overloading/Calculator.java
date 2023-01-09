//overloading . we can declare a same method again and again by giving different number of input parameters or type of input parameters, or a mixture of both. 


class Calculator{

    public static void main(String arg[])
    {
        Calculator obj=new Calculator();

        obj.add(2,10);
        obj.add(20,2.5f);
      //  obj.add();   we can call a method en num of times.
      //  obj.add();
    }

    public void add(int a,int b)
    {
        
        System.out.println("add in int datatype: " + (a+b) ) ;

    }

    public void add(int a,float b)
    {
        
        System.out.println("add in float datatype: " + (a+b) ) ;

    }
    
    public void add()
    {
        int a=40;
        int b=90;
        System.out.println("add in void datatype: " + (a+b) ) ;

    }

  /*  public void add()                    we can't declare a same method again and again without passing arguments.
    {
        int a=20;
        float b=3.5f;
        System.out.println("add in float datatype: " + (a+b) ) ;

    }*/










}
