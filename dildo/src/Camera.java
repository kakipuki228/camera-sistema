public class Camera {
    private String brand;
    private int brand_price;
    private String type;
    private int accesories;

    public Camera(String brand, String type, int price, int brand_price) {
        this.brand = brand;
        this.type = type;
        this.accesories = price;
        this.brand_price=brand_price;
    }

    public String print_Info() {
        return brand + ", " + brand_price + ", " + type + ", " + accesories + ".";
    }


    public String price() {
        double i=brand_price+(accesories*50);
        return "Total price of body is "+i+" euros";

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrand_price() {
        return brand_price;
    }

    public void setBrand_price(int brand_price) {
        this.brand_price = brand_price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccesories() {
        return accesories;
    }

    public void setAccesories(int accesories) {
        this.accesories = accesories;
    }
}
