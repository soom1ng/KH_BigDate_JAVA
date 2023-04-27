package Generic_extand;

public class GenericPrinter<T extends Material> { // Material 로 부터 상속 받은 클래스만 타입 변수로 지정 가능하도록
    private T material;

    public void setMaterial(T Material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }

}