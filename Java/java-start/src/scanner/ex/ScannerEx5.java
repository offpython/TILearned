package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하시오 : ");
        int n1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하시오 : ");
        int n2 = sc.nextInt();

        //n1이 n2보다 큰 경우, 두 숫자를 교환
        if (n1 > n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println("두 숫자 사이의 정수 출력 : ");
        for(int i = n1; i <= n2; i++){
            System.out.print(i);
            if (i != n2) {
                System.out.print(", ");
            }
        }
    }
}
