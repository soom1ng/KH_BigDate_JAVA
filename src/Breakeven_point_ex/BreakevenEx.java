package Breakeven_point_ex;

import java.util.Scanner;

// 첫번째 : 고정비용
// 두번째 : 가변비용
// 세번째 : 판매금액
// 손익분기점을 달성할 수 없으면 -1
public class BreakevenEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();
//        int cnt = 0;
        if (varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost / (sellPrice - varCost)) + 1);

//        while(true) {
//            if(fixCost + ( varCost * cnt) < sellPrice * cnt) break;
//        }
//        System.out.println();
//    }
    }
}
