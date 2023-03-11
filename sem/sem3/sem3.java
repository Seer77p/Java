package Java.sem.sem3;

import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

// import java.lang.System.Logger;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;

public class sem3 {
    //     public static void main(String[] args) {

    //         // Logger logger = Logger.getLogger(Program.class.getName());
    //         // FileHandler fh = new FileHandler("file.txt");
    //         // logger.config("text.txt");
    //         // logger.log(Level.INFO, "INFO");

    //         // String myObj = "{\"name\":\"vasya\"}";
    //         // System.out.println(myObj);
    //         // StringBuilder builder = new StringBuilder(myObj);
    //         // builder.delete(0, builder.indexOf("\"") + 1);
    //         // System.out.println(builder);
    //         // builder.deleteCharAt(builder.indexOf("\""));
    //         // System.out.println(builder);
    //         // String field = builder.substring(0, builder.indexOf(":"));
    //         // System.out.println(field);
    //         // String name = builder.substring(builder.indexOf("\"") + 1, builder.lastIndexOf("\""));
    //         // System.out.println(name);

    //     }
    // }

    //     public static void fillarray(Random random) {
    //         ArrayList<Integer> array = new ArrayList<>();
    //         for (int i = 0; i < 10; i++) {
    //             array.add(random.nextInt(1, 100));
    //         }
    //         System.out.println(array);
    //         Collections.sort(array);
    //         System.out.println(array);
    // }

    //     public static void main(String[] args) {
    //         Random random = new Random();
    //         fillarray(random);
    //     }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i] + " ");
        }
        
        System.out.println();
        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            collection.add(array[i]);
        }
        System.out.println(collection);
        for (int i = 0; i < collection.size(); i++) {
            //System.out.print(collection.get(i)+" ");
        }
        for (Iterator<Integer> iterator = collection.iterator(); iterator.hasNext();) {
            
            System.out.print(iterator.next()+" ");
        }
    }
}