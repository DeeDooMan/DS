import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Atai");
        System.out.println(arrayList.get(0));
        arrayList.add("Ariana");
        Iterator<String> it = arrayList.iterator();
        for (String array :arrayList) {
            if (it.hasNext()){
                System.out.println(it.next());
            }
        }

        if (arrayList.contains("asdjasdfhaslkjdfklaladjnhk")){
            System.out.println("succes");
        }
        else{
            System.out.println("fail");
        }

    }


}
