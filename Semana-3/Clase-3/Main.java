public class Main {

  static class HashTable{
    int[] table;

    public HashTable(int size) {
      table = new int[size];
    }

    public int hash(int key){
      return key % table.length;
    }

    public void put(int key){
      int index = hash(key);
      table[index] = key;
    }

    public boolean containsKey(int key){
      int index = hash(key);
      return table[index] == key;
    }

    public void showTable(){
      System.out.println("Indice -> Valor");
      for(int i = 0; i < table.length; i++){
        System.out.println(i + " -> " + table[i]);
      }
    }

  }

  public static void main(String[] args) {
      HashTable ht = new HashTable(10);

      ht.put(1001);
      ht.put(1002);
      ht.put(1003);

      // ht.showTable();

      System.out.println(ht.containsKey(1005));
  }


  
}
