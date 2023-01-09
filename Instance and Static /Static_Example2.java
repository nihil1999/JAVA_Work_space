//we can access static variable in one class from another class by using classname without creating object in the other class for the logic class.

public class Static_Example2{

        public static void main(String arg[])
        {
                System.out.println(Static_Example1.a);      //Static_Example1 - classname
                System.out.println(Static_Example1.b);
                Static_Example1.add();
        }


}


public class Static_Example2 extends Static_Example1 {

        public static void main(String arg[])
        {
                System.out.println(Static_Example1.a);      //Static_Example1 - classname
                System.out.println(Static_Example1.b);
                Static_Example1.add();
                
              
              Static_Example1 obj=new Static_Example2();  //we can call a static method and variable using object.
                    obj.add();

        }


}
