import java.util.Scanner;


public class dsa_1 {
     static void arrayreverse(int arr[]){
          for (int i = 0; i < arr.length/2; i++) {
               int temp =arr[i];
               arr[i]=arr[arr.length-1-i];
               arr[arr.length-1-i]=temp;
          }
          System.out.println("The given array after reversal is :");
          for (int i : arr) {
               System.out.print(i+ " ");
          }
     }
      public static void main(String[] args){
          System.out.println("Enter the total number of elements in the array");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          System.out.print("Enter the values of the array");
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i]=sc.nextInt();

          }
          arrayreverse(arr);
          sc.close();

     }
}













