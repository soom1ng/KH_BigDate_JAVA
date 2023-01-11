package Make_signboard;
import java.util.Scanner;
// 각 숫자마다 차지하는 공간이 다름 .
// 0은 4칸, 1은 2칸, 나머지 수는 3칸
// 간판의 각 숫자 사이는 1칸의 여백이 필요함 .
// 입력한 총 숫자를 표기하기 위해 몇 캰의 공간이 필요한지 계산하는 문제
// 입력은 0이 들어올 때 까지 계속 반복 입력이 가능하게 해야 함 . (종료조건)
// 5611을 넣을때 , 첫 공백:1칸 + 5:3칸 + 공백:1칸 + 6:3칸 + 공백:1칸 + 1:2칸 + 공백:1칸 + 1:2칸 + 마지막 공백:1칸
// 출력값 : 15

public class SignBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        String num;
        int sum = 0; // 총 몇자리의 공간을 차지하는지 누적하는 변수

        while(true) {
            System.out.print("숫자를 입력하세요 : ");
            num = sc.next();
            if(num.equals("0")) break;
            for(int i = 0; i < num.length(); i++) {
                // 숫자 뒤의 공간을 위해 1을 더해 줌 .
                sum += numSize[num.charAt(i) - '0'] + 1;
            }
            // 전체 공간에서 맨 앞 여백 공간을 위해 1을 더해 줌 .
            System.out.println(sum + 1);
            sum = 0;
        }


        // 세번째 방법 : 0번째 문자 출력, 그리고 '-'다음의 문자 출력
//        for (int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }

        // 네번째 방법 : 문자 배열로 변경 후, 대문자 골라내기
//        char[] chName = name.toCharArray();
//        for(char e : chName) {
//            if(e >= 'A' && e <= 'Z') System.out.print(e);
//        }


    }
}
