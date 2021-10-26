package module2.tugas;

import java.util.Scanner;

public class AnakAyamStory {
    public static void main(String[] args) {
        int anakAyam;
        Scanner input = new Scanner(System.in);
        System.out.print("Input anak ayam :");
        anakAyam = input.nextInt();
        do {
            System.out.println("anak ayam turun\t" + anakAyam);
            anakAyam = anakAyam - 1;
            System.out.println("Mati 1 tinggal\t" + anakAyam);
        } while (anakAyam > 1);
        System.out.println("Mati 1 tinggal Induknya");
    }

}
