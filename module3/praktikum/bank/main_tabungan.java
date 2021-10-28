package module3.praktikum.bank;

import java.util.Scanner;

public class main_tabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tabungan tabungan = new tabungan(5000);
        System.out.println("Jumlah uang yang di ambil\t");

        int di_ambil = input.nextInt();
        tabungan.ambil_uang(di_ambil);

        System.out.println("Jumlah tabungan sekarang =\t");
        System.out.println(tabungan.getSaldo());
    }
}
