public class Main {

  static int contador = 0;

  static boolean isEven(int n){
    if(n == 0){
      return true;
    }
    return isOdd(n - 1);
  }

  static boolean isOdd(int n){
    if(n == 0){
      return false;
    }
    return isEven(n-1);
  }

  static void printA(int n){
    if(n == 0){
      return;
    }
    System.out.println("A");
    printB(n - 1);
  }

  static void printB(int n){
    if(n == 0){
      return;
    }
    System.out.println("B");
    printA(n - 1);
  }

  static int max(int[] array, int start, int end){
    if(start == end){
      return array[start];
    }
    int middle = (start + end) / 2;  
    
    int leftMax = max(array, start, middle);
    int rightMax = max(array, middle + 1, end);

    return Math.max(leftMax, rightMax);
  }

  public static void main(String[] args) {
      // System.out.println(isEven(5));
      // System.out.println(isOdd(5));

      // System.out.println(isEven(8));
      // System.out.println(isOdd(8));

      // printA(5);

      int[] numbers = {
        8, 3, 12, 5,
        9, 2, 15, 4
      };

      System.out.println("Maximo: " + max(numbers, 0, numbers.length - 1));
  }
  
}
