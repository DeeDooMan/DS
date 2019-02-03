public class Test1_1 {
    public static void main(String[] args) {

        int[][] array = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};
        for (int i=0 ; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0 ; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if(i==j){
                    System.out.print(array[i][j]+" ");
                }
                else{
                    System.out.print(array[j][i]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i=array.length-1 ; i>=0; i--){
            for (int j=array.length-1; j>=0; j--){
                    System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
