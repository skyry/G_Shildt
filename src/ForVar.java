public class ForVar {
    public static void main(String[] args) {
        long i;
        boolean done = false;
        i = 0;
        for ( ; !done; ) {
            System.out.println("i равно " + i);
            if (i == 1000000000) done   = true;
            i++;
        }
    }
}
