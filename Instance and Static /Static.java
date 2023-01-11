//In static method: we can only refer the static members(variable and method) alone.we can refer the non-static variable and method by using object.
//In non-static method: we can refer the static and non-static's variables and methods.

class Static{
    static int a;  //static variables
    static int b;

    //here i gave the final keyword for non-static variable. 
    final int c=55; // we can't change the value further.

       static{
         // a=20;
          b=10;
            
}

        public void add()               //non-static method
        {
            //c=2;     //here i try to change the value but error came: can't change the final .
            System.out.println("addition in non-Static method: " + (a+b+c));
            
            /*Static obj1=new Static();   //we can create an object in non-static method also.
            obj1.sub1(); */
            sub1();     // we can call non-static method
           // sub();      // we can call static method
        }

         static void sub()                //static method
        {

            System.out.println("subtraction in Static method: " + (a-b));
             Static obj=new Static();             //we can also create an object in static method(other than main method) also.
            obj.add();                            //we can call the non-static method by using object. we can't call the non-static method without using object. we need to create an object in the static method where we want to call the non-static method.
        }

         public void sub1()         //non-static method
        {

            System.out.println("subtraction in non-Static method:  " + (a-b));
        }

        public static void main(String arg[])
        {
              /*  Static obj=new Static();
               // obj.add();*/
               sub();

                final int no=4; //we can give final to any variable,method.

                System.out.println("Number: " + no);
                // no=8;    //final
                System.out.println("Number: " + no);
                System.out.println(a);
               

        }
}














