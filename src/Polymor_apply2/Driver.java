package Polymor_apply2;

public class Driver {
    String name; // 운전자 이름
    public Driver(String name) {
        this.name  = name;
    }
    public void drive(Vehicle2 vehicle2) {
        System.out.print(name + "의 ");
        vehicle2.run();
    }
}
