// bubble sort example

class BubbleSort {
    static void performBubbleSort(int[] arr){
        int size = arr.length;
        int temp = 0;
        for (int i=0; i<size; i++){
            for(int j=1; j< (size-i); j++){
                if(arr[j-1] > arr[j]){ //swap elements
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 14, 7, 84, 37, 89, 56, 27, 99};
        
        System.out.println(" Array before bubble sort: ");
        // printing out the unsorted array
        
        for( int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        
        //sorting the array using bubble sort
        
        performBubbleSort(arr);
        System.out.println("Array after bubble sort: ");
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + "");
        }
        
    }
}
