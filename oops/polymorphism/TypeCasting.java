package oops.polymorphism;

class Parent {
	
	public void dress() {
		System.out.println("Parent dress");
	}
	
	public void money() {
		System.out.println("Parent money");
	}
}

class Child extends Parent {
	
	public void dress() {
		System.out.println("Child dress");
	}
	
	@Override
	public void money() {
		System.out.println("Child money");
	}
}

class GrandChild extends Child {
	public void dress() {
		System.out.println("GrandChild dress");
	}
}

public class TypeCasting {

	public static void main(String[] args) {
		
		Parent p = new Child();  // Upcasting
		
		p.dress();
		p.money();
		
		
		Child c = (Child) p; // Downcasting
		
		c.dress();
		c.money();
		
		Parent parent = new GrandChild();
		parent.dress();
		
		GrandChild g = (GrandChild) parent; // Downcasting
		g.dress();
		
	}

}
