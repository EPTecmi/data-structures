import java.util.Random;
public class Main {
  static void shellSort(int[] arreglo){
    for(int gap = arreglo.length / 2; gap > 0; gap /= 2){
      for(int i = gap; i < arreglo.length; i++){
        int temp = arreglo[i];
        int j = i;
        while(j >= gap && arreglo[j - gap] > temp){
          arreglo[j] = arreglo[j - gap];
          j -= gap;
        }
        arreglo[j] = temp;
      }
    }
  }

  static void mergeSort(int[] arreglo, int izquierda, int derecha){
    if(izquierda >= derecha){
      return;
    }

    int medio = (izquierda + derecha) / 2;
    mergeSort(arreglo, izquierda, medio);
    mergeSort(arreglo, medio + 1, derecha);
    
    merge(arreglo, izquierda, medio, derecha);
  }

  static void merge(int[] arreglo, int izquierda, int medio, int derecha){
    int n1 = medio - izquierda + 1;
    int n2 = derecha - medio;

    int[] izquierdaArray = new int[n1];
    int[] derechaArray = new int[n2];

    for(int i = 0; i < n1; i++){
      izquierdaArray[i] = arreglo[izquierda + 1];
    }
    for(int j = 0; j < n2; j++){
      derechaArray[j] = arreglo[medio + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = izquierda;

    while(i < n1 && j < n2){
      if(izquierdaArray[i] <= derechaArray[j]){
        arreglo[k] = izquierdaArray[i];
        i++;
      } else {
        arreglo[k] = derechaArray[j];
        j++;
      }
    }

    while(i < n1){
      arreglo[k] = izquierdaArray[i];
      i++;
      j++;
    }

    while(j < n2){
      arreglo[k] = derechaArray[j];
      j++;
      k++;
    }
  }

  static void quickSort(int[] arreglo, int izquierda, int derecha){
    if(izquierda < derecha){
      int pivote = partition(arreglo, izquierda, derecha);
      
      quickSort(arreglo, izquierda, pivote - 1);
      quickSort(arreglo, pivote + 1, derecha);
    }
  }

  static int partition(int[] arreglo, int izquierda, int derecha){
    int pivote = arreglo[derecha];
    int i = izquierda - 1;

    for(int j = izquierda; j < derecha; j++){
      if(arreglo[j] < pivote){
        i++;

        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
      }
    }

    int temp = arreglo[i + 1];
    arreglo[i + 1] = arreglo[derecha];
    arreglo[derecha] = temp;

    return i + 1;
  }

  static int[] generarDatosAleatorios(int cantidad){
    Random random = new Random();
    int[] datos = new int[cantidad];
    for( int i = 0; i < cantidad; i++){
      datos[i] = random.nextInt(100000);
    }
    return datos;
  }

  static void imprimir(int[] arreglo){
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
      int[] datos = generarDatosAleatorios(1000000);
      // // System.out.println("Antes de Shell:");
      // // imprimir(datos);
      // long inicio = System.nanoTime();
      // shellSort(datos);
      // long fin = System.nanoTime();
      // long tiempo = fin - inicio;
      // System.out.println("Tiempo: " + tiempo + "ns");
      // System.out.println("Despues de Shell:");
      // imprimir(datos);

      // Merge Sort
      // long inicio = System.nanoTime();
      // mergeSort(datos, 0, datos.length - 1);
      // long fin = System.nanoTime();
      // long tiempo  = fin - inicio;
      // System.out.println("Tiempo: " + tiempo + "ns");
      // Quick Sort
      long inicio = System.nanoTime();
      quickSort(datos, 0, datos.length - 1);
      long fin = System.nanoTime();
      long tiempo  = fin - inicio;
      System.out.println("Tiempo: " + tiempo + "ns");
  }
}
