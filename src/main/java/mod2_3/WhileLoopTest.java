package mod2_3;

import java.util.Random;

public class WhileLoopTest {

    public static void main(String[] args) {
        boolean loggedIn = false;
        int tryCounter = 0;
        Random randomGenerator = new Random();
        while(!loggedIn) {
            tryCounter++;
            if(randomGenerator.nextInt(100) > 90) {
                loggedIn = true;
                System.out.println("Zalogowano po " + tryCounter + " próbach");
            }
        }
        System.out.println("Zakończono próby logowania");
    }
}
