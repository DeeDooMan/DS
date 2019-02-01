public class Test1 {

    public static void main(String[] args) {
        int[][] array = {{1,1,1},{2,2,2},{3,3,3}};
        for (int i=0 ; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                System.out.print(array[j][i]+" ");//поменять i и j для транспонирования
            }
            System.out.println();
        }

    }
}
