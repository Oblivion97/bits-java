package core;

// The main method must be in a class named "Main".
class Animal{  
    void eat(){
        System.out.println("eating...");
        
    }
}  
class Dog extends Animal{  
    void bark(){
        System.out.println("barking...");
        
    }  
}  
class Inheritance{  
    public static void main(String args[]){  
        Dog d=new Dog(); 
        
        Animal a = new Animal();
         Animal d = new Dog();
        
        d.eat();
        
        d.bark();  
        d.eat();  
    }
    
} 