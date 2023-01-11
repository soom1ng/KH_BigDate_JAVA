package Maximun_minimun;
// 정수 값 입력
// 입력된 정수 범위의 임의의 값을 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 3 6 2 15 3 11 4 9 18
// MIN : 1 , MAX : 18

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);

        // 정수 값을 입력 받음 .
        System.out.print("배열의 갯수 입력 : ");
        int arrNum;
        arrNum = sc.nextInt();

        // 입력받은 변수 크기의 배열을 생성
        int[] arr = new int[arrNum];

        // 생성된 배열 갯수만큼 순회하면서 정수 값을 입력 받음 .
        System.out.printf("배열에 들어 갈 숫자 %d개 입력 : ", arrNum);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열의 값 출력
//       for(int i : arr) System.out.print(i + " ");

        // 값을 비교하기 위해서 기준 값이 필요한데, 배열의 0번쨰 값을 기준 값으로 저장
        int min = arr[0];
        int max = arr[0];

        // 배열에서 제일 작은 값과 제일 큰 값을 찾음 .
        for (int e : arr) {
            if (min > e) min = e;
            if (max < e) max = e;
        }

//        for(int i = 0; i < arr.length; i++) {
//            if(min > arr[i]) min = arr[i];
//            if(max < arr[i]) max = arr[i];
//        }

        // 출력
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}

