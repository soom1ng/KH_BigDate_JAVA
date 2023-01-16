package Inheritance_ex1;
import java.util.Scanner;

public class Person {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int sleep;

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    void setPerson() {
        System.out.println("나이 : " + age);
        System.out.println("평균 수면시간 : " + sleep + "시간");
    }
}

class Worker extends Person {
    int work;



    public int getWork() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("평균 근무 시간을 입력하세요 : ");
//        work = sc.nextInt();
        return work;
    }
    public void setWork(int work) {
        this.work = work;
    }
    void setWork() {
        System.out.println("하루 총 근무 시간은 " + work + "시간 입니다.");
    }
}

class Student extends Person {
    int study;

    public String getStudy() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("평소 공부 습관을 입력하세요. [1] 열심히 [2] 적당히 [3] 놀면서 : ");
        String[] studyStr = {"", "\"열심히", "적당히", "놀면서"};
        return studyStr[study];
    }
    void setStudy() {
        System.out.println("공부를 " + study + "하는 학생입니다.");
    }
}