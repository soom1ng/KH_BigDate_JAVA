package Clone_method;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("so_om97", "김수민", "ㅁㅁ12345678", 25, true);
        Member mem2 = mem1.getMember();

        mem2.age = 27;
        mem2.name = "이민영";

        System.out.println("name : " + mem1.name);
        System.out.println("age : " + mem1.age);

        System.out.println("name : " + mem2.name);
        System.out.println("age : " + mem2.age);

    }
}
