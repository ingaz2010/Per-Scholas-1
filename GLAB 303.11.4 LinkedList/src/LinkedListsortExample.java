import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {
    public static void main(String[] args) {

        //Create linked list
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("A");
        linkedlist.add("C");
        linkedlist.add("B");
        linkedlist.add("D");

        //Unsorted
        System.out.println(linkedlist);

        //1. Sort the list
        Collections.sort(linkedlist);
        //Sorted
        System.out.println(linkedlist);

        //2. Custom sorting
        Collections.sort(linkedlist, Collections.reverseOrder());
        //Custom sorted
        System.out.println(linkedlist);
    }
}
