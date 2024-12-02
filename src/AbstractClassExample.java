

abstract class Animal
{
	abstract void sound();
	
	void display()
	{
		System.out.println("class from Animal");
	}
}

class Cat extends Animal{
	void sound()
	{
		System.out.println("mau");
	}
	void display()
	{
	System.out.println("Cat Class");
	}
}

class Dog extends Animal{
	void sound()
	{
		System.out.println("bark");
	}
	void display()
	{
	System.out.println("Dog Class");
	}
}


public class AbstractClassExample {
	
public static void main(String args[])
{
	Animal d=new Dog();
	d.display();
	d.sound();
	Animal c=new Cat();
	c.display();
	c.sound();
}
}
