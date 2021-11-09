package module4.praktikum;

public class tabungan {
    private int saldo;// didalam class namannya attribut
    private String nama;
    private int noRekening;
    private int pin;

    public tabungan(String nama, int saldo, int pin, int noRekening) {
        this.nama = nama;
        this.pin = pin;
        this.saldo = saldo;
        this.noRekening = noRekening;
    }

    public String get_nama() {
        return nama;
    }

    public int get_no_rekening() {
        return noRekening;
    }

    public int get_pin() {
        return pin;
    }

    public int get_saldo() {
        return saldo;
    }
    // // Constructor
    // public tabungan(int saldo) {
    // this.saldo = saldo = 5000;
    // }

    // // @Overloading
    // public tabungan(int saldo) {
    // this.saldo = saldo;
    // }

}
