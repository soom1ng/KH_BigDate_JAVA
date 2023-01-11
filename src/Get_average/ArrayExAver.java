package Get_average;
// 상현이가 가르치는 학생은 총 5명 (장원영, 안유진, 채원, 예나, 유리)
// 기말고사 성적이 40점 미만인 경우에는 보충학습을 듣는 조건으로 성적을 40점으로 조정 해줌 .
// 모든 학생이 보충 학습을 들음 .
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상이고, 100점 이하인 5의 배수이다.

import java.util.Scanner;

public class ArrayExAver {
    public static void main(String[] args) {
        // 스캐너 객체를 생성
        Scanner sc = new Scanner(System.in);

        // 5명의 성적을 저장하기 위한 배열 생성
        int[] score = new int[5];
        int total = 0;

        // 배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만이면, 40점으로 올려줌 .
        System.out.print("성적을 입력하세요 : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40;

            // 평균을 구하기 위해서 성적을 모두 합산함 .
            total += score[i];
        }
//            if(score < 0 && score % 5 = 0) {
//                System.out.println("점수를 잘 못 입력하셨습니다.");
//                continue;

            // 합산된 성적을 인원수로 나누어 평균을 구함 .
            System.out.println(total / 5);
        }
    }



