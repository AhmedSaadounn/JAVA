
import java.util.Arrays;
public class comparison{
  public static void main(String[]args){
// comparison_Arrays
    int[] array1 = new int [] {21,32,36,47};
        int[] array2 = new int [] {11,22,33,44};
    int[] array3 = new int [] {21,32,36,47};

    System.out.println("Are array1 and array2 equal? ["+Arrays.equals(array1, array2)+"]");
        System.out.println("Are array1 and array3 equal? ["+Arrays.equals(array1, array3)+"]");

    
  }
}
