package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testLine = "HM Mahmudul Hasan ";
		//String pattern =  "(.*)(\\d+)(.*)";
		//String pattern = "mahmudul";
		String pattern = "z+";
		
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE); //1st arg pattern for search 2nd arg flag value.
		
		Matcher m = r.matcher(testLine);
		
		if (m.find()) {
			System.out.println("Match Found!");
			//System.out.println("Found Value: "+m.group(0));
			//System.out.println("Found Value: "+m.group(1));
			//System.out.println("Found Value: "+m.group(2));
		}
		else {
			System.out.println("No Match Found!");
		}
	}

}
