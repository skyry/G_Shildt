public class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        System.out.println(n);
        return result;
    }

}


class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Factorial 3 = " + f.fact(6));
        //System.out.println("Factorial 4 = " + f.fact(4));
        //System.out.println("Factorial 5 = " + f.fact(5));
    }


}