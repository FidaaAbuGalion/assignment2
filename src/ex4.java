public class ex4 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,3,1};

        System.out.println(checkArrayUpDown(arr));
    }

    public static int checkArrayUpDown (int [] arr) {
        int indexOfChange = -1;
        int numberOfChange = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i< arr.length-2){
                numberOfChange = arr[i+1];
                if (arr[i]< numberOfChange && arr [i+2]<numberOfChange){
                    indexOfChange = i + 1;
                }
            }

        }
        return indexOfChange ;
    }
}
