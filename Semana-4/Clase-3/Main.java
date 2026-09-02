public class Main {
  static char[][] board = {
    {'C','A','S','A'},
    {'X','S','O','L'},
    {'P','A','T','O'},
    {'R','E','D','X'}
  };

  static boolean[][] visited;

  static boolean exist(String word){

    visited = new boolean[board.length][board[0].length];

    for(int row = 0; row < board.length; row++){
      for(int col = 0; col < board[0].length; col++){
        if(search(row, col, word, 0)){
          return true;
        }
      }
    }
    return false;
  }

  static boolean search(
    int row, 
    int col, 
    String word, 
    int index){
      // Caso Base:
      // Encontramos toda la palabra
      if(index == word.length()){
        return true;
      }

      // Fuera de los limites
      if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
        return false;
      }

      // Posicion ya utilizada
      if(visited[row][col]){
        return false;
      }

      if(board[row][col] != word.charAt(index)){
        return false;
      }

      // Elegimos esta posicion
      visited[row][col] = true;

      // Explorar las cuatro direcciones
      boolean found = 
        search(row + 1, col, word, index + 1) ||
        search(row - 1, col, word, index + 1) ||
        search(row, col + 1, word, index + 1) ||
        search(row, col - 1, word, index + 1);

      // BACTRACKING:
      // deshacer la decision
      visited[row][col] = false;

      return found;
  }

  public static void main(String[] args) {
      String word1 = "CASA";
      String word2 = "PATO";
      String word3 = "JAVA";

      // boolean found = exist(word);
      System.out.println("La palabra CASA fue encontrada? " +  exist(word1));
      System.out.println("La palabra PATO fue encontrada? " +  exist(word2));
      System.out.println("La palabra JAVA fue encontrada? " +  exist(word3));
  }
}
