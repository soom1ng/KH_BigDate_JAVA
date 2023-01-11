package InOutPut_ex1;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "김수민";
        String addr = "경기도 의정부시"; // string은 "큰따옴표"로 문자열을 받아옴 .
        char gender = '여'; // char은 '작은따옴표'로 문자를 받아옴 .
        int age = 25;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double sum = (kor + eng + mat);
        double aver = (sum / 3);


// 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("===== Java Style Output =====");
        System.out.print("Name : " + name + "\n");
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2d", aver);

// c언어 스타일 (서식지정자를 사용)
// 서식지정자 : %d, %ld, %u, %f, %.2f, %s, %c, %%, %b
// 이스케이프시퀀스 : \n(줄바꿈), \r(CR), \t(탭),\b(백스페이스), \\(기호로 \를 사용할 때)
        System.out.println("===== Java Style Output =====");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %f\n", sum);
        System.out.printf("평균 : %f\n", aver);

        System.out.print("Apple\r Banana\t kiwi\n");

        System.out.println("\"Enter\" 키를 입력하시면 종료 됩니다.");
        System.out.println("Hello \\ Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i =1; i<= n *n; i++); {
            System.out.println();
        }


    }
}
