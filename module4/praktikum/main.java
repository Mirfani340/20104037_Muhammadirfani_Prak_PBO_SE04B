package module4.praktikum;

public class main {
    public static void main(String[] args) {
        tabungan tabungan = new tabungan("irfan", 10000, 123, 20104037);

        System.out.println("Nama \t\t" + tabungan.get_nama());
        System.out.println("No Rekening \t" + tabungan.get_no_rekening());
        System.out.println("Pin \t\t" + tabungan.get_pin());
        System.out.println("Saldo \t\t" + tabungan.get_saldo());
    }
}
