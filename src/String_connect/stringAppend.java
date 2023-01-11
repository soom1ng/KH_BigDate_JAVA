package String_connect;

import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 입력 :seoul
// 두번째 문자열 입력 : korea
// 첫번쨰 문자열에서 입력받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번째 문자열 앞에 추가하기
// 정수값 입력 : 2 => 출력값 : ulkorea
// 정수값 입력 : 3 => 출력값 : oulkorea
// 힌트1 : substring(index) : 문자열의 시작 위치부터 끝까지 잘라냄 .
// 힌트2 : substring 메소드를 이용해서 문자열을 추출하기 전, 인덱스 계산이 필요
public class stringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문자열 입력 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String str2 = sc.next();
        System.out.print("정수값 입력 : ");
        int num = sc.nextInt();

//        System.out.print((str1.substring(str1.length()- num)));
//        System.out.print(str2);

        int position = str1.length() - num;
        String sub = str1.substring(position);
        System.out.println(sub + str2);


    }
}
