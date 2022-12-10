import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        numbersGreaterThanAverage();

    }
    public static void   numbersGreaterThanAverage(){
        Scanner scanner =new Scanner (System.in);
        int array []= new int [10];
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter your grade's #"+(i+1));
            array[i]= scanner.nextInt();
            sum+=array[i];
        }
        double average= sum / array.length;

        for (int j = 0; j < array.length; j++) {
            if (array[j]>average){
                System.out.print(array[j]+",");

            }
        }


    }
}
