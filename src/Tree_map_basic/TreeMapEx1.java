package Tree_map_basic;
// TreeMap 도 TreeSet 과 마찬가지로 이진 검색 트리(값이 추가 될 때 정렬이 됨)로 구현 되어있음 .
// key 를 값으로 정렬하므로 key 깞에 해당하는 Comparable 과 Comparator 를 구현 해야함 .

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(95, "김수민");
        score.put(80, "이민영");
        score.put(70, "정규서");
        score.put(60, "유수빈");

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(90);
        System.out.println("95점 바로 아래 점수 : " + entry.getKey() +  " : " + entry.getValue());
        entry = score.higherEntry(90);
        System.out.println("95점 바로 위의 점수 : " + entry.getKey() +  " : " + entry.getValue());

    }
}
