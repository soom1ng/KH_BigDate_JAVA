package Singleton_patten;
// 싱클톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
// 사용하는 이유 : 메모리의 효율성과 데이터 공유의 이점이 있음 .
// 단점 : 구현이 까다로움, 데이터의 무결성이 깨질 수 있음 ( 멀티쓰레드에서 사용시 동기가 필요함 .)
public class SingletonMain {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); // 생성되지 않음
// Singleton class
//        Singleton singleton1 = Singleton.getSingleton();
//        Singleton singleton2 = Singleton.getSingleton();
//        if (singleton1 == singleton2) { // 값이 같은지를 비교하는 것이 아니고, 참조하는 주소가 같은지 판별하는 것 .
//            System.out.println("같은 싱글톤 객체를 참조 합니다.");
//        } else {
//            System.out.println("다른 싱글톤 객체를 참조합니다.");
//        }
//        singleton1.id = 123;
//        singleton1.name = "김수민";
//        System.out.println(singleton1.id);
//        System.out.println(singleton1.name);
//        System.out.println(singleton2.id);
//        System.out.println(singleton2.name);

// referenceTest class
        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("안유진", 21);
        ref2.viewInfo();
    }
}
