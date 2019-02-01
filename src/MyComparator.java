import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getExamsNote()>o2.getExamsNote()){
            return 1;
        }
        else if (o1.getExamsNote()==o2.getExamsNote()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
