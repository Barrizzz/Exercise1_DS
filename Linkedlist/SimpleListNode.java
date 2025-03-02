package Linkedlist;

public class SimpleListNode {
    Node head;

    static class Node{
        String data;
        Node next;

        // Constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SimpleListNode list = new SimpleListNode(); // Empty linked list
        
        // Inseting 4 nodes with data (not linked yet)
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");

        // Linking the list together (by first pointing the head to 'tom')
        list.head = tom;
        tom.next = dick;
        dick.next = harry;
        harry.next = sam;

        System.out.println(tom.data);
        
        // To print the next ones just use the next method
        System.out.println(tom.next.data);
        System.out.println(tom.next.next.data);
        System.out.println(tom.next.next.next.data);

        // Or by using head pointer
        System.out.println("\nOther way is by using head pointer\n");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        /*  As we can see if we create linked list from scratch, there are going to be a lot of writing 'next' 
        which is not good for big data! */
        
        Node bill = new Node("Bill");

        // Insert Bill before Tom
        bill.next = list.head;
        list.head = bill;

        // Print the updated list
        System.out.println("\nUpdated list after inserting Bill before Tom:\n");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);
        
        Node sue = new Node("Sue");

        harry.next = sue;
        sue.next = sam;

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
