package Lotto_array_basic;
import java.util.Arrays;

public class RandomLotto {
    public static void main(String[] args) {
        // 정수형 배열 생성, 갯수는 6개 (로또 번호 저장을 위한 공간)
        int[] lotto = new int[6];

        // 반복문(6회)을 만들어 순회하면서 1 ~ 45 사이의 임이의 숫자를 배열에 대입
//        for (int i = 0; i < lotto.length; i++) {
//            lotto[i] = (int) ((Math.random() * 45) + 1);
//        }
        // 배열의 요소를 출력
//        for (int i = 0; i < lotto.length; i++) {
//            System.out.print(lotto[i] + ", ");
//        }
//        System.out.print("\b\b");

        // 중복을 지우고 랜덤숫자를 로또 번호에 대입
        int tmp; // 생성된 로또 번호를 배열에 넣기 전에 임시로 저장함 .
        boolean isExist = false; // 번호의 중복 여부 확인
        int index = 0;

        while(true) {
            tmp = (int) ((Math.random() * 45) + 1);
            // 중복 확인 구간
            for(int i = 0; i < lotto.length; i++) {
                if(lotto[i] == tmp) isExist = true; // 배열에 생성된 로또 번호가 있으면 true
            }

            // 생성된 번호가 배열 내에 없으면 저장하는데, 인덱스를 계산 해줘야 함 .
            if(isExist == false) lotto[index++] = tmp;
            // 로또 번호가 5개 만들어졌으면 반복문 탈출
            if(index == lotto.length) break;
            // 존재 여부를 확인하는 변수를 초기화 시킴 .
            isExist= false;
        }
        System.out.println(Arrays.toString(lotto));
    }
}