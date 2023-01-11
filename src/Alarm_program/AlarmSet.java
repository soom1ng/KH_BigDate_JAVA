package Alarm_program;
// 매일 지각하는 사람을 위해 알람을 자동으로 세팅해주는 프로그램
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간의 설정을 바꿔줌 .
// 24시간제

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        // 시간을 입력받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 생성된 객체로 시간과 분을 입력받음 (24시간제)
        System.out.println("알람은 24시간제로 설정됩니다.");

        System.out.print("알람 설정 할 시간를 숫자로 입력 하세요 : ");
        int hour = sc.nextInt();
        if(!(hour >= 0 && hour <= 24)) System.out.println("시간을 잘못 입력하셨습니다.\n");

        System.out.print("알람 설정 할 분를 숫자로 입력 하세요 : ");
        int min = sc.nextInt();
        if(!(min >= 0 && min <= 60)) System.out.println("분을 잘못 입력하셨습니다.\n");

        // 변수를 만들어서 입력받은 시간을 모두 분으로 환산
        int minTime = hour * 60 + min;

        // 고려사항 : 환산한 시간이 45분보다 적으면 별도의 게산기 필요함 .
        if(minTime <= 45)  minTime = (24 * 60) + min;

        // 알람을 설정하면 45분 빠르게 시간을 돌림 . (45를 빼줌)
        minTime -= 45;

        // 계산 결과를 시간과 분으로 출력하기 위해서 다시 변환해서 출력
        int hourSet, minSet;
        hourSet = minTime / 60; // 60으로 나눈 몫을 값으로 가짐 .
        minSet = minTime % 60; // 60으로 나누고 남는 나머지가 값이 됨 .

        System.out.println("내일 알람이 " + hourSet + "시 " + minSet + "분으로 설정되었습니다.");
    }
}
