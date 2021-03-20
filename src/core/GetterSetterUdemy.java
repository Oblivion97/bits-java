package core;


// The main method must be in a class named "Main".
class frog{
    private String name;
    private int age;
    
    // public String setName(String newName){
    //     name = newName;
    // }
    
    // public String setAge(int newAge){
    //     age = newAge;
    // }
    
    public String setName(String name){
        this.name = name;
        
        return name;
    }
    
    public int setAge (int age){
        this.age = age;
        
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}

class GetterSetterUdemy {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        frog frog1 = new frog();
        
        //frog1.name = "Bernie";
        //frog1.age = 2;
        
        frog1.setName("klaus");
        frog1.setAge(3);
        
        System.out.println("Name : "+frog1.getName() + " Age: "+frog1.getAge());
    }
}