package Basic_program; // 접근제한자(캡슐화)와 연관성이 있음.
// 접근제한자 : public, protected, default, private

/*
범위주석 공간
: 주석이란 사람은 이해하고, 컴파일러는 무시하는 영역이다.
- 저자 : 김수민
- Date : 2023.01.02 오전 10:15
- 목적: 자바 연습용 프로그램
 */

public class BasicSample { // 클래스 이름을 지정, 클래스 이름은 관례상 첫자를 대문자로 사용함 .
    // main 메소드는 프로그램의 시작 위치를 의미하며 JWM이 호출함 .
    // void는 메소드 실행 이후의 반환 타입 중 하나임 .
    // {중괄호} : 클래스, 메소드 등의 범위를 결정함 .
    // (소괄호) : 메소드의 매개변수를 넣음 .
    // [대괄호] : 배열 등을 정의 할 때 사용 됨 .

    public static void main(String[] args) {
        System.out.print("Hello");
    }
}
