public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Number of arguments: " + v.length + " Content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num1[] = {10};
        int num2[] = {1, 2, 3};
        int num3[] = {};

        vaTest(num1);
        vaTest(num2);
        vaTest(num3);

    }
}
