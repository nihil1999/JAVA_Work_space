class Main{

    public static void main(String arg[])
     {
            Encapsulation.setvalue(10);
            int a=Encapsulation.getvalue();
           System.out.println(a);

            Encapsulation obj=new Encapsulation();
            obj.setvalue(20);
            int b=obj.getvalue();
           System.out.println(b);

              Encapsulation obj1=new Encapsulation();
            obj1.setvalue(30);
            int c=obj1.getvalue();
           System.out.println(c);
            System.out.println(b);
     }



}
