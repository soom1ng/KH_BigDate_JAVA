package Nested_interface;
// 중첩 인터페이스란 ? 클래스 내부에 선언한 인터페이스
// 주로 UI 프로그래밍에서 이벤트 처리를 위해 사용 함 .
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch(); // touch() 메소드 호출, 등록 된 리스너의 onClick() 를 호출 함 .
        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
