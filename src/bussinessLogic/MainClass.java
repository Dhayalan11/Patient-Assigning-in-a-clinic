package bussinessLogic;

import java.util.Scanner;

import hospitals.Doctor;
import hospitals.Hospital;

public class MainClass {
	 static Scanner sc = new Scanner(System.in);
	static  Hospital hos = new Hospital("asrf Hospital");
 	
	public static void main(String[] args) {
		hos.getListOfDoctor().add(new Doctor("Dhayalan"));
	 	hos.getListOfDoctor().add(new Doctor("Akash"));
//	 	hos.getListOfDoctor().add(new Doctor("Arunachala"));
//	 	hos.getListOfDoctor().add(new Doctor("Tawfiq"));	
    	
	 	
    	
    	
    	while(true) {
     System.out.println("Select a option");
     System.out.println("""
     		1-->Admin
     		2-->Patient.
     		""");
     String input = sc.next();
     switch(input) {
     case "1":
    	 AllMethods.admin();
    	 break;
     case "2":
    	 AllMethods.patient();
    	 break;
     default:
    	 System.out.println("Invalid option.");
     }
    	}
     }
}
