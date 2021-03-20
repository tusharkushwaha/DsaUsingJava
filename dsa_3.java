import java.util.Scanner;
public class dsa_3{
     public static void main(String[] args) {
          System.out.print("Enter the value of k:");
          Scanner sc = new Scanner(System.in);
          int k = sc.nextInt();
          int arr[]= {2,3,4,5,6,7,8,9,-99,111};
          kthMaxMin(arr, k);
          sc.close();
     }
     static void kthMaxMin(int arr[], int k){
          // int maxK=arr[0];
          int max=arr[0];
          // int minK= arr[0];
          int min=arr[0];
          for (int i : arr) {
               if(max<i)
                    max=i;
               if(min>i)
                    min=i;
          }
          for (int i = 1; i <=k-1; i++) {
               int maxK=arr[0];
               int minK= arr[0];
               for (int j : arr) {
                    if(max>j&& j>maxK)
                    maxK=j;
                    if(j>min && j<minK)
                    minK=j;
                    
               }
               max=maxK;
               min=minK;
               
          }

          System.out.printf("Minimim = %d \n Maximum = %d",min,max);
          
     } 
     
}



































