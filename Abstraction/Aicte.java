//abstraction using interface keyword.

interface Aicte extends Anna {        //we need to give the interface keyword inplace of class, so that we don't need to declare abstract for every method.

   double amount=20000;    //compiler will give public final static by default to an instance variable.

  // public void approve();
  // public void grades();

     default public void approve()
    {
        System.out.println("College is AICTE approved in AICTE FILE.");

    }


}
