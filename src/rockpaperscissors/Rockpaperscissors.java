/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author tim
 */
import java.util.*;

public class Rockpaperscissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to rock, paper, scissors.");
        System.out.println("You will be playing against the computer.");

        int uscore = 0;
        int cscore = 0;

        String options[] = {"rock", "paper", "scissors"};

        String userentry = null;
        String computer = null;

        for (int i = 0; (uscore < 5) && (cscore < 5); i++) {
            System.out.println("");
            System.out.println("Enter your choice:");
            userentry = input.next();

            int randX = random.nextInt(3);
            computer = options[randX];

            if (userentry.equalsIgnoreCase(computer)) {
                System.out.println("That's a tie, you both did " + options[randX] + ".");
                System.out.println("The scores haven't changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }

            if ((userentry.equalsIgnoreCase(options[0])) && computer.equals(options[1])) {
                System.out.println("You did " + options[0] + " and the computer did " + options[1]);
                cscore = cscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((userentry.equalsIgnoreCase(options[0])) && computer.equals(options[2])) {
                System.out.println("You did " + options[0] + " and the computer did " + options[2]);
                uscore = uscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((userentry.equalsIgnoreCase(options[1])) && computer.equals(options[2])) {
                System.out.println("You did " + options[1] + " and the computer did " + options[2]);
                cscore = cscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((userentry.equalsIgnoreCase(options[1])) && computer.equals(options[0])) {
                System.out.println("You did " + options[1] + " and the computer did " + options[0]);
                uscore = uscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((userentry.equalsIgnoreCase(options[2])) && computer.equals(options[0])) {
                System.out.println("You did " + options[2] + " and the computer did " + options[0]);
                cscore = cscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((userentry.equalsIgnoreCase(options[2])) && computer.equals(options[1])) {
                System.out.println("You did " + options[2] + " and the computer did " + options[1]);
                cscore = cscore + 1;
                System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

            }
            if ((!userentry.equals(options[0]))&&(!userentry.equals(options[1]))&&(!userentry.equals(options[2]))){
               System.out.println ("INVALID ANSWER");
            }

        }
        System.out.println("BONUS WAR ROUND");
        String bonusoptions[] = {"bomb", "gun", "knife"};
        int randY = random.nextInt(3);
        computer = options[randY];

        System.out.println("");
        
        System.out.println("Rules");
        System.out.println("> bomb represents rock");
        System.out.println("> gun represents paper");
        System.out.println("> knife represents scissors");
        System.out.println("If bomb wins, then you gain 3 points but if it loses, you lose -3 points");
        System.out.println("If gun wins, then you gain 2 points but if it loses, you lose 2 points");
        System.out.println("If knife wins, then you gain 1 point but if it loses, you lose -1 point");
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Enter your choice:");
        String userentry1 = input.next();
        if ((userentry1.equals(bonusoptions[0]))||(userentry1.equals(bonusoptions[1]))||(userentry1.equals(bonusoptions[2]))){
            
        if (userentry1.equalsIgnoreCase(computer)) {
            System.out.println("That's a tie, you both did " + bonusoptions[randY] + ".");
            System.out.println("The scores haven't changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }

        if ((userentry1.equalsIgnoreCase(bonusoptions[0])) && computer.equals(bonusoptions[1])) {
            System.out.println("You did " + bonusoptions[0] + " and the computer did " + bonusoptions[1]);
            cscore = cscore + 2;
            uscore = uscore -3;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }
        if ((userentry1.equalsIgnoreCase(bonusoptions[0])) && computer.equals(bonusoptions[2])) {
            System.out.println("You did " + bonusoptions[0] + " and the computer did " + bonusoptions[2]);
            uscore = uscore + 3;
            cscore = cscore - 1;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }
        if ((userentry1.equalsIgnoreCase(bonusoptions[1])) && computer.equals(bonusoptions[2])) {
            System.out.println("You did " + bonusoptions[1] + " and the computer did " + bonusoptions[2]);
            cscore = cscore + 1;
            uscore = uscore -2;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }
        if ((userentry1.equalsIgnoreCase(bonusoptions[1])) && computer.equals(bonusoptions[0])) {
            System.out.println("You did " + bonusoptions[1] + " and the computer did " + bonusoptions[0]);
            uscore = uscore + 2;
            cscore = cscore -3;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }
        if ((userentry1.equalsIgnoreCase(bonusoptions[2])) && computer.equals(bonusoptions[0])) {
            System.out.println("You did " + bonusoptions[2] + " and the computer did " + bonusoptions[0]);
            cscore = cscore + 3;
            uscore = uscore - 1;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }
        if ((userentry1.equalsIgnoreCase(bonusoptions[2])) && computer.equals(bonusoptions[1])) {
            System.out.println("You did " + bonusoptions[2] + " and the computer did " + bonusoptions[1]);
            cscore = cscore - 2;
            uscore = uscore +1;
            System.out.println("The scores have changed. Your score: " + uscore + ". The computer's score: " + cscore);

        }}
         if ((!userentry1.equals(bonusoptions[0]))&&(!userentry1.equals(bonusoptions[1]))&&(!userentry1.equals(bonusoptions[2]))){
               System.out.println ("INVALID ANSWER");
            }

        if (uscore > cscore) {
            System.out.println("Congratulations you won! The score was:");
            System.out.println("You scored: " + uscore + " The computer scored: " + cscore);
        }

        if (cscore > uscore) {
            System.out.println("Sorry, you lost to the computer. The score was:");
            System.out.println("You scored: " + uscore + " The computer scored: " + cscore);
        }

    }

}
