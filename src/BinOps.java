public class BinOps {
    public String sum(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int result = first + second;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int result = first * second;
        return Integer.toBinaryString(result);
    }
}
