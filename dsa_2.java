

public class dsa_2 {
      static void printarray(int arr[], int n){
           System.out.println("The given array is:");
           for (int i : arr) {
                System.out.print(i+" ");
                
           }
    }
     static void max_min(int arr[]){
     int max= 0;
     int min=0;
     for (int i : arr) {
          if(i>max)
          max=i;
          else if(i<min)
          min=i;
     }
     System.out.printf("The maximum element of the array is %d and the minimum element element of the array is %d",max, min);
    }
     public static void main(String[] args) {
          int arr[]= {1,2,3,4,5,929,-1,-99};
          int n = arr.length;
          printarray(arr,n);
          max_min(arr);
          
     }
}
