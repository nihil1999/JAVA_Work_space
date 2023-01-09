class StudentDetails{

    String name;
    int rollno;
    int total_marks;
    float percentage;
    char section;
    long parent_phoneno;
    boolean flag;

    final static String schoolName = "Swamy vivekanandha Matric hr.sec.school, Coimbatore-641010";
    final static int standard=12;
    final static int no_of_sub=5;

    public int total(int tam,int eng,int math,int sci,int soc)
        {
            int tot=tam+eng+math+sci+soc;
            return tot;
        }

    public float percent(float tot,float no_of_sub)
        {
            float per=tot/no_of_sub;
            return per;
        }

     public boolean exam_result(int tam,int eng,int math,int sci,int soc)
        {
            if(tam>=35 && eng>=35 && math>=35 && sci>=35 && soc>=35)
                return true;
            else
                return false;
        }

     public void result(boolean flag)
        {
            if(flag==true)
                System.out.println("    Exam Result: PASS");
            else
                System.out.println("    Exam Result: FAIL");
        }

     public char grades_clasify(float per)
        {
            if(per>90 && per<=100)
                return 'O';
            else if(per>80 && per<=90)
                return 'A';
            else if(per>70 && per<=80)
                return 'B';
            else if(per>=35 && per<=70)
                return 'C';
            else
                return 'F';
        }  

    public void display()
    {
            System.out.println("    School Name: " + schoolName);
            System.out.println("    Name: " +name );
            System.out.println("    Roll NO: " + rollno);
            System.out.println("    Standard: " + standard +"th");
            System.out.println("    Section: " + section);
            System.out.println("    Parent Phone NO: " + parent_phoneno );
            System.out.println("    Total Marks: " + total_marks );
            System.out.println("    Percentage: " + percentage );
    }

    public static void main(String arg[])
    {
                    StudentDetails student1=new StudentDetails();

            System.out.println("\n              Student1 Details        \n");
            student1.name="Logan";
            student1.rollno=123;
            student1.section='A';
            student1.parent_phoneno=9876543214l;

            student1.total_marks=student1.total(90,95,85,98,94);
            student1.flag=student1.exam_result(90,95,85,98,94);
            student1.percentage=student1.percent(student1.total_marks,no_of_sub);

            student1.display();

            student1.result(student1.flag);
            System.out.println("    Grade: " + student1.grades_clasify(student1.percentage));

            
                    StudentDetails student2=new StudentDetails();

            System.out.println("\n              Student2 Details        \n");
            student2.name="Steve";
            student2.rollno=12345;
            student2.section='A';
            student2.parent_phoneno=8876543165l;

            student2.total_marks=student2.total(60,75,55,48,84);
            student2.flag=student2.exam_result(60,75,55,48,84);
            student2.percentage=student2.percent(student2.total_marks,no_of_sub);

            student2.display();

            student2.result(student2.flag);
            System.out.println("    Grade: " + student2.grades_clasify(student2.percentage));
            
                    StudentDetails student3=new StudentDetails();

            System.out.println("\n              Student3 Details        \n");
            student3.name="Kavin";
            student3.rollno=1234567;
            student3.section='B';
            student3.parent_phoneno=9874323165l;

            student3.total_marks=student3.total(90,85,55,28,84);
            student3.flag=student3.exam_result(90,85,55,28,84);
            student3.percentage=student3.percent(student3.total_marks,no_of_sub);

            student3.display();

            student3.result(student3.flag);
            System.out.println("    Grade: " + student3.grades_clasify(student3.percentage));
        
                        StudentDetails student4=new StudentDetails();

            System.out.println("\n              Student4 Details        \n");
            student4.name="Arun";
            student4.rollno=123456789;
            student4.section='B';
            student4.parent_phoneno=7876323198l;

            student4.total_marks=student4.total(79,70,77,76,79);
            student4.flag=student4.exam_result(79,70,77,76,79);
            student4.percentage=student4.percent(student4.total_marks,no_of_sub);

            student4.display();

            student4.result(student4.flag);
            System.out.println("    Grade: " + student4.grades_clasify(student4.percentage));

                    StudentDetails student5=new StudentDetails();

            System.out.println("\n              Student5 Details        \n");
            student5.name="Bala";
            student5.rollno=23456789;
            student5.section='C';
            student5.parent_phoneno=9516278178l;

            student5.total_marks=student5.total(25,35,45,76,33);
            student5.flag=student5.exam_result(25,35,45,76,33);
            student5.percentage=student5.percent(student5.total_marks,no_of_sub);

            student5.display();

            student5.result(student5.flag);
            System.out.println("    Grade: " + student5.grades_clasify(student5.percentage));
        
    } 
}
