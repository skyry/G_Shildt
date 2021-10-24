public class BreakLoop2 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            System.out.print("Проход " + i + ": ");
            for (int j=0; j<100; j++) {

                System.out.print(j);
                if (j > 20) System.out.print("! ");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Loop End");
    }
}
