public class Main {

static class Node{
  int data; // Valor entero a almacenar
  Node left; // Referencia al subarbol menor
  Node right; // Referencia al subarbol mayor
}

static Node insert(Node root, int data){
  if(root == null){
    Node newNode = new Node();
    newNode.data = data;
    return newNode;
  }

  if(data < root.data){
    root.left = insert(root.left, data); 
  } else if(data > root.data){
    root.right = insert(root.right, data);
  }
  return root;
}

static Node search(Node root, int data){
  // Si no en cuentra el valor al llegar a un nodo null
  if(root == null){
    return null;
  }
  
  // Cuando si encuentra el nodo con el valor buscado
  if(data == root.data){
    return root;
  }

  if(data < root.data){
    return search(root.left, data);
  }
  
  return search(root.right, data);
}
public static void main(String[] args) {
    // Node root = new Node();
    // root.data = 50;
    // root.left = new Node();
    // root.left.data = 30;

    Node root = null;
    root = insert(root, 50);
    root = insert(root, 30);
    root = insert(root, 80);
    root = insert(root, 20);
    root = insert(root, 40);
    root = insert(root, 70);
    root = insert(root, 90);

}
  
}
