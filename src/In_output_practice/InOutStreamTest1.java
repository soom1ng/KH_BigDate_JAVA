package In_output_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 적절한 위치에 이름과 성적 파일 생성
        // -- TreeSet<클래스> ts = new TreeSet<>();
        TreeSet<StudentInfo> ts = new TreeSet<>();
        // 2. RileInputStream 으로 생성 된 파일을 읽기 위한 스트림 생성
        FileInputStream is = new FileInputStream("src/In_output_practice2/score.txt");
        // 3. 파일을 스캐너를 읽어 들이기 위해 스캐너 생성하고 스캐너의 입력으로 스트림 연결
        Scanner sc = new Scanner(is);
        // 4. 스캐너의 hasNextLine() 메소드를 이용해 읽을 라인이 있는 동안 반복 수행
        while (sc.hasNextLine()) { // 읽어 들일 라인이 있으면 true
            // 5. 스캐너의 nextLine() 으로 라인별 문자열을 읽어 들임 (예; 김수민 98 95 90)
            String line = sc.nextLine();
            // 6. 입력 받은 문자열을 split(" ")를 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열 생성)
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
//            ts.add(new StudentInfo("김수민", 98, 85, 90));
//            ts.add(new StudentInfo("이민영", 88, 80, 70));
//            ts.add(new StudentInfo("정규서", 92, 80, 75));
//            ts.add(new StudentInfo("유수빈", 85, 70, 60));
            // 7. 첫번째 요소는 문자열 이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요

            // 8. ts.add(new 클래스(생성자));
            // 9. 향상된 for 문을 순회하면서 결과 출력
            for (StudentInfo e : ts) {
                System.out.println(e.getName() + " " + e.getTotal());
            }
            // 1. 이름과 3개의 성적을 객체 단위로 관리 하기 위해 클래스를 생성하고, 정렬을 위해 Comparable 을 상속 받거나 Comparator 를 상속 받음.
            // 2. Comparable 를 상속받아 정렬 기준에 대한 메소드를 오버라이딩 해서 정렬에 대한 조건을 구현하거나  Comparator 를 상속 받음 .
            // 3. 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 사전순 정렬) 에 대한 정렬 조건 구현하기


        }
    }
}
