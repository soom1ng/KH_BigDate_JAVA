package Generic_exam;
// 제네릭 타입 : 타입 변수를 사용해 다형성 구현
public class GenericTestEx2 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("김수민");
        System.out.println(p1.info);

        Person<Integer> p2 = new Person<>(220410);
        System.out.println(p2.info);

    }
}
// 'T' : 타입 변수라고 하며, 임의의 참조형 타입을 의미 함 .
// 일반적으로 변수 이름을 'T'을 사용하고, 아무 이름으로 지어도 상관 없음 .
class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }
}
