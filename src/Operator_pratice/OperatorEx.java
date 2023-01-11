package Operator_pratice;
import InOutPut_ex1.SystemInOut;

import java.util.Scanner;
// 이항 연산자와 삼항 연산자
// 산술 연산자 : =, -, *, /, %(나머지 연산자)
// 대입 연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어 남 .
// 복합 대입 연산자 : 대입 이전에 자신의 값과 연산 후에 대입됨 .
// 증감 연산자 : 값을 1 증가하거나 감소시키는 연산자(단항연산자) ==,--
// 우위와 전위에 따라 상황이 달라짐
// 비교 연산자 : 값의 크기를 비교하는 연산자
// 논리 연산자 : 참과 거짓을 판단 하는 것? AND(&&) OR (||) NOT(!)
// 삼항 연산자 : 항이 3개인 연산자 (참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args) {

// 산술 연산자
//        int num1 = 10, num2 = 0;
//        System.out.println("+ 연산자 : " + (num1 + num2));
//        System.out.println("- 연산자 : " + (num1 - num2));
//        System.out.println("* 연산자 : " + (num1 * num2));
            // System.out.println("/ 연산자 : " + ((double)num1 / num2));
            // System.out.println("% 연산자 : " + (num1 % num2));
//        try {
//            System.out.println(num1 / num2);
//        } catch(ArithmeticException e) {
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }
//        try {
//            System.out.println(num1 % num2);
//        } catch(ArithmeticException e) {
//            System.out.println("값을 0으로 나누면 안됩니다.");
//        }

// 대입 연산자
//        int num1 = 10;
//        System.out.println(num1 += 2); // num1 = num1 + 2;
//        System.out.println(num1 -= 2); // num1 = num1 - 2;
//        System.out.println(num1 *= 2); // num1 = num1 * 2; -> 곱셈부터는 자주 사용하지 않음 .
//        System.out.println(num1 /= 2); // num1 = num1 / 2;
//        System.out.println(num1 %= 2); // num1 = num1 % 2;

// 비교 연산자
//        int x = 10, y = 20;
//        System.out.println(x > y); // false
//        System.out.println(x < y); // true
//        System.out.println(x == y); //== 같다라는
//        System.out.println(x >= y); // false
//        System.out.println(x <= y); // true

//논리 연산지
//        int x = 10, y = 20;
//        boolean rst1, rst2, rst3;
//        rst1 = (x > y) && (x > 5); // 거짓
//        rst2 = (x > y) || (x > 5); // 참
//        rst3 = !((x > y) || (x > 5)); // 거짓

// 삼항 연산자
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력 하세요. : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false;
//
//        System.out.println(isAdult);

// 문자열 결합 연산자
//        System.out.println("Java" + (11.03 + 12));
    }
}
