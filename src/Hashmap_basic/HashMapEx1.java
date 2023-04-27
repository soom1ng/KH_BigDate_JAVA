package Hashmap_basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// hash Map : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 hashCode() 를 통해서 수행 함 .
// 키의 중복은 허용하지 않음 , 값은 중복 가능, 순서를 유지하지 않음 .
// 경우에 따라서 hashCode() 와 equals() 메소드를 오버라이드 해서 사용해야 함 .
// Hash Map 은 성능이 우수하고 멀티 스레드 환경을 지원하지 않음 . (즉 동기화 기능 없음)
// Hash Table 은 Hash Map 과 내부 구조가 동이랗며, 멀티 스레드 지원
// Properties 는 Hash Table 을 상속 받아서 기능을 제약하며 사용 (키와 값이 모두 문자열로만 구성)
// 정보를 파일에 저장하고 읽기 위한 용도 임 .
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        // 객체 추가 : put(키, 값)
//        map.put("Americano", 2500);
//        map.put("Latte", 4000);
//        // 객체 찾기 : get(키) => 반환값으로 값이 넘어옴 .
//        System.out.println("객체 찾기 : " + map.get("Latte"));
//        System.out.println("객체 찾기 : " + map.get("Latte2"));
//        // 객체 삭제 : remove(키) => 정삭적으로 삭제되면 값이 반환값으로 넘어옴 .
//        System.out.println("객체 삭제 : " + map.remove("Americano"));
//        System.out.println("객체 삭제 : " + map.remove("Americano22"));

        map.put("김수민", 90);
        map.put("이민영", 80);
        map.put("정규서", 60);
        map.put("김수민", 100);// 키 값이 같기 때문에 나중에 저장된 값으로 대체 됨 .
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기
        System.out.println(map.get("김수민"));

        // map 을 순회하는 방법 : 향상된 for 문 사용
        for (String key : map.keySet()) { // 모든 키를 Set 객체에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }

        // 반복자로 순회하는 방법 (iterator)
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) { // 키가 존재하는지 확인
            String key = iterator.next(); // 키를 가져 옴 .
            System.out.println(key + " : " + map.get(key));
        }

        // 객체 삭제
        map.remove("정규서"); // 키로 Map.Entry 를 제거
        System.out.println("총 Entry 수 : " + map.size());

        // 값을 수정하는 메소드
        map.replace("이민영", 90);

        // Map.Entry 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());

    }
}
