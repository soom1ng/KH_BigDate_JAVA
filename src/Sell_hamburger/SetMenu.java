package Sell_hamburger;
// 햄버거 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3가지 종류, 음료는 2가지 종류
// 햄버거와 음료 총 5가지 음식의 가격을 연속으로 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택하고, 음료 2가지 중 가장 싼 것을 선택하면, 세트 메뉴 이기 때문에 50원 할인 됨 .
// 총 세트메뉴의 금액을 구하는 문제

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] menu = new int[5]; // 5개의 정수로 구성된 배열 생성
        System.out.print("메뉴의 가격을 입력하세요 : "); // 햄버거 3개와 음료 2개의 가격을 입력받기 위한 화면 출력
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt(); // 배열의 길이만큼 순회하면서 값을 연속으로 입력받음 .
        }
//        for(int i : menu) System.out.print(i + " ");

        int minBurger = menu[0]; // 0 ~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3 ~ 4 인덱스 사이의 음료수 중 하나의 값을 기본값으로 설정
        // 반복문을 순회하면서 햄버거 1개와 음료 1개를 선택 (가장 싼 것으로 선택함 .)
        for(int i = 0; i < menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i]; // menu : [1000, 2000, 3000, 1000, 2000]
        }
        System.out.println(minBurger + minDrink - 50); // minBurger: 1000  minDrink: 500
    }
}
