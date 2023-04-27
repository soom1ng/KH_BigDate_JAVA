package HashSet_exam;

import java.util.Arrays;
import java.util.HashSet;

// 합집합 : 두 개의 요소에서 어느 한쪽에만이라도 존재하면 결과에 반영 ( 단 동일한 값이 양쪽에 존재하는 경우 중복은 제거 됨 .)
// 교집합 : 두 군데 모두 존재하는 값만 결과에 반영
// 차집합 : 앞의 요소에 뒤의 요소를 제거한 나머지를 결과에 반영
public class UnionEx1 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        s1.retainAll(s2); // 교집합을 수행하는 메소드
        System.out.println(s1); // [4, 5, 6] 출력

        s1.addAll(s2); // 합집합을 수행하는 메소드
        System.out.println(s1); // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract); // [1, 2, 3] 출력
    }
}
