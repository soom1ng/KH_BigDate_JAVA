package Generic_extand;

public class Powder extends Material {

    @Override
    public void doPrinting() {
        System.out.println("Powder 재료룰 출력합니다.");
    }
    public String toString() {
        return "재료는 Powder 입니다.";
    }
}

