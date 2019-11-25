package goods;

class Goods {

    private int price;
    private String name;

    Goods(int price, String name) {
        this.price = price;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
