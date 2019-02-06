import java.util.ArrayList;

public class Test5_5 {
    public static void main(String[] args) {

    }

    public static void ker(int kolvoDiskov){
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
        arrayList1.add(0,1);
        arrayList1.add(1,2);
        arrayList1.add(2,3);
        arrayList2.add(0,0);
        arrayList2.add(1,0);
        arrayList2.add(2,0);
        arrayList3.add(0,0);
        arrayList3.add(1,0);
        arrayList3.add(2,0);

        System.out.println("Matrix:");
        for (int i =0; i<arrayList1.size(); i++){
            System.out.println(arrayList1.get(i)+" "+arrayList2.get(i)+" "+arrayList3.get(i));
        }
        System.out.println();

        int array2Sum = arrayList2.get(0)+arrayList2.get(1)+arrayList2.get(2);
        int array3Sum = arrayList3.get(0)+arrayList3.get(1)+arrayList3.get(2);

        if (kolvoDiskov==1){
            arrayList3.set(0,kolvoDiskov);
        }
        else if (kolvoDiskov>1) {
            ker(kolvoDiskov-1);

        }
    }


}
