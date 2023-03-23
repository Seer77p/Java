package Java.DZ.dz6;

import java.util.ArrayList;

public class semple {

    public static void us_cpu_filter(ArrayList<noutbook> nouts, int us_cpu) {
        System.out.println("\nДоступные варианты согласно запроса: ");
        for (noutbook nout : nouts) {
            if (nout.cpu >= us_cpu) {
                System.out.print("\n"+nout);
            }
        }
        System.out.println();
    }

    public static void us_hdd_filter(ArrayList<noutbook> nouts, int us_hdd) {
        System.out.println("\nДоступные варианты согласно запроса: ");
        for (noutbook nout : nouts) {
            if (nout.hdd >= us_hdd) {
                System.out.print("\n" + nout);
            }
        }
        System.out.println();
    }
    
    public static void us_system_filter(ArrayList<noutbook> nouts, String us_system) {
        System.out.println("\nДоступные варианты согласно запроса: ");
        for (noutbook nout : nouts) {
            if (nout.system.equals(us_system)) {
                System.out.print("\n" + nout);
            }
        }
        System.out.println();
    }
    
    public static void us_color_filter(ArrayList<noutbook> nouts, String us_color) {
        System.out.println("\nДоступные варианты согласно запроса: ");
        for (noutbook nout : nouts) {
            if (nout.color.equals(us_color)) {
                System.out.print("\n" + nout);
            }
        }
        System.out.println();
    }
    
    public static void us_prise_filter(ArrayList<noutbook> nouts, int us_prise) {
        System.out.println("\nДоступные варианты согласно запроса: ");
        for (noutbook nout : nouts) {
            if (nout.prise >= us_prise) {
                System.out.print("\n"+nout);
            }
        }
        System.out.println();
    }
}