package Input_time;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 클론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시간을 입력하세요 : ");
        String time = sc.next();
        String[] splitTime = time.split(":");

        int hour = Integer.parseInt(splitTime[0]); // 문자열을 숫자로 변환시키는 static 함수
        int min = Integer.parseInt(splitTime[1]);
        int sec = Integer.parseInt(splitTime[2]);

        if (hour > 13) {
            System.out.printf("오전 %d시 %02d분 %02d초", hour, min, sec);
        }
        else {
            hour -= 12;
            System.out.printf("오후 %d시 %02d분 %02d초", hour, min, sec);
        }
    }
}
