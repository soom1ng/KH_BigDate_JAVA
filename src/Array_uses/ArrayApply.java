package Array_uses;
import java.util.Arrays;
// arraycopy() : 배열 값을 복사할 때 사용
// copyOf() : 배열을 원하는 길이 만큼 새로운 배열로 복사
public class ArrayApply {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5,6};
//        int len = 10;
//        int[] arr2 = new int[len];
//        // System.arraycopy(arr1, 0, arr2, 4, arr1.length);
//        for(int i = 0; i < arr1.length; i++) {
//            arr2[i+4] = arr1[i];
//        }

        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr3));
    }
}