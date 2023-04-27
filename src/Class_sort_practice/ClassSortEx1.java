package Class_sort_practice;
// 학생의 수를 입력 받기
// 학생 수 만큼의 객체를 생성하여 정보를 입력 (이름 성적 학번)
// 학생의 성적이 높은 순으로 결과를 표시하고 성적이 같으면 학번 순으로 정렬
// 그리고 출력시 등수가 표기 되도록 할 것
// [입력 예시]
// 학생 수 입력 : 3
// 정규서 90 221201
// 이민영 85 221202
// 김수민 95 221203

// [출력 예시]
// ===== 학생 성적 출력 =====
// ----------------------
//  석차  성적   이름    학번
//    1  95  김수민 221203
//    2  90  정규서 221202
//    3  85  이민영 221202

import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx1 {
    public static void main(String[] args) {
        TreeSet<Score> ts = new TreeSet<>(new ScoreSort());

//        ts.add(new Score("정규서", 90, "221201"));
//        ts.add(new Score("이민영", 85, "221202"));
//        ts.add(new Score("김수민", 95, "221203"));

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        int cnt = 0;
        int rank = 0;
        for(int i = 0; i < n; i++) {
            ts.add(new Score(sc.next(), sc.nextInt(), sc.nextLine()));
        }

        System.out.println("===== 학생 성적 출력 =====");
        System.out.println("-----------------------");
        System.out.println(" 석차  성적   학번    이름");

        for(Score s : ts) {
            if(rank != s.score) cnt++;
            System.out.printf("%3d%5d%8s%4s\n", cnt, s.score, s.stdID, s.name);
            rank = s.score; // 현재 점수를 변수에 저장
        }
        System.out.println("----------------------");
    }
}
