package OOPs;

public class Hospital {
	int id;
	String name;
	String disease;
	double bill;
	public Hospital(int id) {
		this.id=id;
		System.out.println("Patient id : "+id);
	}
	public Hospital(int id,String name) {
	this(id);
	this.name=name;
	System.out.println("Patient name: "+name);
	}
	public Hospital(int id,String name,String disease) {
		this(id,name);
		this.disease=disease;
		System.out.println("Disease: "+disease);
	}
	public Hospital(int id,String name,String disease,double bill){
		this(id,name,disease);
		this.bill=bill;
		System.out.println("Bill amount:"+bill);
	}
	

	public static void main(String[] args) {
		Hospital p1=new Hospital(10,"Keerthi","Motions",1000000.0);

	}

}
