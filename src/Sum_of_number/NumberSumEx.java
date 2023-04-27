package Sum_of_number;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있음 . 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 7000000
// 출력 : 7
// 입력 : 0000
// 프로그램 종료
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("숫자 입력 : ");
            String num = sc.next();

            //char[] numArr = num.toCharArray();
            if(num.equals("0000")) break;
            int rst = 0; // 한번 계산 결과를 출력 후 초기화가 되어야 함 .
            for (int i = 0; i < num.length(); i++) {
                //int n = Character.getNumericValue(numArr[i]);

                int n = num.charAt(i) - '0';
                rst += n;
            }
            System.out.println("출력 : " + rst);
        }
    }
}
