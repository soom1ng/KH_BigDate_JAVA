package Arrays_etc;

import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {

//        int[] score = new int[5]; // 국어, 영어, 수학, 과학, 한국사
//        for(int i = 0; i < score.length; i++) {
//            score[i] = 100;
//        }
//        System.out.println(Arrays.toString(score));

//        String[] cites = {"서울", "부산", "대구", "인천", "수원"};
//        for(String e : cites) System.out.println(e + " ");
//        System.out.println("\n" + cites[3]);

        if(args.length != 2) {
            System.out.println("외부에서 전달한 값이 없어 강제 종료 함 .");
            System.exit(0); // 프로그램을 강제 종료시키는 명령어
        }
        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1); // 입력받은 문자열을 정수로 변환
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));
    }
}
