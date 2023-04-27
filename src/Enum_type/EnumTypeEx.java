package Enum_type;

import java.util.Calendar;

// 열거타입(enum) : 한정된 값인 열거 상수 중에서 하나의 상수를 저장하는 타입
// 열거체를 비교 할 때 실제 값 뿐만 아니라 타입을 체크 함 .
public class EnumTypeEx {
    public static void main(String[] args) {
        Week today = null; // Week enum 타입의 참조 변수 선언
        Calendar cal = Calendar.getInstance(); // 추상 클래스이므로 객체 생성 없이 사용
        int week = cal.get(Calendar.DAY_OF_WEEK); // 해당 주의 몇 번째 요일인지 반환 (1번 일요일부터 시작)
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("오늘의 요일: " + today);
    }

}
