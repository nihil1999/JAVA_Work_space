//constructor: constructor is similar to a method but it doesn't have return type.
//Default constructor(non-parameterized) will be declared by compiler, if we didn't declare any constructor.Default value will be assigned by compiler while object creation.
//If we declare any parameterized constructor, we need to declare default constructor cauz compiler won't declare it since we already declared parameterized constructor.

class Constructor{
    int a;
    int b;
    int c;
 Constructor(int a)     //constructor name should be same as class name  
{
      //  a=a1;     //parameter variable name shouldn't be same cauz it will consider as a default value.
      //  System.out.println("Constructor" + a);
      this.a=a;   //this-keyword : is to refer the current object(obj).it can be used in non-static method and variable.
}

Constructor(int a,int b)
{
        this.a=a;       //this-keyword : is to refer the current object(obj1).
        this.b=b;
       // System.out.println("Constructor" + a);
}
public static void main(String arg[])
    {
        Constructor obj=new Constructor(12);         //constructor with parameters 
        
        System.out.println("Constructor: " + obj.a);
        System.out.println("Constructor: " + obj.b);
        System.out.println("Constructor: " + obj.c);

        



    } 


}
