package module3.praktikum.bank;

public class tabungan {
    private int saldo;

    // kalo kita membuat variable object wajib private biar tidak
    // tumpang tindih
    public tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void ambil_uang(int jumlah) {
        // Substraction
        saldo -= jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

}
