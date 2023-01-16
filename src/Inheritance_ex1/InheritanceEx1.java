package Inheritance_ex1;

// 인간(Person) 이라는 클래스 생성
// - age : 나이 특성을 가짐 (정수 값 사용, 게터/세터) - 몇 살인지 ?
// - sleep : 잠자는 특성 (정수 값 사용, 게터/세터) - 하루에 잠을 몇 시간 자는지 ?
// 인간으로 부터 직장인을 생성
// - work : 하루에 몇 시간 일하는지 ?
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성 ( 입력 [1] 열심히 [2] 적당히 [3] 놀면서
public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(27);
        worker.setSleep(7);
        worker.setWork();
        System.out.println("직장인이 " + worker.getWork() + "시간 동안 일을 합니다.");
        System.out.println("직장인의 나이는 " + worker.getAge() + "입니다.");
        System.out.println("직장인은 " + worker.sleep + "시간 동안 잠을 잡니다." );

        Student student = new Student();
//        student.setStudy(1); // 1, 2, 3
        student.setAge(18);
        student.setSleep(6);
        System.out.println("학생이 " + student.getStudy() + "공부를 합니다.");
        System.out.println("학생의 나이는 " + student.getAge() + "입니다.");
        System.out.println("학생은 " + student.sleep + "시간 동안 잠을 잡니다." );
    }
}