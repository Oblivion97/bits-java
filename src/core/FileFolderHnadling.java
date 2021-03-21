package core;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileFolderHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//create file
			File myObj = new File("D:\\Eclipse WorkSpace\\Java\\JavaBasicPractice\\src\\core\\FileCreateWrite.txt");
			myObj.createNewFile();
			
			//write file
			FileWriter myWriter  = new FileWriter(myObj);
			myWriter.write("Writing through codes.");
			myWriter.close();
			System.out.println("File Written Successfully.");
			
			//read file
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			
			
			//Get File Information
			if (myObj.exists()) {
				System.out.println("File Name: " +myObj.getName());
				System.out.println("Absolute Path: " +myObj.getAbsolutePath());
				System.out.println("Writable: " +myObj.canWrite());
				System.out.println("Executable: " +myObj.canExecute());
				System.out.println("Readable: " +myObj.canRead());
				System.out.println("Canonical Path: "+myObj.getCanonicalPath()); //? file path
				System.out.println("Canonical File: "+myObj.getCanonicalFile());//? file path
				//System.out.println("Something: "+myObj.compareTo("D:\\Eclipse WorkSpace\\Java\\JavaBasicPractice\\FileTest.txt"));
				System.out.println("File Size: " +myObj.length());
			}else {
				System.out.println("File Doesn't Exist.");//bytes
			}
			
			
			//Delete file
			File fileDelete = new File("D:\\Eclipse WorkSpace\\Java\\JavaBasicPractice\\src\\core\\FileForDelete1.txt");
			if (fileDelete.exists()) {
				if (fileDelete.delete()) {
					System.out.println(fileDelete.getName() +" Deleted Successfully");
				}else {
					System.out.println(fileDelete.getName()+" didn't deleted.Error Occured.");
				}
			}else {
				System.out.println("File Does not Exist");
			}
			
			//Folder Delete
			File folderDelete = new File("D:\\Eclipse WorkSpace\\Java\\JavaBasicPractice\\src\\core\\FolderForDelete1");
			if (folderDelete.exists()) {
				if (folderDelete.delete()) {
					System.out.println(folderDelete.getName() +" Deleted Successfully");
				}else {
					System.out.println(folderDelete.getName()+" didn't deleted.Error Occured.");
				}
			}else {
				System.out.println("Folder Does not Exist");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something Wrong Occured.");
			e.printStackTrace();
		}
	}

}
