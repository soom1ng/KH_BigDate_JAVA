package Condition_practice_ex1;
import java.util.Scanner;
// 성적을 입력 받음 .
// 입력받은 값이 0 ~ 100점 사이가 아니면 "잘못 입력 되었습니다." 출력
// 90점 이상이면 A등급, 80점 이상이면 B등급, 70점 이상이면 C등급, 60점 이상이면 D등급, 이하는 F등급 입니다.

public class ScoreGrade {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 생성된 객체에서 정수값을 입력 받음
//        System.out.print("국어 성적을 입력하세요 : ");
//        int kor = sc.nextInt();
//        System.out.print("수학 성적을 입력하세요 : ");
//        int eng = sc.nextInt();
//        System.out.print("영어 성적을 입력하세요 : ");
//        int mat = sc.nextInt();
        System.out.print("성적을 입력하세요 : ");
        int score = sc.nextInt();

        // 조건문에서 값이 0과 100 사이인 경우에만 해당 학점을 출력함 .
        if(score >= 0 && score <= 100) {
            if(score >= 90) System.out.println("A등급");
            else if(score >= 80) System.out.println("B등급");
            else if(score >= 70) System.out.println("C등급");
            else if(score >= 60) System.out.println("D등급");
            else System.out.println("F등급");
        } else {
            System.out.println("잘못 입력 되었습니다.");
        }

    }
}
