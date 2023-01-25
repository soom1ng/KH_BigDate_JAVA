package Password_check_2;

import java.util.Scanner;

public class PwdCheck2 {


        public String pwd;

        boolean getPwd() {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("패스워드 입력 : ");
                pwd = sc.next();
                if (pwdLength() && numAvail() && upperAlphaAvail() && lowAlphaAvail() && specialAvail()) {
                    System.out.println("Good password !");
                } else if (pwd.equalsIgnoreCase("exit") || pwd.equals("종료")) {
                    System.out.println("프로그램을 종료합니다.");
                    return true;
                } else System.out.println("Bad password !");
            }
        }

        boolean pwdLength() { // 길이체크
            if (pwd.length() >= 10 && pwd.length() <= 30) return true;
            else return false;
        }

        boolean numAvail() { // 숫자체크
            for (int i = 0; i < pwd.length(); i++) {
                if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
            }
            return false;
        }

        boolean upperAlphaAvail() { // 대문자 체크
            for (int i = 0; i < pwd.length(); i++) {
                if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
            }
            return false;
        }

        boolean lowAlphaAvail() { // 소문자 체
            for (int i = 0; i < pwd.length(); i++) {
                if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
            }
            return false;
        }

        boolean specialAvail() {
            String specialLetter = "!%_&#+_*/";
            for (int i = 0; i < specialLetter.length(); i++) {
                for (int j = 0; j < pwd.length(); j++) {
                    if (specialLetter.charAt(i) == pwd.charAt(j)) return true;
                }
            }
            return false;
        }
}
