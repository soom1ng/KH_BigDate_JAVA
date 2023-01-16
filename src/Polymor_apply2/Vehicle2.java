package Polymor_apply2;

public class Vehicle2 {
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
class SportsCar extends  Vehicle2 {
    @Override
    public void run() {
        System.out.println("스포츠가가 달립니다.");
    }
}
class Bus extends Vehicle2 {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle2 {
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
