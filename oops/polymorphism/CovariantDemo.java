package oops.polymorphism;

class Animal {
    String str = "Animal";
    void m1() {
        System.out.println("Animal class");
    }
}

class Dog extends Animal {
    String str = "Dog";
    @Override
    void m1() {
        System.out.println("Dog class");
    }
}


class Parent1 {
    Animal getAnimal() {
        return new Animal();
    }
}

class Child1 extends Parent1 {
    @Override
    Dog getAnimal() {
        return new Dog(); // ✅ Covariant return type
    }
}


public class CovariantDemo {
    public static void main(String[] args) {
        Child1 ob = new Child1();
        Animal a = ob.getAnimal();
        a.m1();
        System.out.println(a.str);
    }
}
