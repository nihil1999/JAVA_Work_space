//Method with return value and no arguments/parameters

class With_returntype1
{
    public static void main(String arg[])
    {
            With_returntype1 obj=new With_returntype1();
            int result=obj.sub();
            System.out.println("\n 'This is Method with return value and no arguments/parameters type.' \n\n  Subtraction :" + result );

    }

    public int sub()
    {
            int firstnum=20;
            int secondnum=10;
            int output=firstnum-secondnum;
            return output;
    }
}
