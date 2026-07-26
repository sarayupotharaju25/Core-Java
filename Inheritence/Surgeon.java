package Inheritence;

public class Surgeon extends Doctor {
	private String surgeryType;
	private int yearsOfExperience;
	
	public Surgeon(int doctorId , String doctorName,String specialization,String surgeryType,int yearsOfExperience){
		super(doctorId ,doctorName,specialization);
		this.surgeryType=surgeryType;
		this.yearsOfExperience=yearsOfExperience;
	}@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Surgery Type: " + surgeryType);
		System.out.println("Experience: " + yearsOfExperience + " Year");
	
	
	
	
		
	}

}
