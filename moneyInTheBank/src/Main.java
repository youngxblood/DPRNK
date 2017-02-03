import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Created by Mark on 1/31/2017.
 */
public class Main {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello! Welcome to the North Korean election!");
                System.out.println("--------------------------------------------");
                System.out.println("What is your age, comrade?");
                String ageAsString =null;
                int age =0;

                Boolean ageChecker = true;
                while(ageChecker = true) {

                        ageAsString = sc.next();
                        if(ageAsString.matches("\\d+")) {
                            System.out.println("Very good.");
                            age = Integer.parseInt(ageAsString);

                            if (age < 18) {
                                System.out.println("That's not old enough to vote!\nWho are you voting for?");
                                String youngVoter = sc.next();
                                if(youngVoter.matches("(?i)Kim|Kim Jong Un|Our Glorious Leader")) {    //(?i) = not case-sensitive
                                    System.out.println("I am glad to hear this, comrade");
                                    ageChecker = false;
                                }
                                else {
                                    System.out.format("%s... Of course you are!\n", youngVoter);
                                }
                            }
                            break;
                        }
                        else{
                            System.out.println("That is not a valid age. Please try again.");
                            ageChecker = true;
                        }

                        }





                        //  String youngVoter = sc.next();  FOR GETTING STRINGS
                Boolean genderChecker = true;
                System.out.println("What is your gender?");
                while(genderChecker = true) {

                   String gender = sc.next();
                   if (gender.matches("(?i)male|female")) {
                       System.out.println("Excellent!");
                       genderChecker = false;
                       break;
                   } else {
                       System.out.println("That is not a valid. There are only two genders!");
                       genderChecker = true;
                   }
               }


                }

            }
