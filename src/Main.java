public class Main {
    public static void main(String[] args) {

     Apple<Integer> ip1 = new Apple<>(123123,"iphone",1000);
     Apple<String> ip2 = new Apple<>("mac123123", "iphone", 1000);

     Apple<Integer> mac1 = new Macbook<>(123123,"Macbook",2500);
     Apple<String> mac2 = new Macbook<>("mac123123","Macbook",2500);

        System.out.println(ip1);
        System.out.println(ip2);

        System.out.println(mac1);
        System.out.println(mac2);

        Macbook<Integer, Integer> mac3 = new Macbook<>(2201231,"macbook", 2500);
        mac3.charge(220);
    }
}