class Animal{  

    public void eat()
    {System.out.println("eating...");}  
}  

class Dog extends Animal{  

    public void bark()
    {System.out.println("barking...");}  
}  

class Cat extends Animal{  

    public void meow()
    {System.out.println("meowing...");}  
}  

class Main{
 
    public static void main(String args[]){  

        Cat c=new Cat();  
        c.meow();  
        c.eat();
        //c.bark(); // error cauz this method is in different child class(Cat),so we can call the method only with the object created by using  that child class(Dog).   
        
        Dog d=new Dog();
        d.bark(); 
        d.eat();
}
}
