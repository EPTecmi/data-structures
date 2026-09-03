public class Main {
  static void generateBinary(String current, int length){
    if(current.length() == length){ // Caso base
      System.out.println(current);
      return;
    }
    generateBinary(current + "0", length); // Primera decisión
    generateBinary(current + "1", length); // Segunda decisión
  }

  static void generateAB(String current, int length){
    if(current.length() == length){ // Caso base
      System.out.println(current);
      return;
    }
    generateAB(current + "A", length); // Primera decisión
    generateAB(current + "B", length); // Segunda decisión
  }

  static void permutations(String current, String remaining){

    if(remaining.length() == 0){
      System.out.println(current);
      return;
    }

    for(int index = 0; index < remaining.length() ; index++){

      char selected = remaining.charAt(index);

      String nextCurrent = current + selected;

      String nextRemaining = remaining.substring(0,index) + remaining.substring(index + 1);

      permutations(nextCurrent, nextRemaining);

    }

  }

  static int countPermutations(String current, String remaining){

    if(remaining.length() == 0){
      return 1;
    }

    int total = 0;

    for(int index = 0; index < remaining.length() ; index++){

      char selected = remaining.charAt(index);

      String nextCurrent = current + selected;

      String nextRemaining = remaining.substring(0,index) + remaining.substring(index + 1);

      total += countPermutations(nextCurrent, nextRemaining);

    }

    return total;

  }

  public static void main(String[] args) {
      // generateBinary("", 3);
      // generateAB("", 3);

      System.out.println(countPermutations("", "ABCDE"));


  }
}
