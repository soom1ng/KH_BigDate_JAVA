package Wrapper_class;
// 래퍼 클래스란 ? 기본 타입을 객체 타입으로 변환 시켜 주는 것
// 컬렉션 프레임워크의 자료형은 모두 객체 타입이므로 기본 타입을 사용할 수 없기 때문에 사용 함 .
// 객채 타입으로 사용하는 이유는 일반화 프로그램을 위해서 이며,
// 일반화 프로그램은 여러가지 다양한 데이터 타입에 대해서 동일한 자료구조를 관리하기 위함 .
public class WrapperTest {
    public static void main(String[] args) {
        Integer num = 10;
        int n = num.intValue();
        System.out.println(n);
    }
}
