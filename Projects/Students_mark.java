class Students_mark
{
    public static void main(String arg[])
        {
            Students_mark obj=new Students_mark();
            String first="Logan";
            String reg_no="78936A";
            obj.welcome();
            obj.name(first);
            obj.roll_no(reg_no);
            int total=obj.total_marks(95,92,90,85,84);
            float result=obj.percentage(total,5);
            boolean flag=obj.exam_result(95,92,90,85,84);
            obj.pass_fail(flag);
            
            Students_mark obj1=new Students_mark();
           // String first="SURIYA";
           // String reg_no="78936B";
            obj1.name("SURIYA");
            obj1.roll_no("78936B");
            int total1=obj1.total_marks(90,80,20,55,84);
            float result1=obj1.percentage(total1,5);
            boolean flag1=obj1.exam_result(90,80,20,55,84);
            obj1.pass_fail(flag1);

            obj.end();
        }
    public void welcome()
        {
            System.out.println("\n                WELCOME TO THE STUDENT'S RESULT             \n\n");        
        }
    public void name(String first)
        {
            System.out.println("    STUDENT NAME: " +first);
        }
    public void roll_no(String reg_no)
        {
            System.out.println("    Roll no: " +reg_no);    
        }
    public int total_marks(int tam,int eng,int math,int sci,int soc)
        {
            int sum=tam+eng+math+sci+soc;
            System.out.println("    Total Marks: " +sum);
            return sum;  
        }
    public float percentage(float tot,float no_of_sub)
        {
            float avg=tot/no_of_sub;
            System.out.println("    OVERALL PERCENTAGE: " +avg);
            return avg;
        }
    public boolean exam_result(int tam,int eng,int math,int sci,int soc)
        {
            if(tam>35 && eng>35 && math>35 && sci>35 && soc>35)
                return true;
            else
                return false;
        }
    public void pass_fail(boolean flag)
        {
            if(flag==true)
                System.out.println("    PASS\n\n");
            else
                System.out.println("    FAIL\n\n");
        }
    public void end()
        {
            System.out.println("                        THANK YOU                       ");
        }
}
