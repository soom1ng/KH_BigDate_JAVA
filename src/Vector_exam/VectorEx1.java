package Vector_exam;

import java.util.List;
import java.util.Vector;

// Vector 는 ArrayList 와 내부적으로 동일한 구조 입니다. 메소드의 사용 방법도 완전히 동일 합니다.
// 멀티 스레드에서 안전하게 사용 가능합니다.
public class VectorEx1 {
    public static void main(String[] args) {
        Vector<NameCard> list = new Vector<>();
        list.add(new NameCard("김수민" , "010-9220-1348", "o_v_zzza@naver.com","학생","서울시 동대문구"));
        list.add(new NameCard("이민영", "010-2644-2116", "fptm8312@naver.com", "자동차 정비사","서울시 도봉구"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("e-mail : " + e.mail);
            System.out.println("직업 : " + e.position);
            System.out.println("주소 : " + e.address);
        }
    }
}

class NameCard {
    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}
