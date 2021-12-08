package praktikum.Contoh1;
public class Lagu {
    String pencipta;
    String lagu;

    public void isiLagu(String judul) {
        lagu = judul;
        pencipta = "Uknown";
    }

    public void isiLagu(String judul, String pencipta) {
        lagu = judul;
        this.pencipta = pencipta;
    }

    public void cetakKeLayar() {
        System.out.println("Judul\t: "+lagu + "\n"+
                            "Pencipta\t: "+pencipta);
    }
}
