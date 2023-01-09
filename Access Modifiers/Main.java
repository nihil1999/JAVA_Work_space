//package pack;
//import pack.Public;

public class Main { /*extends Public*/


public static void main(String arg[])
    {
      /*Main obj=new Main();

         obj.add();
        System.out.println(obj.a);      //protected variable
        System.out.println(obj.b);      //public variable
       // System.out.println(obj.c);        //private variable
        System.out.println(obj.d);      *///default variable

        Public obj=new Public();

         obj.add();
        
         System.out.println(obj.a);      //protected variable
        System.out.println(obj.b);      //public variable
       // System.out.println(obj.c);        //private variable
        System.out.println(obj.d);      //default variable

    }
}
