public class Main {
  static class Queue{
    int[] data;
    int front;
    int rear;

    Queue(int capacity){
      data = new int[capacity];
      front = 0;
      rear = -1;
    }

    public void enqueue(int value){
      if(rear == data.length - 1){
        System.out.println("La cola esta llena");
        return;
      } 
      rear++;
      data[rear] = value;
    }

    public int dequeue(){
      int value = data[front];
      front++;
      return value;
    }

    // public int peek(){

    // }
  }  

  public static void main(String[] args) {
      Queue queue = new Queue(4);

      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);
      queue.enqueue(40);
      
      // System.out.println(queue.size());


      System.out.println(queue.dequeue());

  }
}
