package Cipher_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CipherExFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 입력 : ");
        String normal = sc.nextLine(); // 평문은 공백 허용이기 떄문에 nextLine() 사용
        System.out.print("암호화 키 입력 : ");
        String cipher = sc.next();

        char[] cpArr = cipher.toCharArray(); // 암호화 키를 문자 배열로 변경
        char value = 0; // 암호문을 만들기 위한 문자 변수

        List<Character> cp = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++) {
            if(normal.charAt(i) == ' ') cp.add(' ');
            else {
                value = (char) (normal.charAt(i) - (cpArr [ i % cipher.length()] - 'a') - 1);
                if(value < 'a') value += 26;
                cp.add(value);
            }
        }
        for(Character e : cp) System.out.print(e);
     }
}
