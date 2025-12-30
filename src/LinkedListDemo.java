import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.addFirst(5);
        list.addLast(20);

        list.removeFirst();
        list.removeLast();

        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
