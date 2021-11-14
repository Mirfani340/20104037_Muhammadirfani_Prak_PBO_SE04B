package module4.praktikum.percobaan2;

public class tabungan2 {
    private int saldo;
    private int noRekening;
    private int pin;
    private String nama;

    public tabungan2(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 1000000;
        this.pin = 1111;
    }

    public tabungan2(String nama, int saldo, int pin, int noRekening) {
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.noRekening = noRekening;
    }

    public void simpanUang(int jumlah) {
        setSaldo(this.saldo + jumlah);
    }

    public void tarikUang(int jumlahTarikUang) {
        this.saldo -= jumlahTarikUang;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getNama() {
        return nama;
    }

}
