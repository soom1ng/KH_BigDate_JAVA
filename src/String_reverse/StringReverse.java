package String_reverse;
import java.util.Scanner;

// abcdefg => gfedcba
// 힌트 : for 문을 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String rever = sc.next();
        //        System.out.println(rever);

        // while 문 사용
//        int index = rever.length();
//        while (true) {
//            index--;
//            System.out.print(rever.charAt(index));
//            if (index == 0) break;

        // for 문 사용
        for(int i = rever.length()-1; i >= 0; i--) {
            System.out.print(rever.charAt(i));

        }
    }
}

