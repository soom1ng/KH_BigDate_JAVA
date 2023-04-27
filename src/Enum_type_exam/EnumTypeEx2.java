package Enum_type_exam;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer1 = new Developer("김수민", DevType.FULLSTACK, Career.JUNIOR, Gender.FEMALE);
        developer1.devInfo();
        System.out.println("\n");
        Developer developer2 = new Developer("이민영", DevType.CAR, Career.JUNIOR, Gender.MALE);
        developer2.devInfo();

    }
}
