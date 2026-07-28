package Abstractclass;

class PavBhaji extends Restaurant{
	public PavBhaji(String name,String location){
		super(name,location);
	}
	@Override
	public void prepareFood() {
		System.out.println("Make Pav,Make Bhaji,serve it hot");
	}

}
