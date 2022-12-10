import java.util.Random;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int[] array = thePassword();
        guess(thePassword());


    }


    public static int[] thePassword() {
        //boolean flag = true;
        Random random = new Random();
        int[] array = new int[4];
        //int index = 4;
        array[0] = random.nextInt(6) + 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(6) + 1;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }

        }

        return array;
    }


    public static void guess(int[] realPassword) {
        Scanner scanner = new Scanner(System.in);
        String status = "game over";
        int numberOfTheChances, TheRandomNumberOfChance, countTheWin = 0;
        System.out.println("choose the difficulty of the game 20 chance or 15 chance or 10 chance if you want random chances ENTER 5");
        numberOfTheChances = scanner.nextInt();
        int[] theGuessOfTheUser = new int[4];
        if (numberOfTheChances == 5) {
            Random random = new Random();
            TheRandomNumberOfChance = random.nextInt(25) + 5;
            for (int i = 0; i < TheRandomNumberOfChance; i++) {
                for (int j = 0; j < theGuessOfTheUser.length; j++) {
                    System.out.println("Enter your guess");
                    theGuessOfTheUser[i] = scanner.nextInt();
                    if (theGuessOfTheUser[i] == realPassword[i]) {
                        System.out.println("your guess in right place");
                        int counterFor4Corect = 0 ;
                        counterFor4Corect ++;
                        if (counterFor4Corect == 4) {
                            System.out.println("you are the winier");
                        } else {
                            counterFor4Corect = 0;
                        }
                    } else {
                        for (int k = 0; k < 4; k++) {

                            if (theGuessOfTheUser[i] == realPassword[k]) {
                                System.out.println("your guess in somewhere else");
                                break;

                            }
                            for (int l = 0; l < 4; l++) {
                                int counter = 0;

                                if (theGuessOfTheUser[l] == realPassword[l]) {
                                    counter++;
                                }
                                if (counter == 4) {
                                    System.out.println("you are win");
                                } else {
                                    counter = 0;
                                }
                            }
                        }
                    }


                }
            }
        } else {

            for (int i = 0; i < numberOfTheChances; i++) {
                int counterFor4Corect = 0 ;
                System.out.println("you are in the chance number" + i );

                for (int j = 0; j < theGuessOfTheUser.length; j++) {
                    System.out.println("Enter your guess");
                    theGuessOfTheUser[i] = scanner.nextInt();
                    if (theGuessOfTheUser[i] == realPassword[i]) {
                        System.out.println("your guess in right place");
                        counterFor4Corect++;
                        if (counterFor4Corect == 4) {
                            System.out.println("you are the wineer");
                        } else {
                            counterFor4Corect = 0;
                        }
                    } else {
                        for (int k = 0; k < 4; k++) {

                            if (theGuessOfTheUser[i] == realPassword[k]) {
                                System.out.println("your guess in somewhere else");
                                break;

                            }
                            for (int l = 0; l < 4; l++) {
                                int counter = 0;

                                if (theGuessOfTheUser[l] == realPassword[l]) {
                                    counter++;
                                }
                                if (counter == 4) {
                                    System.out.println("you are win");
                                } else {
                                    counter = 0;
                                }
                            }
                        }
                    }


                }
            }
        }
    }




}
