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

    public void insertAtBeginning(int data){
      Node newNode = new Node(data);

      newNode.next = head;
      head = newNode;
    }

    public void insertAt(int index, int data){
      if (head == null){
        return;
      }
      if(index < 0) {
        return;
      }

      if(index == 0){
        insertAtBeginning(data);
        return;
      }

      // Caso de indice mayor a numero de elementos en la lista
     if(index > size()){
      insertAtEnd(data);
      return;
     }

      Node newNode = new Node(data);
      Node current = head;

      for(int i = 0; i < index - 1 ; i++){
        current = current.next;
      }


      newNode.next = current.next;
      current.next = newNode;
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

    public void deleteAt(int index){
      if(head == null){
        return;
      }

      if(index == 0){
        head = head.next;
        return;
      }

      Node current = head;

      for (int i = 0; i < index - 1; i++){
        if(current.next == null){
          return;
        }
        current = current.next;
      }

      current.next = current.next.next;
    }

    public int get(int index){
      Node current = head;

      for(int i = 0; i < index; i++){
        current = current.next;
      }

      return current.data;
    }
  }

  public static void main(String[] args){
    LinkedList list = new LinkedList();

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);
    list.insertAtEnd(50);
    // System.out.println("---- Listado de elementos -----");
    // list.display();
    
    // System.out.println("---- Tamaño de lista -----");
    // System.out.println(list.size());
    // System.out.println("---- Buscar 30 -----");
    // System.out.println(list.search(30));
    // System.out.println("---- Buscar 99 -----");
    // System.out.println(list.search(99));
    // System.out.println("---- Eliminar 30 -----");
    // list.delete(30);
    // System.out.println("---- Listado de elementos -----");
    // list.display();
    // System.out.println("---- Agregar 5 al inicio de la lista -----");
    // list.insertAtBeginning(5);
    // System.out.println("---- Listado de elementos -----");
    // list.display();
    // list.insertAt(4, 5);
    System.out.println(list.get(2));
    // System.out.println("---- Listado de elementos -----");
    // list.display();
  }
}
