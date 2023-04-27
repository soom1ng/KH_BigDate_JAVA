package Decimal_to_binary;

import java.util.Scanner;

import java.util.Scanner;
// 10진수를 입력 받아 2진수로 변경 -> 10진수 변경
// 배열을 사용 하지 않고 정수 타입 변수를 이용해 변환, 문자열 사용금지 (decimalToBinary)

public class ConverseExFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("10진수 입력 : ");
        int num = sc.nextInt();
        num = decToBin(num);
        System.out.println("2진수 : " + num);
        num = binToDec(num);
        System.out.println("10진수 : " + num);
    }

    static int decToBin(int dec) { // 10진수를 입력 받아서 2진수 변환
        int calc; // 계산으로 만들어진 2진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리 이동을 위한 포지션 변수

        while (dec != 0) {
            calc = dec % 2; // 2로 나눈 나머지를 구함
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;
    }
    static int binToDec(int bin) { // 2진수를 입력 받아 10진수 반환
        int dec = 0; // 최종 결과
        int i = 0; // Index 게산용 변수
        int tmp; // 계산을 위한 임시 값 저장 공간

        while (bin != 0) {
            tmp = bin % 10; // 10으로 나눈 나머지 구함
            bin = bin / 10;
            dec += tmp * Math.pow(2, i++);
        }
        return dec;
    }
}
