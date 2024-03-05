public class Newbie extends Camera {

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    private String auto;

    public Newbie(String brand, String type, int price, int brand_price, String auto) {
        super(brand, type, price, brand_price);
        this.auto = auto;

    }

    public String print_Info() {
        return getBrand() + ", " + getBrand_price() + " euro, " + getType() + ", " + getAccesories() + "pcs, " + auto + ".";
    }
}
