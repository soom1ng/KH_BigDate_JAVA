package In_output_practice2;

public class CoffeeMenuInfo implements Comparable<In_output_practice2.CoffeeMenuInfo> {
    private String name;
    private int price;
    private String  group;
    private String desc;

    public CoffeeMenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int compareTo(CoffeeMenuInfo o) {
        return 1;
    }
}