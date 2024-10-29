public class ArrayPlayground {

    public static void main(String[] args) {
        /*** 1D-Arrays ***/
        System.out.println("--- 1D ---");
        
        int[] zahlen = {4, 2, -5, 0, 10};
        
        // Ändern Sie die folgenden Code-Stellen so ab, dass sie tun, was im Kommentar steht.
        // Es muss jeweils nur in einer Zeile etwas geändert werden.
        
        // gibt die erste Zahl im Array aus:
        System.out.println(zahlen[0]);
        
        // gibt die letzte Zahl im Array aus:
        System.out.println(zahlen[4]);
        
        // gibt alle Zahlen im Array von vorne nach hinten aus:
        for(int zahl: zahlen) {
            System.out.print(zahl);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        // gibt alle Zahlen im Array von hinten nach vorne aus:
        for(int i = zahlen.length - 1; i >= 0; i--) {
            System.out.print(zahlen[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        /*** 2D-Arrays ***/
        System.out.println("--- 2D ---");
        
        int[][] matrix = {{3, 5, 2},
                          {1, 4, 9},
                          {0, 7, 9}};
        
        // Ändern Sie die folgenden Code-Stellen so ab, dass sie tun, was im Kommentar steht:
        
        // gibt die Zahl oben links in der Matrix aus (die 3):
        System.out.println(matrix[0][0]);
        
        // gibt die Zahl unten links in der Matrix aus (die 0):
        System.out.println(matrix[2][0]);
        
        // gibt die erste Zeile der Matrix aus (3 5 2):
        for(int zahl: matrix[0]) {
            System.out.print(zahl);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        // gibt die erste Spalte der Matrix aus (3 1 0):
        for(int[] zeile: matrix) {
            System.out.print(zeile[0]);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        // gibt die gesamte Matrix in „Matrixform“ aus, also
        // 3 5 2
        // 1 4 9
        // 0 7 9
        for(int[] zeile: matrix) {
            for(int zahl: zeile) {
                System.out.print(zahl);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        // gibt aus, ob die erste und zweite Zeile der Matrix dieselbe Länge haben:
        boolean haveSameLength = (matrix[0].length == matrix[1].length);
        System.out.println(haveSameLength);
    }

}
