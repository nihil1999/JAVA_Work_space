//overriding in polymorphism.

class Child extends Parent{
    public void sub()
    {
        int a=20,b=2;
        System.out.println("subtraction in class2: " + (a-b));
    } 


 /*Overriding in polymorphism. In here this method contains the same signature, like the one given in the parent class's method. If we run this, Child class will override the parent class.
Thus the output will be the one given in the Child class method.*/
   
 public void add()         //If we comment this method, parent class method will be the output.Cauz there will be one method.
  
    {
        int a=10,b=5;
        System.out.println("addition in class2: " + (a+b));    

    } 

 /*public static void add()         //we can't override the static method.
  
    {
        int a=10,b=5;
        System.out.println("addition in child class: " + (a+b));    

    } */

    public static void main(String arg[])
    {
        Parent obj=new Child();

        obj.sub();
       // Parent.add();   //parent class method will run.
       // add();      
        obj.add();          //parent class method will run.

//we can see the parent class method in the overriding process by creating an object for the parent class and we can also see by using the super keyword.
        /*Parent obj1=new Parent();  

        obj1.add();*/

       // obj.parentmethod();

    }

  /*  public void parentmethod(){
        
            super.add();    //super refers to parent class. we can't use super in static.
            System.out.println("Parent class variable: " + super.amount); //we can use super for refer the parent class variable.
    }*/
}
