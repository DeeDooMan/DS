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
        System.out.println("Первый элемент списка: " + lessons.getFirst());
        System.out.println("Последний элемент списка: " + lessons.getLast());
        for (String s: lessons
             ) {
            System.out.println(s);
        }
        lessons.removeFirst();
        System.out.println("Список после удаления первого элемента:");
        System.out.println(lessons);
        lessons.removeLast();
        System.out.println("Список после удаления последнего элемента:");
        System.out.println(lessons);


        LinkedList<String> newList = new LinkedList<String>();
        newList.addAll(lessons);
        System.out.println("Новый список, в который добавлен список Lessons");
        System.out.println(newList);

        if (newList.contains("Logic")){
            System.out.println("В новом списке содержится элемент Logic");
        }

        newList.remove(1);
        System.out.println("Список после удаления 2ого элемента");
        System.out.println(newList);

        newList.remove();
        System.out.println("Список после удаления первого элемента (метод remove()) списка:");
        System.out.println(newList);

        newList.remove("English");
        System.out.println("Список после удаления элемента English:");
        System.out.println(newList);

        newList.clear();
        System.out.println("Новый список после удаления всех её элементов:");
        System.out.println(newList);


    }
}
