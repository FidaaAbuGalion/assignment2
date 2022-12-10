import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a phone number :");
        String phoneNumber= scanner.nextLine();

       checkNumber(phoneNumber);

    }
    public static void checkNumber (String phoneNumber){
        String newNum = "050-" ;
        if (phoneNumber.length()==10){
        for (int i = 3; i < phoneNumber.length(); i++) {
            newNum = newNum + phoneNumber.charAt(i);
        }
            System.out.println(newNum);

    }else if (phoneNumber.length()==11){

            System.out.println(phoneNumber);

    }else if (phoneNumber.length()==12){
            for (int i = 5 ; i < phoneNumber.length(); i++) {
                newNum = newNum + phoneNumber.charAt(i);
            }
            System.out.println(newNum);


        }else {
            System.out.println("The phone number is not available");


    }




    }
}