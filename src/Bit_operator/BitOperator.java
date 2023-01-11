package Bit_operator;
// 비트 연산자 : 비트 단위로 연산을 수행 (1/0)
// & (비트 AND) : 두개의 비트가 모두 1이면 1
// | (비트 OR) : 둘 중에 한개의 비트만 1이면 1
// ^ (XOR) : 두개의 비트 값이 같으면 0, 다르면 1
// ~ (비트 NOT, 비트의 값을 반전) : 비트가 0이면 1, 1이면 0으로 비트를 반전 시킴 .
// << (Shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동 시킴 .
// >> (Shift 연산자) : 지정된 수만큼 오른쪽으로 비트를 이동 시킴 .

import java.sql.SQLOutput;

public class BitOperator {
    public static void main(String[] args) {

        int num1 = 10; // 00001010
        int num2 = 12; // 00001100
        System.out.println(num1 & num2); // 1000 = 8
        System.out.println(num1 | num2); // 1110 = 14
        System.out.println(num1 ^ num2); // 0110 = 6
        System.out.println(~num1); // -11
        System.out.println(num1 << 1); // 20
        System.out.println(num1 >> 1); // 5

    }
}
