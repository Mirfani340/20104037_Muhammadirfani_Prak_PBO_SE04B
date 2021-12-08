package tugas.percobaan3;

public class B extends A {
    private int z;

    public void getJumlah() {
        System.out.println("jumlah: " + (x + y + z));
    }

    public void setZ(int z) {
        this.z = z;
    }
}
