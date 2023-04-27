package Pythagoras_theorem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PythagorasExFinal {
    public static void main(String[] args) {
        ArrayList<String> rstList = new ArrayList<>();
        String rst;
        while (true) {
            rst = calcFunc();
            if(rst.equalsIgnoreCase("exit")) break;
            rstList.add(rst);
        }
        for (String e : rstList) System.out.println(e);
    }

    static String calcFunc() {
        Scanner sc = new Scanner(System.in);

        int[] trg = new int[3]; // 3변의 길이를 입력 받기 위한 배열
        int sum = 0;

//        while (true) { // 0 0 0 이 들어 올 때 까지 반복 수행
        System.out.print("세 변 길이 입력 : ");
        for(int i = 0; i < trg.length; i++) {
            trg[i] = sc.nextInt();
            sum = trg[i];
        }
        if(sum == 0) return "exit";
        Arrays.sort(trg); // 오름차순 정렬
        if ((trg[0]*trg[0]) + (trg[1]*trg[1]) == trg[2]*trg[2]) {
            return "right";
        }
        return "wrong";
    }
}

