package Arrays_class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


// Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있음 .
// binarySearch() : 이분 검색 알고리즘 제공
// sort() : 기본적인 오름차순과 매개변수를 이용한 내림차순, 오버라이딩을 통한 직접 구현
// toString() : 배열의 요소를 문자열로 출력 함 .
// asList() : 일반 배열을 ArrayList 로 변환
public class ArraysTestEx {
    public static void main(String[] args) {

        Integer[] arr = {5, 1, 13, 2, 37, 100, 27, 550};
//        Arrays.sort(arr); // 오름차순 정렬
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }); // 내림차순 정렬
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        Integer[]numArr = new Integer[num];
        // int[] numArr = new int [num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * num) + 1; // 배열의 개수 범위 내의 값으로 난수 발생
        }

        Arrays.sort(numArr);

        for (int e : numArr) System.out.print(e + " ");
        System.out.println("\n");
        int rst = Arrays.binarySearch(numArr, key); // 배열 이름과 찾을 값을 매개변수로 전달 함 .
        // 결과 값으로 해당 값이 있는 배열의 인덱스가 반환 됨, 찾는 값이 없으면 음수가 반환 됨 .
        if(rst >= 0) System.out.println("찾은 값의 인덱스 : " + rst);
        else System.out.println("찾는 값이 없습니다.");
    }
}
