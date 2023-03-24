package Users;

import hospitals.Doctor;

public class Patient {
	private String name;
	private int age;
	private String problem;
	Doctor doctor;
	public Patient(String name, int age, String problem) {
		
		this.name = name;
		this.age = age;
		this.problem = problem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

}
