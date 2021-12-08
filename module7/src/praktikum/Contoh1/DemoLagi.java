package praktikum.Contoh1;

public class DemoLagi {
    public static void main(String[] args) {
        Lagu lagu1, lagu2;

        lagu1 = new Lagu();
        lagu2 = new Lagu();

        lagu1.isiLagu("Say it");
        lagu2.isiLagu("USSR Atemp", "i dont know");
        
        lagu1.cetakKeLayar();
        lagu2.cetakKeLayar();
    }
}
