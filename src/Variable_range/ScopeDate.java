package Variable_range;
import java.util.Scanner;
// 상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미한다
// 변수와 다른 점은 프로그램이 실행되는 동안 값의 변경이 안됨 .
// 자바에서 상수는 Final 키워드로 정의하고 단, 한번만 값을 설정 할 수 있음.

public class ScopeDate {
    public static void main(String[] args) {
//        int value = 10; //지역변수
//        int sum = value + 20;
//        System.out.println(sum);

        final double taxRate = 0.10;
        Scanner sc = new Scanner (System.in);
        System.out.print("당신의 수입을 입력하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야 할 세금은 " + income * taxRate);

    }
}
