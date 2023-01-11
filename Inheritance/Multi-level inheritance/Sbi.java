class Sbi extends Rbi{

         Sbi(int a)
        {
            //super(); default will be given by compiler that refers to parent class.
            System.out.println("Constructor in SBI.");
            System.out.println("Constructor in SBI: " + a);

        }

        public void giveMoney()
        {

            System.out.println("Money is given by SBI");
        }

       /*  public void getMoney()
        {

           // System.out.println("Money is given by SBI");
        } */


}
