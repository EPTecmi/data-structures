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

    // Private Methods

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
      bt.insert(20);
      bt.insert(50);
      bt.insert(55);
      bt.insert(70);
      bt.insert(90);

      System.out.println("Preorden: ");
      bt.preorder();
      System.out.println();
      System.out.println("Inorden:");
      bt.inorder();
      System.out.println();
      System.out.println("Postorden:");
      bt.postorder();
  }
  
}
