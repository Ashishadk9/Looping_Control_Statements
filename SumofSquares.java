
/**
 * Write a description of class SumofSquares here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumofSquares
{
     public static void main(String[] args) {
        int i = 1; 
        int sum = 0; 
         System.out.println("The sum of squares of the first 10 natural numbers");
        do {
            sum += i * i; 
            i++; 
        } while (i <= 10);
         System.out.println("The sum of squares of the first 10 natural numbers is " + sum);
    }
}
