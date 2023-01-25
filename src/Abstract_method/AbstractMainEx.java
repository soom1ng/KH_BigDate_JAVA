package Abstract_method;

public class AbstractMainEx {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("Iphone 12 mini");
        phone.setPower(true);
        phone.call();
        phone.internet();
    }
}
