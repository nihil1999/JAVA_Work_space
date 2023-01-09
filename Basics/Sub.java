//Example for creating an object of one class in any another class
//we created an object by using Main(classname)(different file) in here.

class Sub{
    public void sub()
    {
        int a=20,b=2;
        System.out.println("subtraction in Sub class: " + (a-b));
    } 

    public void add()
    {
        int a=10,b=5;
        System.out.println("addition in Sub class: " + (a+b));    

    } 

    public static void main(String arg[])
    {
        Main obj=new Main();      // here Main is another class. we need to create an object by using the classname that we want to call.

        obj.add();

    Sub obj1=new Sub();

        obj1.sub();
        obj1.add();

    }
}
