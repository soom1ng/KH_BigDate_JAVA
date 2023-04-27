package In_output_practice2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InOutStreamTest2 {
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        menuWrite();
        selMenu();
    }
    static void menuWrite() {
        map.put("Americano", new CoffeeMenuInfo("Americano", 2500, "Coffee", "기본 커피입니다."));
        map.put("Latte", new CoffeeMenuInfo("Latte", 4000, "Coffee", "우유가 들어간 커피입니다."));
        map.put("Choco Latte", new CoffeeMenuInfo("Choco Latte", 5000, "tea", "초콜렛 음료입니다."));
    }
    static void selMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 선택 하세요");
            System.out.print("[1] 메뉴 보기, [2] 메뉴 추가, [3] 종료 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 :
                    System.out.println(" ========= 메뉴 보기 ========= ");
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getGroup());
                        System.out.println("설명 : " + map.get(e).getDesc());
                        System.out.println(" --------------------------- ");
                    }
                    break;
                case 2 :
                    System.out.print("추가 할 메뉴를 입력하세요 : ");
                    String key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String grp = sc.next();
                        System.out.print("설명 : ");
                        String desc = sc.next();
                        map.put(key, new CoffeeMenuInfo(key, price, grp, desc));
                    }
                    break;

                case 3 :
                    System.out.println("메뉴룰 종료합니다. 내용을 파일에 저장 합니다.");
                    FileOutputStream fos = new FileOutputStream(("Users/sumin/Desktop/KH_ClassRoom/CoffeeMenu.bin"));
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map); // 객체를 직렬화해서 파일에 저장
                    oos.flush();
                    oos.close();
                    return;

            }
        }
    }
}
