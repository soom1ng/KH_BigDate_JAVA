package Enhanced_array;
// 향상된 for 문은 배열의 요소를 처음부터 끝까지 자동 순회
// 배열 내부의 값을 변경 할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 60, 70};
        int sum = 0;

        for(int i :score) sum+= i;

        System.out.println("총점 : " + sum);
//        System.out.printf("평균 :  %2.f\n",((double)sum / score.length));
    }
}
