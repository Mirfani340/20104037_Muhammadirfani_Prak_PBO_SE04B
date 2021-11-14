package module5.praktikum.kelas;

import module5.praktikum.mahasiswa.Mahasiswa;

public class kelas {
    private String namaKelas;
    private Mahasiswa[] mahasiswa = new Mahasiswa[10];
    private int mahasiswaLength;

    public kelas(int kodeKelas, String namaKelas) {
        this.namaKelas = namaKelas;
        this.mahasiswaLength = -1;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaLength++;
        this.mahasiswa[mahasiswaLength] = mahasiswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public Mahasiswa[] getMahasiswa() {
        Mahasiswa[] mahasiswaReturn = new Mahasiswa[mahasiswaLength + 1];
        for (int i = 0; i <= mahasiswaLength; i++) {
            mahasiswaReturn[i] = mahasiswa[i];
        }
        return mahasiswaReturn;
    }
}
