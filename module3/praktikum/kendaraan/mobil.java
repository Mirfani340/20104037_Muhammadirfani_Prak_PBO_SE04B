package module3.praktikum.kendaraan;

public class mobil {
    private int roda;
    private int pintu;
    private int jok;

    // overloading (polymorpphism)
    public mobil() {
    }

    // overloading (polymorpphism)
    public mobil(int roda) {
        this.roda = roda;
    }

    // overloading (polymorpphism)
    public mobil(int roda, int pintu, int jok) {
        this.roda = roda;
        this.pintu = pintu;
        this.jok = jok;

        // kita butuh fungsi setter dan getter untuk ambil data dan setting data
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public int getJok() {
        return jok;
    }

    public void setJok(int jok) {
        this.jok = jok;
    }

    // Behavior
    public String klakson() {
        return "Tin... tin...";
    }

    public void controlPedal(String pedal) {
        if (pedal.toLowerCase().equals("gas")) {
            System.out.println("Mobil maju");
        } else if (pedal.toLowerCase().equals("rem")) {
            System.out.println("Mobil berhenti");
        } else
            System.out.println("Perintah di tolak");
    }
}