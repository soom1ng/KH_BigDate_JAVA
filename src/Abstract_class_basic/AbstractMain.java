package Abstract_class_basic;

import java.util.Scanner;

// 추상 클래스란 ? 실체가 없는 부모가 상속을 주는 것
// 추상 클래스에는 반드시 추상 메소드가 포함 되어야 하고,
// 해당 메소드는 상속받은 자식 클래스에서 구현해줘야 합니다.(오버라이딩)
// 추상 클래스느의 키워드는 abstract
// 추상 클래스는 일반 메소드, 추상 메소드, 일반 필드 등을 모두 포함 할 수 있음 .
public class AbstractMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        System.out.print("동물을 선택하세요 [1] 고양이 [2] 강아지 [3] 오리 : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : animal = new Cat(); break;
            case 2 : animal = new Dog(); break;
            case 3 : animal = new Duck(); break;
            default:
        }
        animal.cry();
    }
}
abstract class Animal {
     abstract void cry(); // 추상 메소드는 abstract 키워드를 사용하고 반드시 (;)으로 끝나야 함 .
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("Meow~ meow~");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("Bowwow!");
    }
}
class Duck extends Animal {
    @Override
    void cry() {
        System.out.println("Quack!! quack!!");
    }
}
