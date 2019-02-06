import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Atai");
        System.out.println("Элемент [0] ячейки:");
        System.out.println(arrayList.get(0));
        arrayList.add("Ariana");
        System.out.println();

        System.out.println("Список имен в коллекции:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("Результаты поиска элемента с именем Atai");
        if (arrayList.contains("Atai")){
            System.out.println("succes");
        }
        else{
            System.out.println("fail");
        }
        System.out.println();

        System.out.println("Список элементов после удаления элемента по индексу [1]:");
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println();

        System.out.println("Список элементов коллекции после удаления по объекту {Atai}:");
        arrayList.remove("Atai");
        System.out.println(arrayList);
        System.out.println();

    }


}
