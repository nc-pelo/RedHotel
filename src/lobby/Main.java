package lobby;

import javax.swing.*;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        // JOptionPane.showConfirmDialog(null, "Hello from me");

        String answer = "";
        answer = JOptionPane.showInputDialog("Guess a number!");
        int answeri = Integer.parseInt(answer);
        System.out.println(answeri);

        Random generator;
        generator = new Random();

        System.out.println(generator.nextInt(100));
        // JOptionPane.showMessageDialog(null , "Remember the birds!");

        //JOptionPane.showConfirmDialog(null, "Hello from me");
        /*
        int age = 18;
        while (age > 20)
        {
            System.out.println("Det virker!");
        }


        do {

        }
        while (age > 20 || false);

        */

    }

}
