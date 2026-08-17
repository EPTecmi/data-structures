public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public static void main(String[] args){

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // System.out.println(first.data);
        System.out.println(first.next.next.data);
        // second -> first.next
        // second.next -> third
        // System.out.println(second.data);
        // System.out.println(third.data);



        // int[] grades = {10, 20, 30 ,40};
        // System.out.println(grades[1]);
        // System.out.println(grades[0]);
        // System.out.println(grades[4]);

    }
}