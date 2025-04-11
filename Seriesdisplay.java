
/**
 * Write a description of class Seriesdisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Seriesdisplay
{
    public static void main(String[] args) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(2 * i);
            if (i < 10) {
                System.out.print(",");
            }
        }
        System.out.println(); 
         System.out.println("Using while loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(2 * j);
            if (j < 10) {
                System.out.print(", ");
            }
            j++;
        }
         System.out.println();
          System.out.println("Using do-while loop:");
        int k = 1;
        do {
            System.out.print(2 * k);
            if (k < 10) {
                System.out.print(", ");
            }
            k++;
        } while (k <= 10);
        System.out.println(); 
    }
}
