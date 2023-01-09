public class Singleton{

        public static Singleton s;      //static variable with non-primitive datatype.default value is null. s represents object and Singleton represents class.
   

    private Singleton()         //constructor with private access,so we aren't able to create object for this class in another class.
        {
           System.out.println("This is the Constructor for Singleton ");
        }

         public static Singleton get_instance()
        {
            if(s==null)                 //default value for s will be null,  
                s=new Singleton();      //object creation happening. obj id generated. 

        return s;                   //if the value for s is not null then it will return the value which assigned already.
        }

      
}
