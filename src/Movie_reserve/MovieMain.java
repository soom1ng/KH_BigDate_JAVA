package Movie_reserve;
// 영화표 예매하기 클래스를 만들고 객체 생성
// 극장의 좌석은 10개 (10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현재 좌석의 예약 상태를 보여주고, 예약을 받음 .
// 종료시에는 판매된 좌석의 갯수를 확인해서 판매 금액을 구함 ( 3좌석 구매시 : 3 * 12000 = 36000 )

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;

        MovieTicket movieTicket = new MovieTicket();
        while (true) { // 예약은 종료하기를 누르기 전까지는 계속 진행해야 함 .

            System.out.println("[1] 예매하기 [2] 종료하기");
            select = sc.nextInt(); // 메뉴 선택에 대한 값을 입력받음
            if (select == 1) movieTicket.selectSeat(); // 좌석 예약에 대한 메소드 호출
                // 예약창 띄우기
            else if (select == 2) {
                // 판매금액 출력
                System.out.println("총 금액은 "+ movieTicket.totalAmount() + "원 입니다."); // 종료하기 선택 시 판매 금액 계산
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
        }
    }
}

