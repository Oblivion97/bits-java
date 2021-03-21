package core;

// The main method must be in a class named "Main".
class AnimalIn{  
    void eat(){
        System.out.println("eating...");
        
    }
}  
class Dog extends AnimalIn{  
    void bark(){
        System.out.println("barking...");
        
    }  
}  
class Inheritance{  
    public static void main(String args[]){  
        Dog d=new Dog(); 
        
        //AnimalIn a = new AnimalIn();
        AnimalIn dIn = new Dog();
        
        dIn.eat();
        
        d.bark();  
        dIn.eat();  
    }
    
} 