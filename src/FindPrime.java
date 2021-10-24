public class FindPrime {
    public static void main (String args[]) {
        int num = 14;
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i=2; i <= num/i; i++) {
            if ((num % i) == 0){
                isPrime = true;
                break;
            }
        }
        if (isPrime) System.out.println("Простое");
        else System.out.println("Не простое");
    }
}
