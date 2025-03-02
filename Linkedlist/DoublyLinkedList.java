package Linkedlist;

public class DoublyLinkedList {
    Node head;

    static class Node {
        String data;
        Node next;
        Node prev; 

        // Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null; 
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(); // Correct class name

        // Inserting 4 nodes with data (not linked yet)
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");

        // Linking the list together (by first pointing the head to 'tom')
        list.head = tom;
        tom.prev = null;

        tom.next = dick;
        dick.prev = tom; 
        
        dick.next = harry;
        harry.prev = dick; 

        harry.next = sam;
        sam.prev = harry; 

        // To print the next ones just use the next method
        System.out.println(tom.data);
        System.out.println(tom.next.data);
        System.out.println(tom.next.next.data);
        System.out.println(tom.next.next.next.data);

        // Since it is double we can use prev
        System.out.println("\n" + sam.data);
        System.out.println(sam.prev.data);
        System.out.println(sam.prev.prev.data);
        System.out.println(sam.prev.prev.prev.data);

        // Or by using head pointer
        System.out.println("\nOther way is by using head pointer\n");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        // Since it is double we can use prev
        list.head = sam; // Change the head to another data first

        System.out.println("\n" + list.head.data);
        System.out.println(list.head.prev.data);
        System.out.println(list.head.prev.prev.data);
        System.out.println(list.head.prev.prev.prev.data);

        list.head = tom; // Reset the head

        Node bill = new Node("Bill");

        // Insert Bill before Tom
        bill.next = list.head; // Move the head to the data after bill (which is the newly inserted data)
        list.head.prev = bill; 
        list.head = bill; // Because bill is the new first element

        // Print the updated list
        System.out.println("\nUpdated list after inserting Bill before Tom:\n");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);

        // Inserting Sue after Harry
        Node sue = new Node("Sue");

        harry.next = sue;
        sue.prev = harry; 

        sue.next = sam;
        sam.prev = sue; 

        // Print the updated list
        System.out.println("\nUpdated list after inserting Sue after Harry:\n");

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);
        System.out.println(list.head.next.next.next.next.next.data);
    }
}
