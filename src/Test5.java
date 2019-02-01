import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(new Student("Atai", 5));
        arrayList.add(new Student("Adinai", 10));
        arrayList.add(new Student("Beksultan", 4));
        arrayList.add(new Student("Alina", 80));
        arrayList.add(new Student("Aidin", 2));

        MyComparator myComparator = new MyComparator();

        Collections.sort(arrayList, myComparator);
        Collections.reverse(arrayList);
        System.out.println("Отсортированный список");

        for (Student e: arrayList) {
            System.out.println(e.getName() + " " + e.getExamsNote());
        }
    }
}
