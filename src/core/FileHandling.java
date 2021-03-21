package core;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj =  new File("FileTest.txt");
			if (myObj.createNewFile()) {
				System.out.println("File Created: "+myObj.getName());
			}
			else {
				System.out.println("File Already Exist!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An Unexpected Error.");
			e.printStackTrace();
		}
		
		
		
	}

}
