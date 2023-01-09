class Non_primitive{

       static int a;        //class specific: default values assigned before the object creation itself.
       static double b;
       int c;             //non-static variable
       static Non_primitive np;   //non-primitive datatype: datatype should be same as classname.
       //static primitive p;   //compile error: cannot find symbol.

    Non_primitive()         //constructor
     {    
        System.out.println("\nConstructor initialized.\n");
     }

    public static void main(String arg[])
{
    System.out.println("default value before object creation: " + a);   //default value: 0
    System.out.println("default value before object creation: " + b);      //default value: 0.0
    // System.out.println(obj.c);
    System.out.println("default value before object creation: " + np + "\n");  //default value: null

    Non_primitive obj=new Non_primitive();
        System.out.println("default value after object creation: " + a);
          System.out.println("default value after object creation: " + obj);
    Non_primitive a=new Non_primitive();

    System.out.println("\ndefault value after object creation: " + a);
    System.out.println("default value after object creation: " + b);
    System.out.println("default value after object creation: " + a.c);
    System.out.println("default value after object creation: " + np);
     
}
   

}
