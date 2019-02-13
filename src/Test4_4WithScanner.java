import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test4_4WithScanner {
    public static void main(String[] args) throws InputMismatchException {
        ArrayList <BankAccount> bankList = new ArrayList<BankAccount>();
        boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите баланс:");
            int balans = scanner.nextInt();

            bankList.add(new BankAccount(name, balans));

            MyComparator2 myComparator = new MyComparator2();

            Collections.sort(bankList, myComparator);
            Collections.reverse(bankList);
            System.out.println("Хотите увидеть результат? (1-да, 0-нет)");
            int i = scanner.nextInt();
            if(i==1){
            System.out.println("Учетная запись которая имеет наибольший баланс:");
            System.out.println(bankList.get(0).toString());
            System.out.println();

                System.out.println("Список учетных записей и их баланс:");
                for (BankAccount list: bankList
                ) {
                    System.out.println(list.toString());
                }
            System.out.println();
            check = false;}
        }
        }
}
