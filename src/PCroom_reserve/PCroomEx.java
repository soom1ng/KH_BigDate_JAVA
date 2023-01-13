package PCroom_reserve;

import java.util.Scanner;

// PC방에 컴퓨터가 100대 있음 .
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음 .
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 거절을 해야 하고, 아니면 자리 사용허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는자리 번호 : 1 3 5 => 0
// 손님의 수 입력 : 5
// 자리번호 : 1 1 3 3 5 => 2 (거절 횟수)
public class PCroomEx {
    public static void main(String[] args) {
        // PC방 좌석에 대한 100개의 배열이 필요
        // 배열의 초기값은 0이다. 즉 0일 경우 자리가 비어있다.

        Scanner sc = new Scanner(System.in);

        int[] pcRoom = new int[100];
        int rejectCnt = 0; // 거절 횟수
        int seatNum; // 손님이 원하는 좌석 번호를 입력받기 위한 변수

        System.out.print("입장한 손님의 수 : ");
        int num = sc.nextInt(); //손님의 수를 입력받음
        for (int i = 0; i < num; i++) {
            seatNum = sc.nextInt(); // 좌석번호는 1번부터 시작
            if(pcRoom[seatNum - 1] == 1) { // 해당 배열의 값이 1이라는 건 이미 샤용하고 있는 좌석이기 떄문에 거절
                rejectCnt++;
            } else {
                pcRoom[seatNum - 1] = 1; // 비어있는 좌석을 사용 함.
            }
        }
        System.out.println(rejectCnt);
    }
}
