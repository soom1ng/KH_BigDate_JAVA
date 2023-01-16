package Restricted;
// 접근제한자는 객체지향언어 4가지 중요 특성 중 하나
// 사용 목작은 내부의 필드 값을 외부에 접근하는 것을 제한하기 위함 .
public class RestricteEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs); // 동일 패키지 내에 있는 필드여서 접근제한이 걸리지 않음 .
        System.out.println(childRest.money);
    }
}
class ChildRest extends ParentRest {
    String jobs;
    public String getJobs() {
        return jobs;
    }
    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr;
    }

}