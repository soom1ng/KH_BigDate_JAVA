package Inheritance;

public class BasicInheritance {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("몽몽이");
//        System.out.println(dog.name);

        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep();
        houseDog.sleep(4);
    }
}
