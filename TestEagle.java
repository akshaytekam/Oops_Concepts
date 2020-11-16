 
package javaconcepts;

 
interface Animal {
	public void eat();
	public void sound();
}

interface Bird {
	int numberOfLegs = 2;
	String outerCovering = "feather";

	public void fly();
}

class Eagle implements Animal, Bird {
        @Override
	public void eat() {
		System.out.println("Eats reptiles and amphibians.");
	}
        @Override
	public void sound() {
		System.out.println("Has a high-pitched whistling sound.");
	}
        @Override
	public void fly() {
		System.out.println("Flies up to 10,000 feet.");
	}
}

class TestEagle {
	public static void main(String[] args) {
		Eagle myEagle = new Eagle();

		myEagle.eat();
		myEagle.sound();
		myEagle.fly();

		System.out.println("Number of legs: " + Bird.numberOfLegs);
		System.out.println("Outer covering: " + Bird.outerCovering);
	}
}

     
    

