package goods;

public class Electronics extends Goods {
    private String mark;

    public Electronics(int price, String name, String mark) {
        super(price, name);
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}
