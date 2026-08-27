
import java.util.LinkedList;

public class Main {
  static class Entry{
    int key;
    String value;

    Entry(int key, String Value){
      this.key = key;
      this.value = value;
    }
  }

  static class HashTable{
    private LinkedList<Entry>[] table;

    @SuppressWarnings("unchecked")
    HashTable(int size){
      table = new LinkedList[size];

      for(int i = 0; i < size; i++){
        table[i] = new LinkedList<>();
      }
    }

    private int hash(int key){
      return Math.abs(key) % table.length;
    }

    public void put(int key, String value){
      int index = hash(key);
      table[index].add(new Entry(key, value));
    }

    public boolean containsKey(int key){
      int index = hash(key);
      for(Entry entry : table[index]){
        if(entry.key == key){
          return true;
        }
      }
      return false;
    }
  }

  public static void main(String[] args) {
      HashTable ht = new HashTable(10);
      ht.put(1001,"Ana");
      ht.put(1002, "Luis");
      ht.put(1003, "Maria");

      System.out.println(ht.containsKey(21));
  }
}
