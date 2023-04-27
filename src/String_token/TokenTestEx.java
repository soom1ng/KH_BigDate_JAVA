package String_token;
// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우, 구분자 기준으로 문자열을 관리 할 수 있음 .
// countTokens() : 남아 있는 토큰 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부를 확인 함 . (있으면 true)
// nestToken() : 토큰을 하나씩 꺼내 옴 .

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        System.out.print("이름을 / 기준으로 입력 : ");
        String name = sc.nextLine(); // 개행 문자를 만날 때 까지 문자열을 입력 받음 .

//        // 객체 생성 시 배열과 구분자를 넣어 줌 .
//        StringTokenizer st = new StringTokenizer(name, "/");
//        String[] nameStr = new String[st.countTokens()];

//        while (st.hasMoreTokens()) { // 남아 있는 토큰이 잇는 동안 반복문 수행
//            nameStr[idx++] = st.nextToken(); // 현재 토큰을 꺼내서 배열에 담음 .
////            System.out.print(st.nextToken() + " ");
//        }
//        for (String e : nameStr) System.out.print(e + " ");

        String[] nameStr = name.split("/");
        System.out.println(Arrays.toString(nameStr));

    }
}
