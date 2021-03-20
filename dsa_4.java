

public class dsa_4 {
     static void calculateTheNo(int arr[]){
          int i0=0;
          int i1=0;
          int i2=0;
          for (int j : arr) {
               if(j==0)
               i0++;
               else if(j==1)
               i1++;
               else
               i2++;
          }
          sortingTheArray(arr,i0,i1,i2);
     }
     static void sortingTheArray(int arr[],int i0, int i1, int i2){
          for (int i = 0; i < i0; i++) {
               arr[i]=0;
          }
          for (int i = i0; i < i0+i1; i++) {
               arr[i]=1;
          }
          for (int i = i0+i1; i < arr.length; i++) {
               arr[i]=2;
          }
          for (int i : arr) {
               System.out.print(i+" ");
          }
     }
     public static void main(String[] args) {

          int arr[]={1,2,0,0,0,0,2,1,1,1,1,2,2,2,0,1};
          calculateTheNo(arr);

     }
}
















