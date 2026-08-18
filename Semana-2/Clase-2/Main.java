public class Main {
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class Stack{
    Node top;

    Stack(){
      top = null;
    }

    public void push(int data){
      Node newNode = new Node(data);

      newNode.next = top;
      top = newNode;
    }

    public int pop(){
      if(top == null){
        throw new RuntimeException("La pila esta vacia");
      }

      int value = top.data;
      top = top.next;
      return value;
    }

    public int peek(){
      if(top == null){
        throw new RuntimeException("La pila esta vacia");
      }
      return top.data;
    }

    public boolean isEmpty(){
      return top == null;
    }

    public int size(){
      int cont = 0;

      Node current = top;

      while(current != null){
        cont++;
        current = current.next;
      }
      return cont;
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack();

    // stack.push(10);
    // stack.push(20);
    // stack.push(30);

    // System.out.println(stack.peek());
    // System.out.println(stack.pop());
    // System.out.println(stack.peek());
    System.out.println(stack.isEmpty());
    System.out.println(stack.size());
  }
}
