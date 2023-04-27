package Tree_set_exam;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Integer[] score = {78, 45, 60, 54, 92};
        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(score));

        System.out.println("60점 미만 : " + ts.headSet(60));
        System.out.println("60점 이상 : " + ts.tailSet(60));

        // 주어진 정수 바로 아래의 점수 출력
        System.out.println("60점 바로 아래 점수 : " + ts.lower(60));
        // 주어진 정수 바로 위의 점수 출력
        System.out.println("60점 바로 위의 점수 : " + ts.higher(60));
    }
}
