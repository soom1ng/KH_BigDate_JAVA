package Hash_set_basic;
// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않음 .
// 중복 여부 확인은 hashCode() 의 리턴값을 이용 함 . (경우에 따라 오버라이딩 필요)

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx1 {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "L","O"));
//        set.add("JAVA");
//        set.add("C");
//        set.add("C#");
//        set.add("Python");
//        System.out.println(set);

        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1001, "유수빈"));
        set.add(new Member(1002, "정규서"));
        Member mem3 = new Member(1003, "이민영");
        set.add(mem3);
        set.add(new Member(1004, "김수민"));
        set.add(new Member(1001, "조연준"));

        for(Member e : set) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("------------");

        }
    }
}
 class Member {
    int id;
    String name;

    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
            }
        return false;
        }

     public Member(int id, String name) {
         this.id = id;
         this.name = name;
     }
     public void showMember() {
         System.out.println("ID : " + id);
         System.out.println("이름 : " + name);
     }

 }


