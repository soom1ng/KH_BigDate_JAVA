package Condition_IF;

import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();

//        if(number >= 0) { //number 값이 0과 같거나 크면 참 .
//            System.out.println(number + "는 양수 입니다.");
//        } else {
//            System.out.println(number + "는 음수 입니다.");
//        }

        if(number > 100) { //number 100보다 크면 참 .
            System.out.println(number + "는 100보다 큽니다.");
        } else if(number < 100) {
            System.out.println(number + "는 100보다 작습니다.");
        } else {
            System.out.println(number + "는 100과 같습니다.");
        }
        System.out.println("프로그램이 끝났습니다.");
    }
}
