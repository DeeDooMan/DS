import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int input1 = in.nextInt();
        System.out.println();
        System.out.println("Введите степень:");
        int input2 = in.nextInt();
        System.out.println();
        System.out.println("Результат выражения: "+input1+"^"+input2+"=");
        System.out.println(vozvedenieVStepen(input1, input2));
    }

    public static int vozvedenieVStepen(int n, int m){
            if (m==0){
                return 1;
            }
            else {
                return n * (vozvedenieVStepen(n, m - 1));
            }
    }
}
