// Single inheritance example
 
class Vehicle
{
    int indicator=2;
    int clutch=1;
    int horn=1;
    
    public static void main(String arg[])
    { 
          Vehicle obj=new Vehicle();
            
            obj.drive();   //If we run parent class(Vehicle) alone we will get this methods output cauz we called it here.But if we run child class(Car) we don't get this methods output.  
           // obj.wiper(); we can't call method in child class using object created in parent class.
           obj.horn();
           obj.clutch();
    }

    public void drive()         // we don't need to use object to call method if we use static.
    {
        
        System.out.println(" Vehicle is working. ");
    
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

class Car extends Vehicle           //extends - keyword to inherit with parent class.
{
    int no_of_tyre=4;
    int no_of_wiper=2;

    {System.out.println("\n Tyre: " +no_of_tyre);}    // instance initializer {...} 

    public static void main(String arg[])
    {        
        Car honda=new Car();

        honda.drive();            //drive(); for using static 
        honda.horn();
        honda.clutch();
        honda.applybreak();
        honda.wiper();

        System.out.println("\n Indicator: " + honda.indicator);
        System.out.println("\n Clutch: " + honda.clutch);
        System.out.println("\n Horn: " + honda.horn);
        System.out.println("\n Tyre: " + honda.no_of_tyre);           // we need to use object to pass data from non-static to static context.
        System.out.println("\n No of Wiper:" + honda.no_of_wiper );

    }

    public void applybreak()
    {
        int no_of_break=1;
        System.out.println("\n No of Break:" + no_of_break );
        System.out.println("\n Break applied.");

    }

    public void wiper()
    {
        System.out.println("\n Wiper activated.");
    
    }
}
        


    
    

