package core;



// The main method must be in a class named "Main".

class Machine{
    private String name;
    public Machine(){
        //System.out.println("Constructor output");
        name = "Arnie";
    }
    
    public Machine(String name){
        System.out.println("Constructor-2 output");
        this.name = name;
    }
}
class ConstructorUdemy {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Breanna");
    }
}