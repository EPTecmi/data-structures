public class Main {

  static class Stack{
    String[] data;
    int top;

    public Stack(int capacity){
      data = new String[capacity];
      top = -1;
    }

    public void push(String value){
      if(top == data.length - 1){
        System.out.println("La pila esta llena");
        return;
      }
      top++;
      data[top] = value;
    }

    public String peek(){
      if(top == -1){
        // System.err.println("Pila vacia");
        // return 0;
        throw new RuntimeException("La pila esta vacia");
      }
      return data[top];
    }

    public String pop(){
      if(top == -1){
        throw new RuntimeException("La pila esta vacia");
      }
      String value = data[top];
      top--;
      return value;
    }

    public boolean isEmpty(){
      return top == -1;
    }

    public int size(){
      return top + 1;
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(10);

    stack.push("Abrir navegador");
    stack.push("Abrir documento");
    stack.push("Editar documento");
    stack.push("Guardar documento");
    
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());

















    // System.out.println(stack.isEmpty());

    // stack.push(10);
    // stack.push(20);
    // stack.push(30);
    // stack.push(40);
    // System.out.println(stack.size());

    // System.out.println(stack.pop());

    // System.out.println(stack.peek());

    // System.out.println(stack.isEmpty());
  }
  
}
