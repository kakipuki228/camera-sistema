public class Pro extends Camera {

    public int getMax_resolution() {
        return max_resolution;
    }

    public void setMax_resolution(int max_resolution) {
        this.max_resolution = max_resolution;
    }

    private int max_resolution;

    public Pro(String brand, String type, int price, int brand_price, int max_resolution) {
        super(brand, type, price, brand_price);
        this.max_resolution = max_resolution;

    }

    public String print_Info() {
        return getBrand() + ", " + getBrand_price() + "euro, " + getType() + ", " + getAccesories() + "pcs, " + max_resolution + " k.";
    }
}