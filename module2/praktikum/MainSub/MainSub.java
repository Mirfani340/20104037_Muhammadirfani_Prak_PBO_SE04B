package module2.praktikum.MainSub;

import module2.praktikum.protec.ModifierSubClass;

public class MainSub extends ModifierSubClass {

    public static void main(String[] args) {
        MainSub mainsub = new MainSub();

        System.out.println(mainsub.teksProtec);
        System.out.println(mainsub.teksPublic);
    }
}
