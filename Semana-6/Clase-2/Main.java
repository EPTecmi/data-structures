
import java.util.Random;

public class Main {
   static void bubbleSort(int[] arreglo){
    // int intercambios = 0;
    // int comparaciones = 0;
    for(int i = 0; i < arreglo.length - 1; i++){ // Controlar las pasadas/recorridos
      for(int j = 0; j < arreglo.length - 1 - i; j++){ // Recorre el arreglo y con -i restamos el valor que ya fue acomodado
        // comparaciones++;
        if(arreglo[j] > arreglo[j + 1]){ // aqui fue el cambio
          int temp = arreglo[j];
          arreglo[j] = arreglo[j+1];
          arreglo[j+1] = temp;
          // intercambios++;
        }
      }
    }
    // System.out.println("Movimientos Bubble : " + intercambios);
    // System.out.println("Comparaciones Bubble: " + comparaciones);
  }

  static void selectionSort(int[] arreglo){
    // int intercambios = 0;
    // int comparaciones = 0;
    for(int i = 0; i < arreglo.length - 1; i++){
      int indiceMenor = i;
      for(int j = i + 1; j < arreglo.length; j++){
        // comparaciones++;
        if(arreglo[j] < arreglo[indiceMenor]){
          indiceMenor = j;
        }
      }
      if(i != indiceMenor){
        int temp = arreglo[i];
        arreglo[i] = arreglo[indiceMenor];
        arreglo[indiceMenor] = temp;
        // intercambios++;
      }
    }
    // System.out.println("Movimientos Selection: " + intercambios);
    // System.out.println("Comparaciones Selection: " + comparaciones);
  }

  static void insertionSort(int[] arreglo){
    // int comparaciones = 0;
    // int movimientos = 0;
    for(int i = 1; i < arreglo.length; i++){
      int key = arreglo[i]; // El elemento que vamos a insertar
      int j = i - 1; // Posición desde donde revisamos

      while(j >= 0 && arreglo[j] > key){
        // comparaciones++;
        arreglo[j + 1] = arreglo[j]; // Desplazar a la derecha
        // movimientos++;
        j--; // Recorrer a la izquierda el arreglo
      }
      arreglo[j + 1] = key; // Insertar el valor en la posición correcta
    }
    // System.out.println("Movimientos Insertion: " + movimientos);
    // System.out.println("Comparaciones Insertion: " + comparaciones);
  }

  static void imprimir(int[] arreglo){
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }

  static int[] generarDatosAleatorios(int cantidad){
    Random random = new Random();
    int[] datos = new int[cantidad];
    for( int i = 0; i < cantidad; i++){
      datos[i] = random.nextInt(100000);
    }
    return datos;
  }

  static int[] generarDatosOrdenados(int cantidad){
    int[] datos = new int[cantidad];
    for(int i = 1; i <= cantidad; i++){
      datos[i-1] = i;
    }
    return datos;
  }
  static int[] generarDatosInvertidos(int cantidad){
    int[] datos = new int[cantidad];
    int numEle = cantidad;
    for(int i = 0; i < numEle; i++){
      datos[i] = cantidad;
      cantidad--;
    }
    return datos;
  }
  public static void main(String[] args) {
      int cantidad = 1000000;
      int[] datosA = generarDatosAleatorios(cantidad);
      int[] datosO = generarDatosOrdenados(cantidad);
      int[] datosI = generarDatosInvertidos(cantidad);

      // imprimir(datosA);
      // imprimir(datosO);
      // imprimir(datosI);
      

      int[] bubble = datosI.clone();
      int[] selection = datosI.clone();
      int[] insertion = datosI.clone();
      
      
      long inicio = System.nanoTime();
      bubbleSort(bubble);
      long fin = System.nanoTime();
      long tiempo = fin - inicio;
      System.out.println("Tiempo Bubble: " + tiempo + "ns");

      inicio = System.nanoTime();
      selectionSort(selection);
      fin = System.nanoTime();
      tiempo = fin - inicio;
      System.out.println("Tiempo Selection: " + tiempo + "ns");

      inicio = System.nanoTime();
      insertionSort(insertion);
      fin = System.nanoTime();
      tiempo = fin - inicio;
      System.out.println("Tiempo Insertion: " + tiempo + "ns");
      

  }
}
