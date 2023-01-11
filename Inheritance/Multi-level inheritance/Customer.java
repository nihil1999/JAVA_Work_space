class Customer extends Sbi{

      Customer()
        {
            super(10);  //refers to parents class constructor.
            System.out.println("Constructor in Customer .");

        }

  public void getMoney()
        {

            System.out.println("Money is getting by customer. ");
        } 

        public static void main(String arg[])
        {
            Rbi obj=new Customer();

            obj.getMoney();
            obj.giveMoney();            
        }
}
