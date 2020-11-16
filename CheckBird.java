 
package javaconcepts;

 //Static polymorphism
class Birdi {
	public void fly() {
		System.out.println("The bird is flying.");
	}
	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}
	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
}

//Dynamic polymorphism
class Animal2 {
	public void eat() {
		System.out.println("This animal eats insects.");
	}
}

class Birdo extends Animal2 {

        @Override
	public void eat() {
		System.out.println("This bird eats seeds.");
	}

}

class CheckBird {
	public static void main(String[] args) {
	//Calling For static Polymorphism	
            Birdi myBird = new Birdi();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);
                
        //Calling For Dynamic Polymorphism

            Animal2 myAnimal = new Animal2();
		myAnimal.eat();

		Birdo myBird1 = new Birdo();
		myBird1.eat();
	}
}