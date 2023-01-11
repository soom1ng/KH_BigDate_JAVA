package Toup_lower_case;

import java.util.Scanner;

// 영문자 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 변경하기 .
// 무조건 입력은 영문자이다.
// ex) ABcdEfG -> abCDeFg
// 힌트1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)이다.
// 힌트2 : 자바에서의 문자는 정수값으로 사용된다.
// 힌트3 : 정수 값으로 계산 후, 출력 시 (char) 형 변환이 필요하다 .
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String change = sc.next();
        //        System.out.println(change);

        char ch;
        for (int i = 0; i < change.length(); i++) {
            ch = change.charAt(i);
            if (ch < 'a') System.out.print((char)(ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));

//            if (ch >= 'a') ch -= 32;
//            else ch += 32;
//            System.out.print((char)ch);
        }
    }
}