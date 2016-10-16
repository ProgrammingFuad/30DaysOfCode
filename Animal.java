
public class Animal {
	private int age;
		
	public Animal(int age){
		System.out.println("An Animal has been created!");
		this.age=age;
	}
	
	public void eat(){
		System.out.println("An animal is eating");
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal(5);
		
			Dog d = new Dog();
			Cat c = new Cat();
			d.ruff();
			c.meow();
			animal.eat();
			d.eat();
			c.eat();
			c.prance();
			d.run();
			
			System.out.println(d.getAge());
			System.out.println(c.getAge());
			
			////What happens if...
			//Animal o = new Dog();
			
			
	}

}
