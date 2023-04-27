package Array_fruit_ex;
import java.util.Arrays;
import java.util.Comparator;

// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전(알파벳 순서)순서로 정렬하기
// String length()
// String compareTo() 사용해서 해결 가능
// Arrays.sort(배열 이름, new Comparator<String>(){ compare()메소드 구현 }

public class FruitTest {
    public static void main(String[] args) {
        String fruit[] = {"Cherry", "Banana", "Peach", "Grape", "Plum", "Mango", "Strawberry", "Apple", "Orange", "Kiwi"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; // 첫번째가 두번째보다 길이가 길면 정렬 조건
                else {
                    if(o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                }
                return -1; // 현재 상태 유지
            }
        });

        System.out.println(Arrays.toString(fruit));
        String test = "abcd";
        System.out.println(test.compareTo("ab"));
        System.out.println(test.compareTo("abcd"));
        System.out.println(test.compareTo("abcde"));
    }
}


