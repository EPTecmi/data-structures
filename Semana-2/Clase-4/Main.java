public class Main {
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class Queue{
    Node front;
    Node rear;

    Queue(){
      front = null;
      rear = null;
    }

    public void enqueue(int data){
      Node newNode = new Node(data);

      if (front == null){
        front = newNode;
        rear = newNode;
        return;
      }

      rear.next = newNode;
      rear = newNode;
    }

    public int dequeue(){
      if(front == null){
        throw new RuntimeException("La cola esta vacia");
      }
      int value = front.data; // Paso 1
      front = front.next; // Paso 2
      // Paso 3
      if(front == null){
        rear = null;
      }
      return value; // Paso  4
    }

    public int peek(){
      if(front == null){
        throw new RuntimeException("La cola esta vacia");
      }
      return front.data;
    }

    public boolean isEmpty(){
      return front == null;
    }

    public int size(){
      int cont = 0;
      Node current = front;
      while(current != null){
        cont++;
        current = current.next;
      }
      return cont;
    }
  }

  public static void main(String[] args) {
      Queue queue = new Queue();

      System.out.println("La cola esta vacia?: " + queue.isEmpty());
      System.err.println("Entra persona 10");
      queue.enqueue(10);
      System.err.println("Entra persona 20");
      queue.enqueue(20);
      // System.out.println("La cola esta vacia?: " + queue.isEmpty());
      // System.out.println("Cuantas personas en la fila?: " + queue.size());
      // System.out.println("El siguiente en la fila es: " + queue.peek());
      // System.out.println("Salio la persona: " + queue.dequeue());
      // System.out.println("Cuantas personas en la fila?: " + queue.size());
      // System.out.println("El siguiente en la fila es: " + queue.peek());
      // System.out.println(queue.dequeue());
      // System.out.println("La cola esta vacia?: " + queue.isEmpty());
      // queue.enqueue(30);
      // System.out.println("El siguiente en la fila es: " + queue.peek());
      // System.out.println(queue.dequeue());
  }
  
}
