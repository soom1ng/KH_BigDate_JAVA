package Restricted;

import Polymor_apply.Product;

public class ParentRest {
    public String name; // 누구나 접근 가능
    protected String money; // 동일 패키지와 다른 패키지의 상속 관계가 있으면 접근 가능
    String addr; // default 접근 제한자는 동일 패키지 내에서 접근 가능
    public ParentRest() {
        name = "김수민";
        money = "100억";
        addr = "서울 동대문구";
    }
}
