import java.util.Scanner;

class BinarySearch {
  int[] arr;
  BinarySearch(int[] arr){
    this.arr = arr;
  }
  int search(int l, int r, int n){
    int mid = l+(r-l)/2;
    if(r<l){
      return -1;
    }
    if (arr[mid] == n){
      return mid;
    }
    else if (arr[mid]>n){
      return search(l, mid-1, n);
    }
    else if (arr[mid]<n) {
      return search(mid+1, r, n);
    }
    return -1;
  }
}

public class ImplementSearch {
  public static void main(String args[]){
    System.out.println("Enter size of array");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] array = new int[size];
    for(int i = 0; i<size; i++){
      System.out.println("Enter value of element "+(i+1));
      array[i] = sc.nextInt();
    }
    System.out.println("Enter Value you want to search");
    int target = sc.nextInt();
    BinarySearch b = new BinarySearch(array);
    int result = b.search(0, array.length-1, target);
    if (result == -1) {
      System.out.println("Element not present in array");
    } else {
      System.out.println("Element found at index " + result);
    }
    sc.close();
  }
}
