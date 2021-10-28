package module2.praktikum;

import module2.praktikum.protec.ModifierProtec;

public class Main {
    public static void main(String[] args) {
        Modifier modif = new Modifier();
        Modifier modif2 = new Modifier();
        Modifier modif3 = new Modifier();

        System.out.println(modif.angkaPublic);
        System.out.println(modif2.angkaProtected);

        ModifierProtec modifProtec = new ModifierProtec();

        System.out.println(modifProtec.teksPublic);
    }

}
