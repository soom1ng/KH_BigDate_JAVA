package Swich_basic;
// 스위치문은 조건문이며, 스위치에는 조건식은 넣을 수 없고 조건에 대한 변수만 올 수 있음 .
// 변수는 정수, 문자, 문자열만 사용 가능
// 스위치의 각 케이스를 끝내기 위해서는 반드시 break 문이 필요함 .
// 해당하는 케이스가 없는 경우를 위해 default 문이 필요함 .

import java.util.Scanner;

public class SwichSeason {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season = sc.next(); // 공백을 기준으로 문자열을 입력 받음 .

        switch(season) {
            case "봄":
                System.out.println("꽃이 피는 봄이 왔숩니다 `3`");
                break;
            case "여름":
                System.out.println("무더운 여름입니다 'ㅠ'");
                break;
            case "가을":
                System.out.println("쓸쓸한 가을입니다 `3`");
                break;
            case "겨울":
                System.out.println("눈이 펑펑 오는 겨울입니다 `ㅇ`");
                break;
            default :
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}
