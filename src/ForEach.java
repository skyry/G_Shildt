public class ForEach {
    public static void main (String args[]){
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i: num){
            System.out.println("i равно " + i);
            sum += i;
            if (i==5) break;
        }
        System.out.println("Сумма равна" + sum);
    }
}
