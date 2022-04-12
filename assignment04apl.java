import java.util.Arrays;
import java.util.*;

//Write a program to sort an array using insertion sort
class InsertionSort{
    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        InsertionSort is = new InsertionSort();
        is.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
    void insertionSort(int array[]) {
        int size = array.length;
    
        for (int step = 1; step < size; step++) {
          int key = array[step];
          int j = step - 1;
    
          while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            --j;
          }
          array[j + 1] = key;
        }
    }
}

//  2 .Add elements in arraylist and change the 3rd index element

class addelement{
    public static void main(String[] args) {
        List < Integer > al = new ArrayList < Integer > ();
    
        al.add(15);
        al.add(30);
        al.add(45);
        al.add(60);
        System.out.println(al);
        al.add(3,100);
        System.out.println(al);

    }
}

//  3.Coply all elements from one list to another

class copyelement{
    public static void main(String[] args) {
        ArrayList<Integer> copyele = new ArrayList<>();
  
        copyele.add(10);
        copyele.add(21);
        copyele.add(22);
        copyele.add(35);
  
        ArrayList<Integer> copyele2 = copyele;
  
        
        for (Integer value : copyele2) {
            System.out.println(value);
        }
  
        copyele2.set(2, 23);
  
        System.out.println( copyele.get(2));
        System.out.println(copyele2.get(2));
    }
}
// 4.Sort arraylist in descending order

class ArrayListshort {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>();
       list.add("JavaFx");
       list.add("Java");
       list.add("WebGL");
       list.add("OpenCV");
       Collections.sort(list);
       System.out.println(list);
       Collections.reverse(list);
       System.out.println(list);
    }
 }
