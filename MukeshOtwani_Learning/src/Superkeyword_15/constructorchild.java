package Superkeyword_15;

public class constructorchild extends constructorparent {

	public static void main(String[] args) {
		constructorchild obj = new constructorchild("Siddhant");

	}

	public constructorchild() {

		System.out.println("I am in child class constructor");

	}

	public constructorchild(String name) 
	{

		super(name);
		System.out.println("I am in child class constructor: " + name);
	}

}
