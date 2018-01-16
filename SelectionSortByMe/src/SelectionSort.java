public class SelectionSort{
    public static int [] selectionSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int index=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[index])
                    index=j;
            }
            int small=array[index];
            array[index]=array[i];
            array[i]=small;

        }


        return array;
    }
    public static void main(String []args){
        int []in={12,3,4,13,5,6};
        int []sorted=selectionSort(in);
        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]+",");
        }
    }
}