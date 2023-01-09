//for separate files

class Vehicle1
{
    static int a=50;
    int indicator=2;
    int clutch=1;
    int horn=1;
    
    public static void main(String arg[])
    { 
          /*Vehicle1 obj=new Vehicle1();
            
            obj.drive();   //If we run parent class(Vehicle) alone we will get this methods output cauz we called it here.But if we run child class(Car) we don't get this methods output.  
           // obj.wiper(); we can't call method in child class using object created in parent class.
           obj.horn();
           obj.clutch();*/
    }

    public static void drive()         // we don't need to use object to call method if we use static.
    {
        
        System.out.println(" Static method: Vehicle is working. ");
    
    }

    
    public void horn()
    {
        
        System.out.println(" Horn is working. ");
    
    }
    
     public void clutch()
    {
        
        System.out.println(" Clutch applied. ");
    
    }

}
