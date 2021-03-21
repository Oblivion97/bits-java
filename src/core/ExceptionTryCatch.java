package core;

public class ExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] mynumbers = {1,2,3,4,5};
			System.out.println(mynumbers[6]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong!");
		}
	}

}
