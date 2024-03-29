package Find_multiple_num;
// 문제 : 정수 n과 수의 목록이 주어졌을때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 줄에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어 있는 수가 주어짐 (0 ~ 10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력 함 .
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문을 종료하는 입력키

// 1 is NOT a multiple of 3.
// 7 is NOT a multiple of 3.
// 99 is a multiple of 3.
// 321 is a multiple of 3.
// 777 is a multiple of 3.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // ArrayList 로 생성하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 수
        int val; // 주어진 값이 배수인지 아닌지 판별하기 위해서 값을 입력 받음 .
        while (true) { // 항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출 조건이 필요
            val = sc.nextInt(); // 키보드로 부터 값을 입력 받음 .
            if(val == 0) break; // 반복문의 탈출 조건
            list.add(val); // add 에 인덱스를 지정하지 않은면 마지막 위치에 저장 됨 .
        }
        for (Integer v : list ) {
            if(v % n == 0) System.out.println(v + " is a multiple of " + n + ".");
            else System.out.println(v + " is NOT a multiple of " + n + ".");
        }
    }
}
