package module5.tugas.perbankan;

import module5.tugas.perbankan.Tabungan;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan = new Tabungan(0);

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
    }
}
