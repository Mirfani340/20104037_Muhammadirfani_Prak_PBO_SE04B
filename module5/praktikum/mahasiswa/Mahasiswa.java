package module5.praktikum.mahasiswa;

public class Mahasiswa {
    private int nrp;
    private String nama;

    //overloading Construct
    public Mahasiswa(){}

    //overloading Construct
    public Mahasiswa(int nrp) {
        this.nrp = nrp;
    }

    //overloading Construct
    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}