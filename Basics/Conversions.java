class Conversions{

    public static void main(String arg[])
    {
          /*int a=10;
            int b=20;
            float result=a+b; */  //ouput: 30.0

         /* int a=10;
            float b=20.3f;
            float result=a+(int)b; */ //output: 30.0
        
        /*  int a=10;
            float b=20.3f;
            int result=a+(int)b; */ //output: 30
           
          /*int a=10;
            float b=20.3f;
            float result=a+b; */ //output: 30.3

         /*   int a=10;
            float b=20.3f;
            int result=a+b; */ //error: lossy conversion from float to int.

         /*   int a=10;
            float b=20.3f;
            double result=a+b; */   //output: 30.299999237060547
            
          /*  int a=10;
            int b=20;
            double result=a+b;  */   //output: 30.0

          /*  int a=10;
            float b=20.5f;
            double result=a+(double)b;*/ //output:30.5

           /* int a=10;
            float b=20.5f;
            double result=a+b; */  //output: 30.5

           /* int a=10;
            double b=20.5;
            float result=a+b; */ //error: lossy conversion from double to float

         /*   int a=10;
            double b=20.57;
            float result=a+(float)b;  */  //output: 30.57

        /*    float a=10.6f;
            double b=20.578;
            double result=a+b;   */   //output: 31.178000381469726

          /*  char c='c';
            int output=c; */  //output: 99 ASCII value

          /*  int c=5;
            char output=(char)c;   */   //no output   
            
         /*   char c='5';
            int output=c;  */     //output: 53 ASCII value

         /*    int c=5;
            char output=c;    */     //error: lossy conversion from int to char
   
          /*   float c=5.4f;
            char output=c;  */   //error: lossy conversion from float to char

          /*  boolean a=true;
            int output=(int)a; */  //error: boolean cannot be converted to int

            int a=10;
            float output=a;

           // System.out.println(result);
            System.out.println(output);
    }


}
