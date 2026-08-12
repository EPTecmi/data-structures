public class Main {

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class LinkedList {
    Node head;

    LinkedList() {
      head = null;
    }

    public void insertAtEnd(int data){
      Node newNode = new Node(data);

      if (head == null){
        head = newNode;
        return;
      }

      Node current = head;

      while (current.next != null){
        current = current.next;
      }
      current.next = newNode;
    }

    public void display(){
      Node current = head;

      while(current != null){
        System.out.println(current.data);
        current = current.next;
      }
    }

    public int size(){
      Node current = head;
      int cont = 0;

      while(current != null){
        cont++;
        current = current.next;
      }
      return cont;
    }

    public boolean search(int value){
      Node current = head;

      while(current != null){
        if (current.data == value){
          return true;
        }
        current = current.next;
      }

      return false;
    }

    public void delete(int value){
      if (head == null){
        return;
      }

      if (head.data == value){
        head = head.next;
        return;
      }

      Node current = head;
      while (current.next != null){
        if(current.next.data == value){
          current.next = current.next.next;
          return;
        }
        current = current.next;
      }
    }
  }

  public static void main(String[] args){
    LinkedList list = new LinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);
    list.insertAtEnd(50);
    System.out.println("---- Listado de elementos -----");
    list.display();
    
    System.out.println("---- Tamaño de lista -----");
    System.out.println(list.size());
    System.out.println("---- Buscar 30 -----");
    System.out.println(list.search(30));
    System.out.println("---- Buscar 99 -----");
    System.out.println(list.search(99));
    System.out.println("---- Eliminar 30 -----");
    list.delete(30);
    System.out.println("---- Listado de elementos -----");
    list.display();
  }
}
