package bussinessLogic;

import Users.Patient;
import hospitals.Doctor;

public class AllMethods {
    public static void admin() {
    	System.out.println("Enter the password :");
    	String password = MainClass.sc.next();
    	if(password.equals("admin@123")){
    		addDoctor();
    	}
    	else {
    		System.out.println("Wrong password");
    	}
    }
    public static void patient() {
    	MainClass.sc.nextLine();
    	System.out.print("Enter your name : ");
    	String name = MainClass.sc.nextLine();
    	System.out.print("Enter your age : ");
    	int age = MainClass.sc.nextInt();
    	System.out.print("Enter your probleam : ");
    	MainClass.sc.nextLine();
    	String problem = MainClass.sc.nextLine();
    	Patient patient = new Patient(name,age,problem);
    	Doctor doc = MainClass.hos.getListOfDoctor().get().data;
    	System.out.println("Hello "+name+". You are appointed to Dr."+doc.getName());
    	MainClass.hos.getPatientList().add(patient);
    }
    public static void addDoctor() {
    	System.out.print("Enter the doctor name : ");
    	MainClass.sc.nextLine();
    	String name = MainClass.sc.nextLine();
    	Doctor doc = new Doctor(name);
    	MainClass.hos.getListOfDoctor().add(doc);
    	System.out.println("Doctor "+name+" has successfully.");
    	System.out.print("Do you want to add another doctor.");
    	String Ans = MainClass.sc.next();
    	if(Ans.equals("yes")) {
    		 addDoctor();
    	}
    	else {
    		System.out.println("Thank you Admin.");
    	}
    	
    }
}
