package Prime_word;
// a는 1로, b는 2로, ..., z는 26으로, A는 27로, ..., Z는 52로 하여 그 합을 구함 .

import java.util.Scanner;

public class PrimeExFinal {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 합계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본값으로 설정

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i - 'a' + 1);
            else sum += word.charAt(i - 'A' + 27);
        }
        System.out.println("합 : " + sum);

        // 소수인지 아닌지 판별하기, 1은 소수로 정했기 때문에 조건에서 제외
        for (int i = 0; i <sum; i++) {
            if(sum % i == 0) isPrime = false; // 나누어지면 소수가 아님 .
        }
        if (isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is NOT a prime word.");
    }
}
