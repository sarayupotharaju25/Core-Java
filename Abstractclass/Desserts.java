package Abstractclass;

class Desserts extends Restaurant{
	public Desserts(String name,String location){
		super(name,location);
	}
	@Override
	public void prepareFood() {
		System.out.println("Yummy deliciouss hot and sweet desserts are served here");
	}

}
