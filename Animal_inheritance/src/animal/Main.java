package animal;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		System.out.println("Imma dog");
		d.eat();
		d.sleep();
		d.bark();
		
		Cat c = new Cat();
		System.out.println("\nImma Kitty");
		c.eat();
		c.sleep();
		c.meow();
		
		Bird b = new Bird();
		System.out.println("\nImma Birdy");
		b.eat();
		b.sleep();
        b.chirp();
	}

}
