package chap10.sec02.art04;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.print(dog.name + " ");
		changeDog(dog);

		Animal animal = new Dog();
		System.out.print(animal.name + " ");
		changeDog(animal);

		Cat cat = new Cat();
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println(dog.name);
		} else {
			System.out.println("ClassCastException ¹ß»ý");
		}

	}
}

class Animal {
	String name = "Animal";
}

class Dog extends Animal {
	String name = "Dog";
}

class Cat extends Animal {
	String name = "Cat";
}
