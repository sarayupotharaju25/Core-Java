package Inheritence;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private String specialization;
	
	Doctor(int doctorId , String doctorName,String specialization){
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.specialization=specialization;
		}
	public int getDoctorId() {
		return doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
		public String getspecialization() {
	    return specialization;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId=doctorId;
		}
		public void setDoctorName(String doctorName) {
			this.doctorName=doctorName;
		}
			public void setspecialization(String specialization) {
				this.specialization=specialization;
		}
			public void displayDetails() {
				System.out.println("Doctor Id: "+doctorId);
				System.out.println("Doctor Name: "+doctorName);
				System.out.println("Doctor specialization: "+specialization);
			}
	
	

}
