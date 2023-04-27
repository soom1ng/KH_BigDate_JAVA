package aatest;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("문자열입력:");
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("exit")) break;
            else {
                System.out.println(str.length() + "글자");
            }
        }
        System.out.println("프로그램 종료");
    }
}
