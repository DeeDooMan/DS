import java.util.Stack;

public class Test5_5 {
    public static void main(String[] args) {
        Stack<Integer> firstTower = new Stack<>();
        Stack<Integer> helpTower = new Stack<>();
        Stack<Integer> lastTower = new Stack<>();
        System.out.println("Ханойская башня:");
        firstTower.push(3);
        firstTower.push(2);
        firstTower.push(1);
        System.out.println(firstTower);
        System.out.println(helpTower);
        System.out.println(lastTower);
        System.out.println();
        hanoiMethod(firstTower,helpTower,lastTower,firstTower.size());
    }
    private static void hanoiMethod(Stack<Integer> firstTower, Stack<Integer> helpTower, Stack<Integer> lastTower, int count) {
        if(count > 0){
            hanoiMethod(firstTower,lastTower,helpTower,count-1);
            int lowest = firstTower.pop();
            lastTower.push(lowest);
            System.out.println(firstTower);
            System.out.println(helpTower);
            System.out.println(lastTower);
            System.out.println();
            hanoiMethod(helpTower,firstTower,lastTower,count-1);
        }
    }
}