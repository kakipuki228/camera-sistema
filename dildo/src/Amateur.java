public class Amateur extends Camera {

    private String Lens;

    public String getLens() {
        return Lens;
    }

    public void setLens(String lens) {
        Lens = lens;
    }

    public int getLens_price() {
        return lens_price;
    }

    public void setLens_price(int lens_price) {
        this.lens_price = lens_price;
    }

    private int lens_price;

    public Amateur(String brand, String type, int price, int brand_price, String Lens, int lens_price) {
        super(brand, type, price, brand_price);
        this.Lens = Lens;
        this.lens_price = lens_price;
    }

    public String print_Info() {
        return getBrand() + ", " + getBrand_price() + "euro, " + getType() + ", " + getAccesories() + "pcs, " + lens_price + ", " + Lens + ".";
    }
    public String price() {
        double i=getBrand_price()+(getAccesories()*50)+lens_price;
 return "Total price is "+i+" euros";
    }
}