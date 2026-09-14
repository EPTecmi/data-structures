public class Main {
  static void bubbleSort(int[] arreglo){
    int intercambios = 0;
    int comparaciones = 0;
    for(int i = 0; i < arreglo.length - 1; i++){ // Controlar las pasadas/recorridos
      for(int j = 0; j < arreglo.length - 1 - i; j++){ // Recorre el arreglo y con -i restamos el valor que ya fue acomodado
        comparaciones++;
        if(arreglo[j] > arreglo[j + 1]){ // aqui fue el cambio
          int temp = arreglo[j];
          arreglo[j] = arreglo[j+1];
          arreglo[j+1] = temp;
          intercambios++;
        }
      }
    }
    System.out.println("Intercambios: " + intercambios);
    System.out.println("Comparaciones: " + comparaciones);
  }

  static void selectionSort(int[] arreglo){
    int intercambios = 0;
    int comparaciones = 0;
    for(int i = 0; i < arreglo.length - 1; i++){
      int indiceMenor = i;
      for(int j = i + 1; j < arreglo.length; j++){
        comparaciones++;
        if(arreglo[j] < arreglo[indiceMenor]){
          indiceMenor = j;
        }
      }
      if(i != indiceMenor){
        int temp = arreglo[i];
        arreglo[i] = arreglo[indiceMenor];
        arreglo[indiceMenor] = temp;
        intercambios++;
      }
    }
    System.out.println("Intercambios: " + intercambios);
    System.out.println("Comparaciones: " + comparaciones);
  }

  static void imprimir(int[] arreglo){
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }



  public static void main(String[] args) {
      // int[] arreglo = {1,2,3,4,5,6,7,8,9};
      int[] arreglo1 = {8, 3, 7, 4, 2, 9, 1, 5};
      int[] arreglo2 = {8, 3, 7, 4, 2, 9, 1, 5};
      System.out.println("Antes de ordenar: ");
      imprimir(arreglo1);
      System.out.println("Bubble Sort");
      bubbleSort(arreglo1);
      System.out.println("Select Sort");
      selectionSort(arreglo2);
      System.out.println("Despues de ordenar: ");
      imprimir(arreglo1);
      

  }
  
}
