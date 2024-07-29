package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a; //a=10
        a = b ; //a=20
        b = temp; // b=10;

        System.out.println("a = " + a); //a=20
        System.out.println("b = " + b); //b=10
    }
}
