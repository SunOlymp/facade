public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String one = "1010";
        String two = "1111";

        System.out.println(binOps.sum(one, two));
        System.out.println(binOps.mult(one, two));
    }
}