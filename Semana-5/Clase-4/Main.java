public class Main {
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
    }
  }

  static class BinaryTree{
    private Node root;

    public void insert(int data){
      root = insertRecursive(root, data);
    }

    public void preorder(){
      preorderRecursive(root);
    }

    public void inorder(){
      inorderRecursive(root);
    }

    public void postorder(){
      postorderRecursive(root);
    }

    public void delete(int data){
      root = deleteRecursive(root, data);
    }

    // Private Methods
    private Node deleteRecursive(Node node, int data){
      if(node == null){
        return null;
      }

      if(data < node.data){
        node.left = deleteRecursive(node.left, data);
      } else if(data > node.data){
        node.right=deleteRecursive(node.right, data);
      } else {
        // Caso 1 - Nodo hoja
        if(node.left == null && node.right == null){
          return null;
        }
        // Caso 2 - Nodo con un hijo
        if(node.left == null){
          return node.right; // Caso si hijo izquierdo no existe
        }
        if(node.right == null){
          return node.left; // Caso si hijo derecho no existe
        }

        Node heir = min(node.right);
        node.data = heir.data;
        node.right = deleteRecursive(node.right, heir.data);
      }
      return node;
    }

    private Node min(Node node){
      while(node.left != null){
        node = node.left;
      }
      return node;
    }

    private void postorderRecursive(Node node){
      if(node == null){
        return;
      }
      
      postorderRecursive(node.left);
      postorderRecursive(node.right);
      System.out.print(node.data + " ");
    }

    private void inorderRecursive(Node node){
      if(node == null){
        return;
      }
      inorderRecursive(node.left);
      System.out.print(node.data + " ");
      inorderRecursive(node.right);
    }

    private void preorderRecursive(Node node){
      if(node == null){
        return;
      }

      System.out.print(node.data + " ");
      preorderRecursive(node.left);
      preorderRecursive(node.right);
    }

    private Node insertRecursive(Node node, int data){
      if(node == null){
        return new Node(data);
      }
      if(data < node.data){
        node.left = insertRecursive(node.left, data);
      } 
      else if(data > node.data){
        node.right = insertRecursive(node.right, data);
      }
      return node;
    }
  }

  public static void main(String[] args) {
      BinaryTree bt = new BinaryTree();
      // bt.insert(50);
      // bt.insert(30);
      // bt.insert(80);
      // bt.insert(20);
      // bt.insert(40);
      // bt.insert(70);
      // bt.insert(90);
      bt.insert(60);
      bt.insert(40);
      bt.insert(80);
      bt.insert(70);
      bt.insert(90);

      // System.out.println("Preorden: ");
      // bt.preorder();
      // System.out.println();
      System.out.println("Inorden pre delete:");
      bt.inorder();
      System.out.println();
      bt.delete(80);
      System.out.println("Preorden post delete 80:");
      bt.preorder();
      System.out.println();
      // bt.delete(30);
      // System.out.println("Preorden post delete 30:");
      // bt.preorder();
      // System.out.println();
      // bt.delete(50);
      // System.out.println("Preorden post delete 50(raiz):");
      // bt.preorder();
      // System.out.println();
      // System.out.println("Postorden:");
      // bt.postorder();
  }
  
}
