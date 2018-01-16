public class BubbleSort {
 public static void Bubblesort(int []array){
     int n = array.length;

    for(int m=0;m<array.length;m++){
        for(int i=0;i<n-1;i++){
            int k=i+1;
            if(array[i]>array[k])
                swapMe(i,k,array);
        }printMe(array);
        System.out.println();
    }

 }
 public static void swapMe(int i,int k,int []array){
     int temp=array[k];
     array[k]=array[i];
     array[i]=temp;

 }
 public static void printMe(int []array){
     for(int i=0;i<array.length;i++){
         System.out.print(array[i]+",");
     }
 }
 public static void main(String []args){
     int []input ={4,2,7,20,12,3,6};
     Bubblesort(input);
 }
}
