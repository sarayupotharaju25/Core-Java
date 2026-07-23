package Polymorphism;

public class ElectricityBill {
	public void cB(int units) {
		double bill = units*8;
		System.out.println("Bill: "+bill);
	}
	public void cB(int units,double serviceCharge) {
		double bill = (units*8)+serviceCharge;
		System.out.println("Bill with Service Charge: "+bill);
	}
	public void cB(int units,double serviceCharge,double tax) {
		double bill = (units*8)+serviceCharge;
		double finalbill = bill+(bill*tax/100);
		System.out.println("FinalBill+tax : "+finalbill);
	}

}
