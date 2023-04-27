package Arraylist_object;

import java.util.ArrayList;
import java.util.List;

public class ArraylistObjectEx {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2500, "Coffee", "기본 커피 입니다."));
        menuList.add(new MenuInfo("Latte", 4500, "Coffee", "우유가 포함 된 커피 입니다."));
        MenuInfo menuTest = new MenuInfo("Espresso", 2500, "Coffe", "진한 커피입니다.");
        menuList.add(menuTest);

        for(MenuInfo e : menuList) {
            e.getMenuInfo();
        }
    }
}
