package module3.praktikum.kendaraan;

public class main_kendaraan {
    public static void main(String[] args) {
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil(4);
        mobil mobil3 = new mobil(4, 2, 2);

        mobil1.setRoda(4);
        System.out.println(mobil1);
        System.out.println(mobil2);
        System.out.println(mobil3);

        System.out.println("Mobil 1");
        System.out.println("Roda \t" + mobil1.getRoda());

        System.out.println("Mobil 3");
        System.out.println("Roda \t" + mobil3.getRoda());

        mobil3.setRoda(99);

        System.out.println("Mobil 3 sekarang");
        System.out.println("Roda \t" + mobil3.getRoda());

        System.out.println("Bunyi klakson mobil\t" + mobil3.klakson());

        mobil3.controlPedal("Gas");
        mobil3.controlPedal("rem");
        mobil3.controlPedal("tabrak");
    }

}
