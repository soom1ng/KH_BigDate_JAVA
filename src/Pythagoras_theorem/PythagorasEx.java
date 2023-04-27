package Pythagoras_theorem;

import java.util.Scanner;

public class PythagorasEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] trg = new int [3];

        while (true) {
            if (true) {
                System.out.print("세 변의 길이 입력 : ");
                for (int i = 0; i < trg.length; i++) {
                    trg[i] = sc.nextInt();
                }
                    if ((Math.pow(trg[0], 2) + Math.pow(trg[1], 2) == Math.pow(trg[2], 2))) {
                        System.out.println("right");
                    } else System.out.println("wrong");
            } else if (trg[0] == 0 && trg[1] == 0 && trg[2] == 0) break;
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
