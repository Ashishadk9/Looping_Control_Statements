
/**
 * Write a description of class Pattren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattren
{
   public static void main(String[] args) {
        int n = 5; 
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
              System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
             System.out.println();
        }
    }     
}
