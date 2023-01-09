class College implements Aicte {        //here we need to give implements inplace of extends, cauz we are using interface class.

    public void approve()
    {
        System.out.println("College is AICTE approved.");

    }

     public void grades()
    {
        System.out.println("College follows grades from AICTE.");

    }

    public static void main(String arg[])
    {
        Aicte obj=new College();

        obj.approve();
        obj.grades();
    
          System.out.println("variable in parent class: " + Aicte.amount);    //20000 //instance variable in the parent class can be accessed without object, cauz the compiler will give static by default.

         // amount=50000;   //give an error: cannot assign a value to final variable
          System.out.println("changing the variable in parent class: " + amount); //compiler will give final static by default to the instance variable in parent class.

    }


}
