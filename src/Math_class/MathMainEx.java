package Math_class;

import java.util.ArrayList;
import java.util.Arrays;

// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용 함 .
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환

public class MathMainEx {
    public static void main(String[] args) {
        // 0 ~ 99 사이인 임의의 수 생성 하기
//        for (int i = 0; i < 100; i++) {
//            System.out.print((int) (Math.random() * 100));
//            System.out.print(" ");
//        }

        // 3 ~ 8 사이인 임의의 수 생성 하기
//        System.out.println((int)((Math.random() * 6) + 3));


        // 7자리의 로또 번호 생성하기
        // 7자리의 배열을 만들고 첫번째부터 여섯번째는 0 ~ 50 사이인 임의의 수 생성 후 대입
        // 마지막 7번째는 50 ~ 100 사이의 임의의 수를 만들어서 대입하고, 한번에 출력 함 .

        int []lotto = new int[7];
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int)(Math.random() * 51);
        }
        lotto[6] =  (int)(Math.random() * 51) + 50;

        System.out.println("== 로또번호 예제 ==");
        for(int e : lotto) System.out.print(e + " ");
//        System.out.println(Arrays.toString(lotto));
        System.out.println("\n");

        // abs() : 절대값 구하기, 양수면 양수로 출력하고 음수면 양수로 바꿔서 출력 함 .
        System.out.println("== 절대값 구하기 예제 ==");
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(3));
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(0));
        System.out.println("\n");

        // floor() : 소숫점 이하를 무조건 날림 .
        // ceil() : 소숫점 이하가 있으면 무조건 올림 .
        // round() : 반올림 기준에 따름 .
        System.out.println("== 소숫점 올림/내림/반올림 예제 ==");
        System.out.println(Math.floor(10.9999));
        System.out.println(Math.ceil(10.10));
        System.out.println(Math.round(10.312));
        System.out.println(Math.round(10.98));
        System.out.println("\n");

        // max() : 두 개의 숫자 중에 최댓값을 구함 .
        // min() : 두 개의 숫자 중에 최솟값을 구함 .
        System.out.println("== 최대값&최소값 예제 ==");
        System.out.println(Math.max(10, 15));
        System.out.println(Math.min(10, 15));
        System.out.println("\n");

        // pow() : 제곱 함수, 앞의 수를 뒷 수만큼 제곱해서 반환함 .
        System.out.println("== 제곱함수 예제 ==");
        System.out.println((int)Math.pow(5, 3)); // => 5 * 5 * 5

    }
}
