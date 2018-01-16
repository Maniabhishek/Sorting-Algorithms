public class InsertionSort {
    public static  int[] insertionSort(int []array){
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp =array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String []args){
        int array[]={45,23,55,67,45,33,32};
        int sorted[] =insertionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(sorted[i]+",");
        }
    }

}
