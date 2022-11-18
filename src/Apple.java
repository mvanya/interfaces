public class Apple<T>  {

    private T macID;
    private String product;
    private int price;

    public Apple(T macID, String product, int price) {
        this.macID = macID;
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "macID=" + macID +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
