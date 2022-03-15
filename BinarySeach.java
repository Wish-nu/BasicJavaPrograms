//A PROGRAM TO SEARCH A KEY NUMBER IN AN ARRAY USING BINARY SEARCH 



class BinarySearch{
public static void binarySearch(int arr[], int first, int last, int key){
    int mid = (first + last)/ 2;
    while (first<=last){
        if (arr[mid]<key){
            first = mid + 1;
        }
        else if (arr[mid] == key){
            System.out.println("Element is found @ array index: " + mid);
            break;
        }
        else {
            last = mid -1;
        }
        mid = (first+last)/2;
    }
    if (first>last){
        System.out.println("Element is not found");
    }
}


    public static void main(String[] args) {
        int arr[] = { 10, 25, 34, 49, 56, 67,73, 86,98};
        int key = 56;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
       
    }

}
