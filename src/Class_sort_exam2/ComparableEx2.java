package Class_sort_exam2;

import java.util.TreeSet;

// Comparator : 역기 정렬을 구현하는데 사용하는 인터페이스
public class ComparableEx2 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new DescendComp());

        ts.add(new Fruit("Grape", 3000));
        ts.add(new Fruit("Apple", 1500));
        ts.add(new Fruit("Strawberry", 15000));
        ts.add(new Fruit("Banana", 3000));

        for(Fruit f : ts) {
            System.out.println("이름 : " + f.name + " / 가격 : " + f.price);
        }

    }
}
