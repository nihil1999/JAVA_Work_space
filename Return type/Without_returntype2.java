//Method with no return value and with arguments/parameters

class Without_returntype2
{
    public static void main(String arg[])
    {
            Without_returntype2 obj=new Without_returntype2();
            obj.add(10,20);
    }
    public void add(int firstnum,int secondnum)
    {
           // int sum=firstnum+secondnum;
            System.out.println("\n 'This is Method with no return value and with arguments/parameters type.' \n\n  Addition :" + (firstnum+secondnum) );
          //  System.out.println("Addition: " +sum);
    }
}
