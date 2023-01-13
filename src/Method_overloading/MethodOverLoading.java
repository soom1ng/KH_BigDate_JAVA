package Method_overloading;
// 메소드 오버로딩 ? 동일한 이름의 메소드를 매개변수의 타입이나 갯수, 순서에 따라 다르게 호출 하는 것
// 반환 타입은 상관하지 않음 , 단 메소드 이름은 당연히 동일해야 함 .
public class MethodOverLoading {
    public static void main(String[] args) {
//      System.out.println(sum()); // 아무값도 들어있지 않은 타입은 없기 때문에 오류
        System.out.println(sum(100, 200));
        System.out.println(sum(100, "200", 200));
        System.out.println(sum("서울\n", "부산\n", "경기도\n"));
        System.out.println(sum(100, 200, 300, 400));
    }


    static int sum (int x, int y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z ;
    }
    // 매개변수의 개수가 다르기 때문에 오버로딩 가능
    static double sum (int x, int y, int z, int aa) {
        return (double) (x + y + z);
    }

    // 매개변수의 타입이 달라서 오버로딩 가능
    static String sum(String x, String y, String z) {
        return x + y + z;
    }
    // 매개변수
    static String sum(int x, String y, int z) {
        return x + y + z;
    }
}
