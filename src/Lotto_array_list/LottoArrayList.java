package Lotto_array_list;

import java.util.ArrayList;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 갯수 지정 필요 없음 .
        int  tmp; // 로또 번호를 임시로 저장하는 변수
        while(true) {
            tmp =(int)((Math.random() * 45) + 1);
            if(!list.contains(tmp)) list.add(tmp);
            if(list.size() == 6) break;
        }
        for(Integer e : list) System.out.print(e + " ");
    }
}
