package Swich_calculator;

import java.util.Scanner;

public class SwichCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산식을 입력 하세요 : ");
        int x = sc.nextInt(); // 연산자의 좌변값을 입력받음 .
        char op = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        int y = sc.nextInt(); // 연산자의 우변값을 입력 받음 .

        switch(op)
        {
            case '+' :
                System.out.println("덧셈 결과는 " + (x + y));
                break;
            case '-' :
                System.out.println("뺼셈 결과는 " + (x - y));
                break;
            case '*' :
                System.out.println("곱셈 결과는 " + (x * y));
                break;
            case '/' :
                System.out.println("나눗셈 결과는 " + (x / y));
                break;
            case '%' :
                System.out.println("나머지 결과는 " + (x % y));
                break;
            default : System.out.println("연산자를 잘못 입력하셨습니다.");
        }
    }
}
