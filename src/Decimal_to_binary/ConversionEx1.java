package Decimal_to_binary;

import java.util.Scanner;

public class ConversionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변환 할 정수 입력 (10진수) : ");
        int dec = sc.nextInt();
        String bin = "";


        while (true) {
            for (int i = 0; dec <= Math.pow(2, i); i++) {
                if (dec % 2 == 0) {
                    bin += "0";
                    dec = dec / 2;
                } else if (dec == 0) {
                    String reverse = "";
                    for (int j = bin.length() - 1; j >= 0; j--) {
                        reverse = reverse + bin.charAt(i);
                        System.out.println("2진수 : " + reverse);
                    }
                    System.out.println();
                } else {
                    bin += "1";
                    dec = dec / 2 - 1;
                }
            }

        }
    }
}
