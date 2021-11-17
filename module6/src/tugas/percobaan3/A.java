package tugas.percobaan3;

public class A {
    // Attrbibut di class child harus mengunakan protected
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai() {
        System.out.println("nilai x: " + x + "nilai y: " + y);
    }
}
