package Average_university;
// 5 ==>  총 테스트 케이스
// 5 50 50 70 80 100  == >  40.000% (학생수 성적 성적 성적 성적 성적) ==> 평균이 넘는 비율을 100분율로 표기
// 7 100 95 90 80 70 60 50  ==>  57.143%
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91
import java.util.Scanner;
public class AverMain {
    public static void main(String[] args) {
        int test;
        Scanner sc = new Scanner(System.in);
        System.out.print("시험 과목 갯수 : ");
        test = sc.nextInt(); // 테스트 케이스의 갯수

        double[] rstArr = new double[test];
        for (int i = 0; i < rstArr.length; i++) {
            rstArr[i] = overRate();
        }
        for (double e : rstArr) {
            System.out.printf("%.3f%%\n", e);
        }
    }
    static double overRate() {
        // 각 테스트 케이스에 대한 결과를 구해서 실수 형태의 백분율로 반환

        // 학생수를 입력 받고 입력 받은 학생 수 만큼의 성적을 입력 받음 .
        // 평균울 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함 .
        // 구해진 평균으로 각각의 입력받은 성적을 비교해서 평균 점수가 넘는 학생의 수를 구함 .
        // 평균이 넘는 학생의 비율을 100분율로 변환해서 반환함 .

        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt(); // 학생의 수 입력
        int total = 0; // 테스트의 총 점을 구하기 위한 변수
        int overStudent = 0; // 평균을 넘눈 학생의 수를 구하는 변수
        int[] scoreArr = new int[student]; // 학생의 수만큼 성적을 입력 받기 위한 배열을 생성함 .
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = sc.nextInt(); // 학생의 수 만큼 성적을 입력 받아 배열에 대입
            total += scoreArr[i]; // 학생의 수 만큼 입력된 성적을 누적해서 총 점수를 구함 .
        }
        double aver = (double) total / student;
        for (int e : scoreArr) { // e는 배열에 포함되어 있는 각각의 학생 성적 (배열의 요소)
            if (e > aver) overStudent ++; // 평균을 넘눈 학생의 수를 구함 .
        }
        return ((double) overStudent / student) * 100; // 소수점 이하가 있는 백분율로 반환함 .
    }
}

