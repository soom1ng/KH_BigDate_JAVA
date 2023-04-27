package Generic_extand;

public class GenericApplyEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter();
        powderPrinter.setMaterial(new Powder()); // Power 타입의 객체를 생성해서 매개변수로 전달
        powderPrinter.printing();

        GenericPrinter<Plastic> plastiGenericPrinter = new GenericPrinter<Plastic>();
        plastiGenericPrinter.setMaterial((new Plastic()));
        plastiGenericPrinter.printing();
    }
}
