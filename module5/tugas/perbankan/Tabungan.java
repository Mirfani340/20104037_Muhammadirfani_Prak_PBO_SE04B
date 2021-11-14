package module5.tugas.perbankan;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo > jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return true;
        }
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

}
