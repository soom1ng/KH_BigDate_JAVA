package Make_coffee_menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// [1] 메뉴 보기, [2] 메뉴 조회, [3] 메뉴 추가, [4] 메뉴 삭제, [5] 메뉴 수정, [6] 종료
public class CoffeeMenuEx1 {
    Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        CoffeeMenuEx1 coffee = new CoffeeMenuEx1();
        coffee.makeMenu();
        coffee.selectMenu();
    }
    void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 들어간 커피 입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2000, "Coffee", "진한 커피 입니다."));
    }
    void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;

        while(true) {
            System.out.println("보기를 선택하세요 .");
            System.out.print("[1] 메뉴 보기 [2] 메뉴 조회 [3] 메뉴 추가 [4] 메뉴 삭제 [5] 메뉴 수정 [6] 종료 : ");

            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println(" ======== 메뉴보기 ======== ");
                    for(String e : map.keySet()) {
                        System.out.println(" " + map.get(e).name);
//                        System.out.println("가격 : " + map.get(e).price);
//                        System.out.println("분류 : " + map.get(e).group);
//                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("-------------------------");
                    }
                    break;

                case 2 :
                    System.out.print("조회 할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) { // map 에 키가 존재하는지 확인 (있으면 true)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("-------------------------");
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;

                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 설정 : ");
                        String group = sc.next();
                        sc.nextLine(); // 오류를 피하기 위해 버퍼 비우
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key, price, group, desc));
                    }
                    break;

                case 4 :
                    System.out.print("삭제 할 메뉴를 입력하세요. : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 했습니다.");
                    } else System.out.println("삭제 할 메뉴가 없습니다.");
                    break;

                case 5 :
                    System.out.print("수정 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 설정 : ");
                        String group = sc.next();
                        sc.nextLine(); // 오류를 피하기 위해 버퍼 비우
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, group, desc));
                    } else System.out.print("수정 할 메뉴가 없습니다.");
                    break;

                case 6 : System.out.println("메뉴를 종료합니다.");
                return; // break 문을 사용하면 반복문을 벗어날 수 없음 .
            }
        }
    }
}
