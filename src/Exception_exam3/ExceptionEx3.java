package Exception_exam3;
// NullPointerException : 참조하고 있는 주소를 접근 했을 때 값이 없는 경우
public class ExceptionEx3 {
    public static void main(String[] args) {
        try {
            Test test = null;
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("참조하고 있는 주소에 값이 없습니다.");
        }
    }
}

class Test {
    String name = "김수민";
}
