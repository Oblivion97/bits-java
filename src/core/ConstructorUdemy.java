package core;



// The main method must be in a class named "Main".

class Machine{
    private String name;
    private int code;
    public Machine(){
        //System.out.println("Constructor output");
        name = "Arnie";
    }
    
    public Machine(String name){
        System.out.println("Constructor-2 output");
        this.name = name;
    }
    
    public void printNameCode() {
    	System.out.println("Name: "+name+" "+code);
    }
    
    public Machine(String name, int code) {
    	System.out.println("this is the third constructor");
    	this.name = name;
    	this.code = code;
    }
    
    
}
class ConstructorUdemy {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        
    	
        //Machine machine1 = new Machine();
        //Machine machine2 = new Machine("Breanna");
        //Machine machine3 = new Machine("Mahmudul", 6158);
        
    }
}