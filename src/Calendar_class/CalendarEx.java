package Calendar_class;

import java.util.Calendar;

// Calendar 클래스의 표기법은 날짜, 시간과 달리 각 나라마다 상이하기 때문에 추상 클래스이고 객체 생성없이 사용
// 정적 메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져 오고, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance(); // Date now = new Date();

        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_WEEK));
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.AM_PM)); // AM : 0이고 PM : 1
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));

        // 캘린더 클래스를 이용해서 [ yyyy년 MM월 dd일 HH시 mm분 ss초 ] 출력

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        int hour = now.get(Calendar.HOUR);
        int isPm = now.get(Calendar.AM_PM);
        if (isPm == 1) hour += 12;

        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.printf("[%d년 %02d월 %02d일 %02d시 %02d분 %02d초]", year, month, day, hour, minute, second);
    }
}
