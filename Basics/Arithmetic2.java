class Arithmetic2
{
    public static int add(int firstnum,int secondnum)
    {
        return firstnum+secondnum;
    } 
    public static int sub(int firstnum,int secondnum)
    {
        return firstnum-secondnum;
    } 
    public static int mul(int firstnum,int secondnum)
    {
        return firstnum*secondnum;
    } 
    public static int div(int firstnum,int secondnum)
    {
        return firstnum/secondnum;
    } 
    public static int mod(int firstnum,int secondnum)
    {
        return firstnum%secondnum;
    } 
    public static void main(String arg[])
    {
        int firstnum=40;
        int secondnum=2;

        int addition=add(firstnum,secondnum);
        int subtraction=sub(firstnum,secondnum);
        int multiplication=mul(firstnum,secondnum);
        int division=div(firstnum,secondnum);
        int modulo=mod(firstnum,secondnum);

        System.out.println("Addition = "+addition);
        System.out.println("Subtraction = "+subtraction);
        System.out.println("Multiplication = "+multiplication);
        System.out.println("Division = "+division);
        System.out.println("Modulo = "+modulo);
    }
}
