package module4.praktikum.percobaan2;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class main {
    public static void main(String[] args) {
        tabungan2 irfan = new tabungan2("irfan", 5000, 123, 20104037);
        tabungan2 jony = new tabungan2("mauZhiDong ", 121314);

        System.out.println("Isi saldo mr " + irfan.getNama() + "Adalah\t" + irfan.getSaldo());
        System.out.println("Isi saldo mr " + jony.getNama() + "Adalah\t" + jony.getSaldo());
    }
}
