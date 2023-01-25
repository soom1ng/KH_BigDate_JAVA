package Find_second_number;
// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기
// 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10번째
// 임의의 수 입력 (10개) : 1 2 3 4 5 5 6 7 8 2
// 찾을 수 : 5
// 결과 : 6번째
// 만약 2번째 등장하는 수가 없으면 -1 출력

import java.util.Scanner;

public class SecondNum {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int cnt = 0; // 몇 번째 나타나는 수인지 확인

        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 수(10개) 입력 : ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt(); // 입력 받은 각각의 임의의 수를 배열에 대입
        }
        System.out.print("찾을 숫자 입력 : ");
        int secNum = sc.nextInt();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == secNum) // System.out.println((i + 1) + ""); 찾는 수가 모두 나옴 .
                cnt++;
            if (cnt == 2) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
