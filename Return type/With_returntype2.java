//Method with return value and with arguments/parameters

class With_returntype2
{
    public static void main(String arg[])
    {
            With_returntype2 obj=new With_returntype2();
            float result=obj.div(7,2);
            System.out.println("\n 'This is Method with return value and with arguments/parameters type.' \n\n  Division :" + result );
            
    }
    public float div(float firstnum,float secondnum)
    {
            float div=firstnum/secondnum;
            System.out.println("Division: " +div);
            return div;
    }
}
