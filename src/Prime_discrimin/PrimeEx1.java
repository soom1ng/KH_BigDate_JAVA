package Prime_discrimin;
import java.util.Scanner;

// 소수란 ? 1과 자기자신 이외에는 나누어지지 않는 수
// 소수 판별하기 : OK
// 소수의 합 구하기 : 정수 값을 입력받아, 입력받은 정수값 미만인 소수의 합을 구하는 문제
// 정수 입력 : 12
// 10 미만의 소수 : 2 + 3 + 5 + 7 + 11
// 결과 : 28
// 문제를 푸는 방법 : 메소드를 호출할 떄, 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환함 .
public class PrimeEx1 {
    public static void main(String[] args) {
//        PrimeEx1 primeEx1 = new PrimeEx1();
//        primeEx1.isPrime(100);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 입력받은 정수 미만의 소수 합을 누적함 .
        // 반복문 수행 : 입력받은 정수 미만의 값으로 메소드 호출 ( 12 => 2 ~ 11)
        for(int i =2; i < num; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);

        // while문 사용해서 수정해보기 !
//        boolean rst = isPrime(num);
//        System.out.println("소수 여부 : " + rst);
    }

    // 접근 제한자를 static으로 선언하면 객체를 생성할 수 없고, 클래스 생성 시 단 한번만 생성 가능
    // 해당 메소드 수행 후 반환 값이 true/false 임 .
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지를 판별 후 결과를 return
//    static boolean isPrime(int num) {
//        // 1과 입력받은 값을 제외, 즉 2 ~ 입력받은 값 미만
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) return false; // 전달 받은 수가 1과 자기 자신을 제외하고 나누어 지는 경우를 의미함 .
//        }
//        return true;
//    }

    static int primeSum(int n) {
        boolean isPrime = true; // 기본값을 소수로 전환
        for(int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (isPrime) return  n;
        else return  0;
    }
}


// num % num == 0 일때 소수가 아님 .
//
