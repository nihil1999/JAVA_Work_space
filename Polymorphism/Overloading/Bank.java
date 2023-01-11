//overloading . we can declare a same method again and again by giving different number of input parameters or type of input parameters, or a mixture of both.

class Bank{
     
    public static void main(String arg[])
    {
        Bank hdfc=new Bank(); 

        hdfc.simple_interest(10000,8,12);
        hdfc.simple_interest(20000,8.5,12);
        hdfc.simple_interest(30000,12,12);
        hdfc.simple_interest(20000,2.5f,24);

        //for using static method
       /* simple_interest(10000,8,12);
        simple_interest(20000,8.5d,12);
        simple_interest(30000,12,12);
        simple_interest(20000,2.5f,24);*/
    }

    public void simple_interest(int principal,int rate_of_interest,int time_period)
    {
        double si=(principal*rate_of_interest*time_period)/(100*12);
        System.out.println("SI in int datatype: " + si ) ;   
    }

   /* public float simple_interest(int principal,int rate_of_interest,int time_period)   //must differ in parameters or return type in parameters, not in return type in method signature.
    {
        float si=(principal*rate_of_interest*time_period)/(100*12);
        System.out.println("SI in int datatype: " + si ) ; 
        return si;  
    }*/

    public static void simple_interest(int principal,double rate_of_interest,int time_period)
    {
        double si=(principal*rate_of_interest*time_period)/(100*12);
        System.out.println("SI in double datatype: " + si ) ;   
    } 

     public static double simple_interest(int principal,float rate_of_interest,int time_period)
    {
        double si=(principal*rate_of_interest*time_period)/(100*12);
        System.out.println("SI in float datatype: " + si ) ;
        return si;   
    }
}      
