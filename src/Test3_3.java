import java.util.LinkedList;

public class Test3_3 {
    public static void main(String[] args) {
        LinkedList<String> lessons = new LinkedList<String>();
        lessons.add("Math");
        lessons.add("Theory");
        lessons.add("Geometry");
        lessons.addFirst("Music");
        lessons.addLast("Work");
        lessons.add(3,"English");
        lessons.set(2,"Logic");

        System.out.printf("В списке %d элементов \n", lessons.size());
        for (String s: lessons
        ) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Первый элемент списка: " + lessons.getFirst());
        System.out.println();

        System.out.println("Последний элемент списка: " + lessons.getLast());
        System.out.println();

        lessons.removeFirst();
        System.out.println("Список после удаления первого элемента:");
        System.out.println(lessons);
        System.out.println();

        lessons.removeLast();
        System.out.println("Список после удаления последнего элемента:");
        System.out.println(lessons);
        System.out.println();


        LinkedList<String> newList = new LinkedList<String>();
        newList.addAll(lessons);
        System.out.println("Новый список, в который добавлен список Lessons");
        System.out.println(newList);
        System.out.println();

        if (newList.contains("Logic")){
            System.out.println("В новом списке содержится элемент Logic");
            System.out.println();
        }

        newList.remove(1);
        System.out.println("Новый список после удаления 2ого элемента");
        System.out.println(newList);
        System.out.println();

        newList.remove();
        System.out.println("Новый список после удаления первого элемента (метод remove()) списка:");
        System.out.println(newList);
        System.out.println();

        newList.remove("English");
        System.out.println("Новый список после удаления элемента English:");
        System.out.println(newList);
        System.out.println();

        newList.clear();
        System.out.println("Новый список после удаления всех её элементов:");
        System.out.println(newList);
        System.out.println();


    }
}
