package core;

public class Threadw3s extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadw3s obj = new Threadw3s();
		
		
		obj.start();
		
		System.out.println("Main Method");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is tread.");
	}

}
