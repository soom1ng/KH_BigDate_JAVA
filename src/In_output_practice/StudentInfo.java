package In_output_practice;

public class StudentInfo implements Comparable<StudentInfo> {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    int getTotal() {
        return kor + eng + mat;
    }
    String getName() {
        return name;
    }
    @Override
    // 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 사전순 정렬) 에 대한 정렬 조건 구현하기
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal(); // 내림차순 정렬
    }
}
