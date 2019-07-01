package employees;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = new Calculator().add(a, b);
        System.out.println(c);
    }
}
