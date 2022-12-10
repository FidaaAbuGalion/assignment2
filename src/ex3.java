import java.lang.reflect.Array;

public class ex3 {
    public static void main(String[] args) {
        int arr []={1,4,5,7,4,3,1,5,3,6};
     deleteDuplicates(arr);
    }
    public static void   deleteDuplicates (int arr[]){
        int l = arr.length;
        for (int i = 0; i < l; i++) {


            for ( i = 0; i < l-1; i++) {
                for (int j =i+1; j <l ; j++) {
                    if (arr[i]==arr[j]){
                        arr[j]=arr[l-1];
                        l--;
                    }
                }
            }
        }
        System.out.println("new array without duplicates");
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]+"");

        }
    }
}
