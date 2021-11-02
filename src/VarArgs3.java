public class VarArgs3 {
    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String, int ...) : " + msg + v.length + " Content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void vaTest(int... v) {
        System.out.print("vaTest (int ...) : Number of arguments: " + v.length + " Content: ");
        for (int i : v) {
            System.out.print(i + " ");

        }
        System.out.println();

    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean ...) : Number of arguments: " + v.length + " Content: ");
        for (boolean i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Test: ", 10, 20);
        vaTest(true, false, false);
    }
}
