
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;


/**
 * p4b
 */
public class p4b {

    public static void main(String[] args) {
        ArrayList<String> empNames = new ArrayList<>();
        empNames.add("A");
        empNames.add("B");
        empNames.add("C");
        empNames.add("D");
        empNames.add("E");
        for (var elem : empNames) {
            System.out.print(elem + " ");
        }
        System.out.println();

        TreeSet<Integer> salary = new TreeSet<>();
        salary.add(10000);
        salary.add(12000);
        salary.add(234000);
        salary.add(50000);
        salary.add(46000);
        for (var elem : salary) {
            System.out.print(elem + " ");
        }
        System.out.println();


        HashMap<Integer, String> id = new HashMap<>();
        id.put(1, "A");
        id.put(2, "B");
        id.put(3, "C");
        id.put(4, "D");
        id.put(5, "E");
        for (var elem : id.entrySet()) {
            System.out.println(elem.getKey() + " : " + elem.getValue());
        }
        System.out.println();
        
    }
}