package Class_sort_exam;
// 자동차 연식으로 정렬하기
public class CarSort implements Comparable<CarSort>{
    String modalName;
    int modelYear;
    String color;

    public CarSort(String modalName, int modelYear, String color) {
        this.modalName = modalName;
        this.modelYear = modelYear;
        this.color = color;
    }



    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modalName.compareTo(o.modalName);
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름 차순 정렬)
    }
}
