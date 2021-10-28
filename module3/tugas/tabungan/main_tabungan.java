package module3.tugas.tabungan;

public class main_tabungan {
    public static void main(String[] args) {
        boolean status;
        db_tabungan db_tabungan = new db_tabungan(10000);
        System.out.println("Saldo awal\t" + db_tabungan.get_saldo());
        db_tabungan.simpan_uang(8000);
        System.out.println("Jumlah uang yang di simpan\t8000");
        status = db_tabungan.ambil_uang(7000);
        System.out.println("JUmlah uang yang diambil\t 7000");

        if (status) {
            System.out.println("\t ok");
        } else {
            System.out.println("\t gagal");
        }

        db_tabungan.simpan_uang(1000);
        System.out.println("Jumlah uang yang disimpan \t 1000");
        status = db_tabungan.ambil_uang(10000);
        System.out.println("Jumlah uang yang di ambil 10000");

        if (status) {
            System.out.println("    ok");
        } else {
            System.out.println("    gagal");
        }

        status = db_tabungan.ambil_uang(2500);
        System.out.println("Jumlah uang yang diambil 2500");

        if (status) {
            System.out.println("    ok");
        } else {
            System.out.println("    gagal");
        }
        db_tabungan.simpan_uang(2000);
        System.out.println("Jumlah uang yang disimpan 2000");
        System.out.println("Saldo sekarang = " + db_tabungan.get_saldo());
    }
}
