//for separate files


class Car1 extends Vehicle1          //extends - keyword to inherit with parent class.
{
    int no_of_tyre=4;
    int no_of_wiper=2;

    {System.out.println("\n Tyre: " + no_of_tyre);}    // instance initializer {...} 

    public static void main(String arg[])
    {        
        Car1 honda=new Car1();

        drive();            //drive(); for using static 
        honda.horn();
        honda.clutch();        
        honda.applybreak();
        honda.wiper();
        
        System.out.println("\n Static: " +a);
        System.out.println("\n Indicator: " +honda.indicator);
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

   /* public static void drive()         // we don't need to use object to call method if we use static.
    {
        
        System.out.println(" Vehicle is working in static. ");
    
    }*/

    

}
   
