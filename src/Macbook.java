public class Macbook<T, K> extends Apple<T> implements Icharge<K>{

    public Macbook(T macID, String product, int price) {
        super(macID, product, price);
    }

    @Override
    public void charge(K volt) {
        System.out.println("Charge has volt: " + volt);
    }
}
