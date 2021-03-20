public class dsa_10 {
     public static void main(String[] args) {
          int arr[]= {-4,44,30,-99,0,1000,33};
          arraySorting(arr);
     }
     static void arraySorting(int arr[]){
          int k=0;
          for (int i = 0; i < arr.length; i++) {
               if(arr[i]<0){
                    arr[k]=arr[i];
                    k++;
                    for (int j =0 ; j < i; j++) {
                         arr[k+j]=arr[j+k-1];
                    }
                    
               }
          }
          System.out.print("The sorted array is:");
          for (int i : arr) {
               System.out.print(i+" ");
          }
     }
}
