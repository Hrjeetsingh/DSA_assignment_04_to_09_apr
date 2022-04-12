import java.util.*;


// Write a program to print the fibonacci numbers recursively till n
class FibonacciSeries {
    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many elements you want to print in a Fibonacci series");
        int n = in.nextInt();
        
        System.out.println("Fibonacci series");
        System.out.print(first + " "+ second + " ");
        
        int next;

        for(int i = 2; i < n; i++) {
           
            next = first + second;
            
            System.out.print(next + " ");
            
            first = second;
            second = next;
        }
        
    }
    
}
//  Function to find the nth Fibonacci number
class Main
{
    
    public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
 
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args)
    {
        int n = 8;
 
        System.out.println("F(n) = " + fib(n));
    }
}

// write a recursive function to compute the sum of a array

public class SumOfArrayElements {

    private static int calculateSum(int arr[], int n) {

        if (n <= 0) {
           return 0;
         }
         return calculateSum(arr, n-1 ) + arr[n-1];
      }

     public static void main(String[] args) {

        int arr[] = {2, 5, 6, 8, 9, 12};
        int sum = calculateSum(arr, arr.length);

         System.out.println(sum);
     }

}