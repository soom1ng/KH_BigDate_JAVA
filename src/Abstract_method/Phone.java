package Abstract_method;
// 추상 클래스 만들기
// 인스턴스 필드 포함, 생성자 포함

public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name) { // 매개 변수가 있는 생성자를 만듬 .
        this.name = name;
    }
    void setPower(boolean power) {
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power ON");
        } else {
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call(); // 상속을 받는 클래스에서 반드시 오버라이딩 해서 구현 해야 함 .

    abstract void internet();
}
