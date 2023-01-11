package Method_practice;
// 메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대/소문자, _, $, 숫자 사용가능, 단 숫자가 제일 처음에 오면 안됨 .)
// camel 표기법 사용
// 접근제한자 반환타입 메소드이름(매게변수목록) { 구현부; return }

import java.sql.SQLOutput;
import java.util.Scanner;

public class classMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); // 생성자 호출 시 전달하는 매개변수가 없음 .
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 값 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rst = sample.sum(num1, num2); // sum() 메소드의 호출부에서 인수로 값을 전달 .
        System.out.println(rst);
        sample.say();
        System.out.println(sample.sayStr());
    }
}
