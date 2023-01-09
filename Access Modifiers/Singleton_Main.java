public class Singleton_Main{

        public static Singleton_Main sm;        //static variable with non-primitive datatype.

        private Singleton_Main()       //constructor with private access,so we aren't able to create object for this class in another class.
        {
             System.out.println("This is the Constructor for Singleton Main");
        }
 
        public static void main(String arg[])
        {
                System.out.println("default value before object creation: " + sm);         
               // Singleton_Main obj=new Singleton_Main();
                Singleton_Main sm=new Singleton_Main();
                System.out.println("default value after object creation: " + sm);         

                System.out.println("\nBefore object creation in singleton class: " + Singleton.s);    //static variable with non-primitive datatype in singleton class.

                Singleton x=Singleton.get_instance();      //calling a method in singleton class for object creation.
                System.out.println("After object creation in singleton class: " + x);
            
             // Singleton obj=new Singleton();      //we can't create a object for singleton class in here cauz constructor is in private access in singleton's class 
                System.out.println("\nTo check the value after object creation in singleton class: " + Singleton.s);    
              //  Singleton y=Singleton.get_instance();
                System.out.println("After 2nd object creation in singleton class: " + Singleton.get_instance()); //value will be same as the one in the 1st object creation.

        }
}
