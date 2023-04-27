package Less_valueX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 N개로 이루어진 배열 A와 정수 X가 주어지면, A에서 X보다 작은 수를 모두 출력 한다.
// 10 5 => 배열의 길이, 주어진 수
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3

public class LessThanEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // 주어진 수
        int num2 = sc.nextInt(); // 주어진 수

        for(int i = 0; i < num1; i++) {
            list.add(sc.nextInt());
            if (list.get(i) < num2) {
                System.out.println(list.get(i) + " ");
            }
        }



//        int val;
//        while (true) { // 항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출 조건이 필요
//            val = sc.nextInt(); // 키보드로 부터 값을 입력 받음 .
//            if (val == 0) break; // 반복문의 탈출 조건
//            list.add(val); // add 에 인덱스를 지정하지 않은면 마지막 위치에 저장 됨 .
//        }
//        for (Integer v : list) {
//            if (v % n == 0) System.out.println(v + " is a multiple of " + n + ".");
//            else System.out.println(v + " is NOT a multiple of " + n + ".");
//        }
    }
}