package KMP_ex;

import java.util.Arrays;
import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        // 첫번째 방법 : split();
        String[] splitName = name.split("-");
        for (String e : splitName) System.out.print(e.charAt(0));

        // 두번째 방법 : 대문자만 골라내는 방법
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }

        // 세번째 방법 : 0번째 문자 출력, 그리고 '-'다음의 문자 출력
//        for (int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }

        // 네번째 방법 : 문자 배열로 변경 후, 대문자 골라내기
//        char[] chName = name.toCharArray();
//        for(char e : chName) {
//            if(e >= 'A' && e <= 'Z') System.out.print(e);
//        }

    }
}