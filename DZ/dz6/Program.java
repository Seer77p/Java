package Java.DZ.dz6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<noutbook> nouts = new ArrayList<>();
        nouts.add(new noutbook(1, 1200, "windows", "black", 2100, 40000));
        nouts.add(new noutbook(2, 1000, "OS", "grey", 2000, 55000));
        nouts.add(new noutbook(3, 1300, "Linux", "black", 2200, 65000));
        nouts.add(new noutbook(4, 1400, "OS", "red", 1500, 35000));
        nouts.add(new noutbook(5, 1500, "Linux", "blue", 2500, 70000));
        nouts.add(new noutbook(6, 2000, "windows", "black", 4100, 120000));
        menu.menu(nouts);
    }
}
