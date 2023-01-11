package Member_manage;

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo(); // MemberInfo 클래스를 객체로 만듬

        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();
    }
}
