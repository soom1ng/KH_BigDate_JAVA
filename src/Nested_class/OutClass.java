package Nested_class;

public class OutClass {
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 정적 변수 (클래스 소속의 변수)
    InClass inClass; // 아직 내부 클래스를 만들지 않았음 .
    private OutClass() { // 외부 클래스에 대한 생성자 호출
//        inClass = new Inclass();
    }
    class InClass{
        int num = 100;
    }

}
