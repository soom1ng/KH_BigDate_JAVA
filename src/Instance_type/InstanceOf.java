package Instance_type;

import org.w3c.dom.ls.LSOutput;

public class InstanceOf {
    public static void main(String[] args) {


        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); // true
        System.out.println(child instanceof Child); // true
        System.out.println(parent instanceof Parent); // false
        System.out.println(child instanceof Child); // true

    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {

    public Child(String name) {
        super(name);
        this.name = name;
    }
}