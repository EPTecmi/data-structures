
import java.util.HashMap;


public class HT {
  public static void main(String[] args) {
    HashMap<Integer, String> users = new HashMap<>();
  
    users.put(1001, "Ana");
    users.put(1002, "Luis");
    users.put(1003, "Maria");

    // System.out.println(users.get(1002));
    // System.out.println(users.containsKey(1003));
    // users.remove(1003);
    // System.out.println(users.containsKey(1003));
    // System.out.println(users.size());
    // System.out.println(users.isEmpty());

    HashMap<String, Double> products = new HashMap<>(); 

    products.put("PROD001", 159.99);
    products.put("PROD002", 89.99);
    products.put("PROD003", 249.99);

    System.out.println(products.get("PROD002"));
  }
}
