//Класс вычисляет факториал вводимового значения

public class Test2 {

    public static void main(String[] args) {
        System.out.println(fac(1));
    }

    public static int fac(int n){
        if(n==0){
            return 1;
        }
        else if (n==1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
}
