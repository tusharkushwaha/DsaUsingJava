public class dsa_11 {
     public static void main(String[] args) {
          int arr1[]= {1,2,3,4,5,88,6,7,8,9,10,99};
          int arr2[]={5,6,7,8,9,10};
          unionArr(arr1,arr2);
          intersectiionArray(arr1,arr2);
          
     }
     static void unionArr(int arr1[], int arr2[])
     {
          int k=0;
          int arr3[]= new int[arr1.length+arr2.length];
          for (int i = 0; i < arr1.length; i++) {
               arr3[i]=arr1[i];

          }
          for (int i = 0; i < arr2.length; i++) {
               k=0;
               for (int j = 0; j < arr1.length; j++) {
                    if(arr1[j]==arr2[i]){

                         break;
                    }
                    k+=1;
               }
               if(k==arr1.length)
               arr3[arr1.length-1+k]=arr2[i];
          }
          int index_0=0;
          for (int i : arr3) {
               if(i==0)
               break;
               index_0+=1;

          }
          System.out.print("The union of the given array is: ");
          for (int i=0;i<index_0;i++){
             System.out.print(arr3[i] + " ");
        }
        System.out.println();

     }
     static void intersectiionArray(int arr1[], int arr2[]){
          System.out.print("The intersection of the given arrays is: ");
          for (int i : arr1) {
               for (int j : arr2) {
                    if(i==j)
                    System.out.print(i + " ");
                    
               }
          }
     }
}

































