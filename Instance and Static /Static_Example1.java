public class Static_Example1{

       /* static int a=10;
        static int b=5;*/

        static int a;
        public final static int b;

    public static void add()
        {
            System.out.println(a+b);
        }

         public static void main(String arg[])
        {
                System.out.println(a);      
                System.out.println(b);
                add();
        }
}
