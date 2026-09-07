public class Main {

  static class Node{
    int data;
    Node left;
    Node right;
  }

  static class Nodo{
    int dato;
    Nodo izquierdo;
    Nodo derecho;

    Nodo(int dato){
      this.dato = dato;
    }
  }

  public static void main(String[] args) {
    // Node root = new Node();
    // root.data = 10;

    // root.left = new Node();
    // root.left.data = 5;

    // root.right = new Node();
    // root.right.data = 20;

    // root.left.left = new Node();
    // root.left.left.data = 3;

    // root.left.right = new Node();
    // root.left.right.data = 7;


    // Node raiz = new Node();
    // raiz.data = 50;

    // raiz.left = new Node();
    // raiz.left.data = 30;
    // raiz.right = new Node();
    // raiz.right.data = 80;

    // raiz.right.right = new Node();
    // raiz.right.right.data = 90;
    // raiz.left.left = new Node();
    // raiz.left.left.data = 20;
    // raiz.left.right = new Node();
    // raiz.left.right.data = 40;
    // raiz.right.left = new Node();
    // raiz.right.left.data = 70;
    Nodo raiz = new Nodo(50);

raiz.izquierdo = new Nodo(25);
raiz.derecho = new Nodo(80);

raiz.izquierdo.izquierdo = new Nodo(10);
raiz.izquierdo.derecho = new Nodo(40);

raiz.derecho.izquierdo = new Nodo(60);
raiz.derecho.derecho = new Nodo(100);

raiz.derecho.izquierdo.derecho = new Nodo(70);



  }
  
}
