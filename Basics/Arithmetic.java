class Arithmetic 
{
    public int add(int firstnum,int secondnum)
    {
        return firstnum+secondnum;
    } 
    public int sub(int firstnum,int secondnum)
    {
        return firstnum-secondnum;
    } 
    public int mul(int firstnum,int secondnum)
    {
        return firstnum*secondnum;
    } 
    public int div(int firstnum,int secondnum)
    {
        return firstnum/secondnum;
    } 
    public int mod(int firstnum,int secondnum)
    {
        System.out.println("Modulo = "+a);
        return firstnum%secondnum;
    } 
    public static void main(String arg[])
    {
         
          
        Arithmetic obj=new Arithmetic();
         
        int addition = obj.add(20,15);
        int subtraction = obj.sub(200,100);
        int multiplication = obj.mul(25,10);
        int division = obj.div(200,10);
        int modulo = obj.mod(28,10);

        System.out.println("Addition = "+addition);
        System.out.println("Subtraction = "+subtraction);
        System.out.println("Multiplication = "+multiplication);
        System.out.println("Division = "+division);
        System.out.println("Modulo = "+modulo);
        
    }
}
