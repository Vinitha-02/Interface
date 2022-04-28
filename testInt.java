import java.util.Scanner;

interface test {
    void square();
}

class Arithmetic implements test {
    public void square() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int x = b * b;
        System.out.println(" the square of the number is" + x);
    }
}

public class testInt {
    public static void main(String[] arg) {
        test a = new Arithmetic();
        a.square();
    }
}
