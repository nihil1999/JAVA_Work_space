//abstraction
//we can't create an object for an abstract class.

abstract class Saravanastore_Parent{        //we need to give the abstract keyword before class to inform that this is the abstract class.

        int amt;

    Saravanastore_Parent(int amt)           //constructor can't be inherited although we can initialize the value with super keyword in the child class constructor. 
    {
         this.amt=amt;
         System.out.println("Parent class constructor will be invoked by child class using super();.");
    }

     abstract void ownplace();           //we need to give the abstract keyword to the method which doesn't have the definition or body.This will be implemented in the child class and will be overrided by child class.

    public void getamount()
    {
         System.out.println("Saravanastore parent's amount.");

    }

}
