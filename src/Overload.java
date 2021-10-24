public class Overload {
    public static void main(String[] args) {
        OverloadDemo ov = new OverloadDemo();
        double result;

        ov.test();
        ov.test(10);
        ov.test(10, 20);
        result = ov.test(123.25);
        System.out.println("OV (123.25): " + result);
    }
}
