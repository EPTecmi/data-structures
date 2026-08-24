public class Main {
  static class PriorityQueue{
    int[] heap;
    int size;

    public PriorityQueue(int capacity) {
      heap = new int[capacity];
      size = 0;
    }

    public int parent(int index){
      return (index - 1) / 2;
    }

    public int leftChild(int index){
      return 2 * index + 1;
    }

    public int rightChild(int index){
      return 2 * index + 2;
    }

    public void swap(int i, int j){
      int temp = heap[i];
      heap[i] = heap[j];
      heap[j] = temp;
    }

    public void insert(int value){
      int index = size;
      heap[index] = value;
      size++;
      heapifyUp(index);
    }

    public void heapifyUp(int index){
      while(index > 0){
        int parentIndex = parent(index);

        if(heap[index] <= heap[parentIndex]){
          break;
        }

        swap(index, parentIndex);
        index = parentIndex;
      }
    }

    
  }

  public static void main(String[] args) {
      PriorityQueue pq = new PriorityQueue(6);

      pq.insert(40);
      pq.insert(20);
      pq.insert(50);
  }
  
}
