import java.util.Scanner;
public class dsa_12 {

   public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); 
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("Enter the values of the array: ");
        for (int i = 0; i < arr.length; i++) {
             arr[i]=sc.nextInt();
        }
        rotate1(arr);
        sc.close();
   }  
   static void rotate1(int arr[]){
        int temp= arr[0];
        for (int i = 0; i < arr.length-1; i++) {
             arr[i]=arr[i+1];
          }
          arr[arr.length-1]=temp;
          for (int i : arr) {
               System.out.print(i +" ");
          }
   }
}
