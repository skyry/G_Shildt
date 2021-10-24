
public class Test_1 {
    int a, b;

    Test_1 (int i, int j){
        a = i;
        b = j;
    }

    void meth (Test_1 o) {
        o.a *= 2;
        o.b /= 2;
    }
}


class CallBayValue{
    public static void main (String args[]) {
        Test_1 ob = new Test_1(15, 20);

        System.out.println("a & b before: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("a and b after: " + ob.a + " " + ob.b);
    }
}