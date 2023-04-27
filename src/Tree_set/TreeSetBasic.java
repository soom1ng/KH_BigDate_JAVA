package Tree_set;
// 트리셋이란 ? 검색 기능이 강화 된 컬렉션
// 객체 삽입시 자동으로 정렬이 이루어 지며 정렬은 이진 검색 트리로 구성
// 검색은 중위(Inorder) 순회 방식으로 이루어지고, 자동으로 오름차순 정렬이 됨 .
// 23, 10, 48, 15, 7, 22, 56 ==> 7 -> 10 -> 15 -> 22 -> 23 -> 48 -> 56

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasic {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);

        for(int e : ts) System.out.print((e + " -> "));
        System.out.println("\b\b\b");

        ts.remove(48); // 매개변수로 전달한 요소를 제거
        for(int e : ts) System.out.print((e + " -> "));
        System.out.println("\b\b\b");

        // iterator() 메소드를 이용한 순회 : (반복자) 향상된 for 문이 나오기 이전의 표준순회 방식
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " -> ");
        } System.out.println("\b\b\b");

        // 요소의 개수
        System.out.println("트리의 크기 : " + ts.size());
    }
}
