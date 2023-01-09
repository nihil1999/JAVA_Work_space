//this(); - to call the other constructor in one constructor.
//super(); - to call the parent class constructor in child class's constructor.


class Saravanastore_Child extends Saravanastore_Parent{

    Saravanastore_Child()
    {
         //here i am calling the parent class's constructor.
         super(5000);       //to initialize the value in the parent class's constructor.If we didn't give this compiler will give default super and initialize it as same as default constructor.

        // System.out.println("Child class constructor.");
        System.out.println("\nWelcome to saravana store.");
    }

    Saravanastore_Child(double amount)
    {
        this();     // to call the another constructor in one constructor.
        System.out.println("Free bag.");
    }
    
     Saravanastore_Child(double amount,double bill)
    {
        this(1000);     //here we called the single argument constructor and that constructor calling the no argument constructor.
        System.out.println("Free TV.\n");
    }

    public void ownplace()      //abstract method in the parent class is implemented here, this will override the parent class abstract method.
    {
          System.out.println("Saravana store built in ownplace.");
    }

    public static void main(String arg[])
    {
        Saravanastore_Parent obj=new Saravanastore_Child(100,5000); //here we invoke the 2 argument constructor.    //dynamic binding

       // System.out.println("amount: " + obj.amt);
        obj.ownplace();
        obj.getamount();
        
        

    }


}
