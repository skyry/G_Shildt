public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Number of arguments vararg: ",10);
        vaTest("Number of arguments vararg: ",1, 2, 3);
        vaTest("Number of arguments vararg: ");
    }
}
