class Customer extends Sbi{

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
