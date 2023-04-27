package Sum_cycle;

// 입력 받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 돌아오는지 확인하는 문제
// 입력 26 => 10의 자리 수(2), 1의 자리 수 (6)을 분리해서 더함 => 2 + 6 = 8
// 입력 받은 수의 1의 자리 수와 계산된 수의 1의 자리 수로 다시 연산 => 68
// --------- 1 Cycle ---------
// 68 => 6 + 8 = 14
// 계산 된 수는 84
// --------- 2 Cycle ---------
// 84 => 8 + 4 = 12
// 계산 된 수는 42
// --------- 3 Cycle ---------
// 42 => 4 + 2 = 6
// 계산된 수는 26
// --------- 4 Cycle ---------
// 입력된 수: 26 = 계산된 수: 26
// 출력 : 4

import java.util.Scanner;

public class SumExFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 사이클 횟수 누적
        int sumNumber = 0; // 입력 받은 수의 10의 자리 수와 1의 자리를 분리해서 더한 값의 저장 공간
        int newNumber = 0; // 새롭게 만들어진 수

        System.out.print("0 - 99 사이의 정수 입력 : ");
        int input = sc.nextInt(); // 26
        int num = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값 생성

        while (true) {
            sumNumber = (num * 10) + (num % 10); // 입력 값을 10의 자리와 1의 자리로 분리해서 더함
            newNumber = (num * 10) * 10 + (sumNumber % 10); // 입력 값의 1의 자리와 계산 된 값의 1의 자리 더함
            cnt++;
            if (newNumber == num) break; // 더하기 조건에 따라 1 Cycle 순회 후 입력 받은 값과 비교
            num = newNumber; // 순회를 위해 만들어진 값을 순회용 변수에 대입
        }
        System.out.println(cnt);
    }
}
