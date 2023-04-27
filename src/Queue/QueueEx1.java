package Queue;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO(First in First Out) 구조
// LinkedList 구조를 사용하고 있으며 LinkedList 기능 중에 큐 관련 기능으로 제한
// add(e) : 맨 뒤에 요소를 삽입 (중간 삽입 안됨.) - 예외 발생
// offer(e) : 맨 뒤에 요소를 삽입 - true/false 반환
// remove() : 맨 앞의 요소 제거 - 예외 발생
// poll() : 맨 앞의 요소 제거 - 비어있으면 null
// element() : 맨 앞의 요소를 읽어 옴 - 예외 발생
// peek() : 맨 앞의 요소를 읽어 옴  - 비어있으면 null

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();

        msgQ.offer(new Message("Mail", "정규서"));
        msgQ.offer(new Message("SMS", "유수빈"));
        msgQ.offer(new Message("KakaoTalk", "이민영"));

        while (!msgQ.isEmpty()) {
            Message msg = msgQ.poll(); // 큐에서 한개의 메세지를 꺼냄 . (맨 앞으로 꺼냄)
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "KakaoTalk" :
                    System.out.println(msg.to + "에게 카톡 메세지를 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
