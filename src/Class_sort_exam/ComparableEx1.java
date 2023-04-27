package Class_sort_exam;

import Make_car.Car;

import java.util.TreeSet;

// Comparable 은 클래스 정렬을 구현할 수 있도록 해주는 인터페이스이며 TreeSet 컬렉션에서 사용해야 함 .
// compareTo() 메소드를 오버라이딩 해서 정렬 조건을 구현해야 함 .
// 정렬 조건은 자신의 객체와 매개변수로 입력 받은 객체 비교
// 정렬 조건은 양의 정수 값을 반환하면 정렬 조건이 됨 .
// 정렬 조건을 0으로 반환하면 Set 의 특성으로 인해 해당 객체가 표시되지 않음 .
public class ComparableEx1 {
    public static void main(String[] args) {
        TreeSet<CarSort> ts = new TreeSet<>();
        ts.add(new CarSort("스타리아", 2020, "Silver"));
        ts.add(new CarSort("말리부", 2023, "White"));
        ts.add(new CarSort("G80", 2023, "Black"));
        ts.add(new CarSort("렉스턴", 2017, "White"));

        for(CarSort e : ts) {
            System.out.println("차종 : " + e.modalName + " / 연식 : " + e.modelYear + " / 색상 : " + e.color);
        }
    }
}
