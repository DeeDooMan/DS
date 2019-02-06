import java.util.Comparator;

public class MyComparator2 implements Comparator<BankAccount> {

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        if (o1.getBalans()>o2.getBalans()){
            return 1;
        }
        else if (o1.getBalans()==o2.getBalans()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
