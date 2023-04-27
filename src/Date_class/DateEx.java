package Date_class;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date() : 1970년 1월 1일 0시 0분 0초에서 현재까지의 경과 시간으로 시간을 계산 (msec 단위)
// 객체를 생성해서 사용 함 .
// SimpleDateFormat : 운영체제로 부터 얻어진 시간 정보를 원하는 포맷으로 변경해서 출력함 (pattern 매칭 사용)

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//        String dateStr = sdf.format(now);
//        System.out.println(dateStr);

        // yyyy : 연도를 4자리로 표현 (2023)
        // yy : 연도를 2자리로 표현 (23)
        // MM : 월을 2자리로 표현 (분과 헷갈리기 때문에 반드시 대문자 사용)
        // hh : 12시간제를 의미
        // HH : 24시간제를 의미
        // mm : 분을 2자리로 표시
        // W : 월에서 몇 주차 인지?
        // w : 년에서 몇 주차 인지?

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 M월 d일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd h:m:s");
        f6 = new SimpleDateFormat("오늘은 M월의 W주차, d번째 날 입니다.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차입니다.");

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));


    }
}
