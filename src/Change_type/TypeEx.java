package Change_type;
// 타입 변환이란 ? 하나의 타입을 다른 타입으로 변경 하는 것 .
// 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것 .
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
// Double.parseDouble() : 문자열을 실수 타입으로 변경
// 진수 표현 : 16진수, 18진수, 8진수, 2진수

public class TypeEx {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double rst1 = num1 / num2; // 변수의 타입이 알맞게 정의되지 않았기 때문에, 문제가 발생하는 코드
//        double rst2 = (double)num1 / (double)num2; // 묵시적 형변환과 명시적 형변환이 일어남 .
//        double rst3 = 100 + 100.1;
//
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);
//
//        String phoneNumber = "01092201348";
//        String name = "김수민";

        int var1 = 0b1010; // 2진수(0b) = 10
        int var2 = 0267; // 8진수(o)
        int var3 = 300; // 10진수
        int var4 = 0xabcdef; // 16진수(0x)
    }
}
