package Abstractclass;

 class Shawarma extends Restaurant {
	 public Shawarma(String name,String location) {
		 super(name,location);
		 
	 }
	 @Override
	 public void prepareFood() {
		 System.out.println("Preparing chapati,adding veggies,rool it up");
	 }
	

}
