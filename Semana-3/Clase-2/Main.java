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

    public int peek(){
      if(size == 0){
        throw new RuntimeException("Priority Queue Vacia");
      }
      return heap[0];
    }

    public int remove(){
      if(size == 0){
        throw new RuntimeException("Priority Queue Vacio");
      }

      int result = heap[0];
      heap[0] = heap[size - 1];
      size--;
      heapifyDown(0);

      return result;

    }

    public void heapifyDown(int index){
      while (true) { 
          int left = leftChild(index);
          int right = rightChild(index);
          int largest = index;

          if(left < size && heap[left] > heap[largest]){
            largest = left;
          }
          if(right < size && heap[right] > heap[largest]){ 
            largest = right;
          }
          if(largest == index){ 
            break;
          }

          swap(index, largest);

          index = largest;
      }
    }

    
  }

  public static void main(String[] args) {
      PriorityQueue pq = new PriorityQueue(6);

      pq.insert(40);
      pq.insert(20);
      pq.insert(60);
      pq.insert(10);
      pq.insert(80);
      pq.insert(30);

      System.out.println(pq.peek());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
      System.out.println(pq.remove());
    }
  
}
