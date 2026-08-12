public class reto1 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){
        // Node first = new Node(100);
        // Node second = new Node(200);
        // Node third = new Node(300);
        // Node fourth = new Node(400);
        Node first = new Node(5);
        Node second = new Node(12);
        Node third = new Node(8);
        Node fourth = new Node(21);
        Node fifth = new Node(30);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node current = first;

        int cont = 1;

        while(current != null){
            System.out.println("Ciclo: " + cont);
            System.out.println(current.data);

            cont++;
            current = current.next;
        }
        
    }
}
