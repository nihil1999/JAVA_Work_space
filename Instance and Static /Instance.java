//Instance variable or non-static variable.

class Instance{
        int a;
       // int a=5;                         //instance variable(object specific): we can use this anywhere in the method by using object.we can use this in any non-static method without object.
        static int b=10;                 //static variable(class specific): value applies for anywhere used in this class.If we change the value in in-between it will affect the remaining too.
        final static int c=15;          //static variable: permanent


        public void sample()
        {
            System.out.println("non-static variable: " + a); //non-static variable

        }

public static void main(String arg[])
    {

        Instance obj=new Instance();
        
        obj.a=10;               //changes will only apply to this object.
        System.out.println("instance: " +obj.a);
        System.out.println("Static: " + b);
        System.out.println("Final Static: " + c);
        obj.sample();
    
        
        b=1;
       // c=6;  // //can't change cauz it is in final static.
        Instance obj1=new Instance();
  
        System.out.println("instance: " + obj1.a);
        System.out.println("Static: " + b);
        System.out.println("Final Static: " + c);

        Instance obj2=new Instance();
      
        System.out.println("instance: " + obj2.a);
        System.out.println("Static: " + b);
        System.out.println("Final Static: " + c);
    }
}
