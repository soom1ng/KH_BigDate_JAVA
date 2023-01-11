package Lotto_array_produce;

import java.util.HashSet;

public class LottoSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int tmp = (int)((Math.random() * 45) + 1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);
    }
}
