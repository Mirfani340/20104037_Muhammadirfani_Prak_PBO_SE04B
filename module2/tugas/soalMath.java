package module2.tugas;

import java.util.Scanner;

public class soalMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input A1:\t");
        int A1 = input.nextInt();
        System.out.println("input B1:\t");
        int B1 = input.nextInt();
        System.out.println("input C1:\t");
        int C1 = input.nextInt();
        System.out.println("Hasil = " + (+A1 + B1 - C1));

        System.out.println("input A2");
        int A2 = input.nextInt();
        System.out.println("input B2");
        int B2 = input.nextInt();
        System.out.println("input C2");
        int C2 = input.nextInt();
        System.out.println("Hasil = " + (A2 + (B2) - (C2)));
    }
}
