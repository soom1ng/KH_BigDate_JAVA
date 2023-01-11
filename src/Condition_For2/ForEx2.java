package Condition_For2;
import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int sum = 0;

        int result = recursiveFunc(number);
        System.out.println(result);
    }
    public static int recursiveFunc(int n) {
        if(n == 1) return 1;
        return n + recursiveFunc(n - 1);

//        for(int i = 1; i <= number; i++) {
//            sum += i;
//        }

//        for(int i = 1; i<= number; i++){
//            sum += i;
//        }

//        while(number > 0) {
//            sum += number;
//            number--;
//        }
//        System.out.println("정수의 합은 : " + sum);


    }
}
