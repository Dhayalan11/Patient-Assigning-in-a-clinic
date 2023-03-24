package hospitals;

import java.util.*;

import CircularLinkedLIst.CreateCircularLinkedList;
import Users.Patient;

public class Hospital {
   private String name;
   private CreateCircularLinkedList listOfDoctor = new CreateCircularLinkedList();
   private List<Patient> patientList = new ArrayList<Patient>();
   
   
public Hospital(String name) {
	
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public CreateCircularLinkedList getListOfDoctor() {
	return listOfDoctor;
}
public void setListOfDoctor(CreateCircularLinkedList listOfDoctor) {
	this.listOfDoctor = listOfDoctor;
}
public List<Patient> getPatientList() {
	return patientList;
}
public void setPatientList(List<Patient> patientList) {
	this.patientList = patientList;
}
   
   
}
