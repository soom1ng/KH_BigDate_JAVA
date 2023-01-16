package Static_method;

import java.security.DomainCombiner;

public class StaticMethod {
    public static void main(String[] args) {
        Bank wooRi = new Bank ("우리", 1000);
        Bank NH = new Bank("농협", 0);

        Bank kakao = new Bank("카카오" ,1000);
        kakao.setDeposit(2000);
        kakao.setWithdraw(3000);
        kakao.setWithdraw(2000);
        kakao.viewAccount();
        // getCount() 메소드는 정적 메소드이며, 클래스 소속
        System.out.println("총 객체의 생성 갯수는 " + Bank.getCount() + "번 입니다.");
        System.out.println("\n");

        System.out.println("현재 시간을 출력합니다.");
        System.out.println(Util.getCurrentDate("yyyy년 MM월 dd일 hh:mm:ss"));
        System.out.println("\n");

        System.out.println("도메인 주소 : " + Util.DOMAIN);
    }
}
