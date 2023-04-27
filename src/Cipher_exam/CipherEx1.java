package Cipher_exam;

// 암호화 키의 반복 : lovelovelove => love 문자열을 입력 받은 문자 배열로 만듬 . 맨자 배열의 길이는 4 = [0, 1, 2, 3]
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CipherEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 입력 : ");
        String normal = sc.nextLine(); // 평문은 공백 허용이기 떄문에 nextLine() 사용
        System.out.print("암호화 키 입력 : ");
        String cipher = sc.next();

        int cnt;
        String rst;
        char[] nmArr = normal.toCharArray();
        char[] cpArr = cipher.toCharArray(); // 암호화 키를 문자 배열로 변경

        if (nmArr.length % cpArr.length == 0) {
            cnt = nmArr.length / cpArr.length;
        } else cnt = (nmArr.length / cpArr.length) + 1;

        List<Character> rstArr = new ArrayList<>();
        for(int i = 0; i < cnt; i++) {

        }

        for(int i = 0; i < nmArr.length; i++) {
            if((nmArr[i] - cpArr[i]) <= 0) {
//                nmArr[i] = ((char)nmArr[i] - (char)cpArr[i]) + 26;
            } else nmArr[i] -= cpArr[i];
        }
    }
}
