interface SampleInter
{
}

class Animal implements SampleInter
{
	String name;
	
	public Animal()
	{
		// super();
		this("Default Name");
		this.name = "Default Name";
		
	}
	
// This is called a one argument constructor.
	public Animal(String name)
	{
		this.name = name;
	}
	
	void callConstructor()
	{
		
	}
	
	public String shout()
	{
		return "Don't Know!";
	}
	
	public static void main(String[] args)
	{
		//Animal animal = new Dog();
		
		//((Dog)animal).run();
		//((Cat)animal).run1(); //Dog cannot be cast to Cat
		
		//Cat cat = new Animal(); //Animal cannot be cast to Cat
		
		SampleInter si = new Animal();
		SampleInter si2 = new Cat();
		SampleInter si3 = new Dog();
			
		System.out.println(((Animal)si).shout());
		System.out.println(((Cat)si2).shout());
		System.out.println(((Dog)si3).shout());
		((Dog)si3).run();
	}
}

class Cat extends Animal
{
	public String shout()
	{
		return "Meow Meow";
	}
	
	public void run1()
	{
		System.out.println("Cat run2()");
	}
}

class Dog extends Animal
{
	public String shout()
	{
		return "BOW BOW";
	}
	
	public void run()
	{
		System.out.println("Dog run()");
	}
}
