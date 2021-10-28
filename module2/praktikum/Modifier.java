package module2.praktikum;

public class Modifier {
    public int angkaPublic = 10;
    private int angkaPrivate = 100;
    protected int angkaProtected = 1000;

    public void printAngkaPrivate() {
        System.out.println(angkaPrivate);
    }
}
