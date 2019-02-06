import java.util.ArrayList;
import java.util.Collections;

public class Test4_4 {
    public static void main(String[] args) {
        ArrayList <BankAccount> bankList = new ArrayList<BankAccount>();
        bankList.add(new BankAccount("Turan",1500));
        bankList.add(new BankAccount("Ariana",2600));
        bankList.add(new BankAccount("John",3000));
        bankList.add(new BankAccount("Markus",9000));
        bankList.add(new BankAccount("Lola",1400));
        bankList.add(new BankAccount("Viktor",8600));
        bankList.add(new BankAccount("Oleksey",2300));
        bankList.add(new BankAccount("Tanya",1000));
        bankList.add(new BankAccount("Beksultan",6700));
        bankList.add(new BankAccount("Olya",8200));

        MyComparator2 myComparator = new MyComparator2();

        Collections.sort(bankList, myComparator);
        Collections.reverse(bankList);
        System.out.println("Учетная запись которая имеет наибольший баланс:");
        System.out.println(bankList.get(0).toString());

    }
}
