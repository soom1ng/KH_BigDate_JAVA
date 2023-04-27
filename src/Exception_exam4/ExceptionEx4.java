package Exception_exam4;
// ArithmeticException : 연산 오류

import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("계산 할 수 없습니다. 다시 입력 하세요.");
                continue;
            }
            System.out.println("결과 : " + rst);
            break;
        }
    }
}
