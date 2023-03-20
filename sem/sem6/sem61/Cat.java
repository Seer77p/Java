package Java.sem.sem6.sem61;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;

public class Cat {
    int id;
    String poroda;
    String Gender;
    String Color;
    String Name;
    int Age;
    Date DataRegictration;
    String NameDoctor;
    
    public String getDiagnoz() {
        String diagnoz = "";
        ArrayList<String> Bolezn = new ArrayList<>();
        Bolezn.add("Грипп");
        Bolezn.add("Лишай");
        Bolezn.add("Почки");
        Bolezn.add("Операция");
        Bolezn.add("Печень");
        Random rand = new Random();
        return Bolezn.get(new Random().nextInt(5));
    }
    
    public String ToString() {
        StringBuilder result = new StringBuilder();
        result.append("Характеристики кота:\n");
        result.append(String.format("ID  %d:\n", id));
        result.append(String.format("Poroda %s:\n", poroda));
        result.append(String.format("Pol %s:\n", Gender));
        result.append(String.format("color %s:\n", Color));
        result.append(String.format("color %s:\n", Name));
        result.append(String.format("color %s:\n" + DataRegictration.toString()));
        result.append(String.format("color %s:\n", NameDoctor));
        result.append(String.format("Diagnoz\n", getDiagnoz()));

        return "";
    }
}
