package overloading.step4;

public class Product {
    private String model;
    private String maker;
    private int price;

    public Product(String model, String maker, int price) {
        this.model = model;
        this.maker = maker;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                '}';
    }
}
