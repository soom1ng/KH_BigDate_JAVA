package Multi_type;

import com.sun.security.jgss.GSSUtil;

// 타입 변수란 ? 참조형 타입을 의미하고 어떤 문자로 이름을 지정해도 상관 없지만 일반적으로 'T'
// 타입 변수는 클래스 뿐만 아니라 매소드의 매개변수나 반환 타입으로 사용 가능
public class MultiTypeEx {
    public static void main(String[] args) {
        Product<String, Integer> Product1 = new Product<>("TV", 1234);
        Product<Integer, String> Product2 = new Product<>(1234, "1234");
        System.out.println(Product1.getYear());
        System.out.println(Product1.getName());
        System.out.println(Product2.getName());
    }
}

class Product<T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }

    public Product(T name, M year) {
        this.name = name;
        this.year = year;
    }
}