package module3.tugas.tabungan;

public class db_tabungan {
    private int saldo = 0;
    private boolean status;

    // Di bawah ini adalah constructor
    public db_tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int get_saldo() {
        return saldo;
    }

    public void simpan_uang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambil_uang(int jumlah) {
        saldo -= jumlah;
        if (saldo < 0) {
            return false;
        } else {
            return true;
        }
    }
}