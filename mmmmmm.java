abstract class Animal {     
    public abstract void sound();     
    public void sleep() { 
        System.out.println("This animal is sleeping"); 
    } 
} 
class Dog extends Animal {    
    @Override    
 public void sound() { 
        System.out.println("Dog barks"); 
    } 
} 
 
class Cat extends Animal {     
    @Override    
 public void sound() { 
        System.out.println("Cat meows"); 
    } 
} 
public class mmmmmm {    
    public static void main(String[] args) {       
        Animal myDog = new Dog();       
        Animal myCat = new Cat();       
        myDog.sound();           
myCat.sound();          
 myDog.sleep();           
myCat.sleep();   
    } 
} 
