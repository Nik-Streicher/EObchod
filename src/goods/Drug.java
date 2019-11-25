package goods;

public class Drug extends Goods {
    private String manufacturer;

    public Drug(int price, String name, String manufacturer) {
        super(price, name);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
