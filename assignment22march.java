import java.util.Scanner;



/*
Write a program to print your name stored in a variable
Write a program to overload a method to calculate volume of sqaure and rectangle
WAP to return boolean value from a method
WAP to store a float value in a method and print it
WAP to print sum using one method and difference using another method from main() method.
 */


class p_name{
    public static void main(String[] args) {
        String name="shohil khan";
        System.out.println(name);
    }
}

class VSR{
    public static void main(String[] args) {
        //int a=4;
        //int b=5;
        //s(a);
        //s(a, b);
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name : ");
        String n=s.nextLine();
        name(n);
        System.out.println(name(n));
    }
    private static void s(int value){
        int vos=value*value;
        System.out.println("value of square = "+vos);
    }
    private static void s(int a,int b){
        int vor=a*b;
        System.out.println("value of square = "+vor);
    }


    private static boolean name(String s){
        String name="hemant";
        if(s.equals(name)){
            return true;
        }
        return false;
    }
}

class practice{
    public static void main(String[] args) {
        
    }
}