package Java.DZ.dz6;

public class noutbook {
    int id;
    int hdd;// размер диска
    String system;// операционная среда
    String color;// цвет
    int cpu;// частота процессора
    double prise;// цена

    public noutbook(int id, int hdd, String system, String color, int cpu, double prise) {
        this.id = id;
        this.hdd = hdd;
        this.system = system;
        this.color = color;
        this.cpu = cpu;
        this.prise = prise;
    }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "Noutbook " + "id:" + id + " hdd:" + hdd + " system:" + system + " Color:" + color + " Cpu:" + cpu
               + "ГГц " + " Цена = " + prise + "\n";
   }



}
