package Resistance;
//  전자 제품에는 저항이 들어 간다. 처음 색 2개는 저항의 값, 마지막은 곱 해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, gray, white
// 값 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// 곱 : 1, 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 : orange red blue
// 결과 : 32,000,000
// 입력 : white white white
// 결과 : 99,000,000,000

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fstIdx = 0, secIdx = 0, trdIdx = 0;

        // 컬러 값에 대한 문자열 배열 생성
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
        long[] multi = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        System.out.print("3가지 색 입력 : ");
        String fstColor = sc.next();
        String secColor = sc.next();
        String trdColor = sc.next();
        for (int i = 0; i < color.length; i++) {
            if (fstColor.equals(color[i])) fstIdx = i; // 첫번째 입력 받은 컬러 문자열과 배열의 컬러 이름이 같으면 해당 인덱스를 대입
            if (secColor.equals(color[i])) secIdx = i;
            if (trdColor.equals(color[i])) trdIdx = i;
        }

//         Math.pow(2, 4) => 2 * 2 * 2 * 2 / 제곱 함수를 사용해서 풀기
//         정수 값 범위를 벗어 날 수 있으므로 long 으로 형변환 해줌 .
        System.out.println((long)((fstIdx * 10) + secIdx) * (long)(Math.pow(10, trdIdx)));

//        long rst = (long)((fstIdx * 10) + secIdx ) * multi[trdIdx];
//        System.out.println(rst);

    }
}
