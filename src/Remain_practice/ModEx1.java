package Remain_practice;
import java.util.Scanner;
// 100의 자리 정수를 입ㅂ력 받아서 3개의 변수 (100자리/10자리/1자리)에 대입하기
// 365 일뗴, a = 3, b = 6, c = 5

public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력 하세요 :");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; // 100으로 나는 몫만 취함 .
        b = (num % 100) / 10; //100으로 나누고 남은 나머지를 다시 10으로 나눈 몫을 취함 .
        c =  num % 10; // 10으로 전부 나누고 남는 나머지가 값이 됨 .

        System.out.println("100의 자리 : " + a + " 10의 자리 : " + b + " 1의 자리 : " + c);
    }
}
