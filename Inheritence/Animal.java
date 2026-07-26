package Inheritence;

public class Animal {
        String name = "animal";
        public Animal(int a) {
        	System.out.println(a);
        	System.out.println("Its animal const");
        }
        
        
        void makeSound() {
        	System.out.println("Its animal");
        	System.out.println(getClass().getSuperclass());
        }
        	
}
