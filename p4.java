
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiConsumer;


class x implements BiConsumer<String, Integer> {
    @Override
    public void accept(String t, Integer u) {
        System.out.println(t + " : " + u);
    }
}


public class p4 {
    public ArrayList<String> studentName;
    public TreeSet<Integer> marks;
    public HashMap<String, Integer> rollNo;

    p4() {
        studentName = new ArrayList<>();
        marks = new TreeSet<>();
        rollNo = new HashMap<>();
    }

    public void insert(String name, int marks_, int rollNo) {
        studentName.add(name);
        marks.add(marks_);
        this.rollNo.put(name, rollNo);
    }

    public void displayAll() {
        System.out.println("Names: ");
        for (var elem : studentName) {
            System.out.print(elem + " ");
        }
        
        System.out.println("\nMarks: ");
        for (var elem : marks) {
            System.out.print(elem + " ");
        }
        
        System.out.println("\nrollNo: ");
        rollNo.forEach(new x());

    }

    public static void main(String[] args) {
        p4 p = new p4();
        p.insert("name1", 98, 1);
        p.insert("name2", 93, 2);
        p.insert("name3", 95,3);
        p.insert("name4", 97, 4);
        p.displayAll();
    }
}
