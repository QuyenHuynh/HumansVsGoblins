import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        startNewGame();

    }

    public static void startNewGame() {
        Human human = new Human();
        newGameIntroduction(human);

        while (!human.isDead()) {

            //TODO Generate land
            //TODO Display land

            //TODO Ask where to move

//            human.setDead(true);
        }

        askRestart();

    }

    public static void startNewGamePlus() {
        //TODO Player gets to keep items on death
    }

    public static void resetGame() {

    }

    public static void newGameIntroduction(Human human) {

        System.out.println("==========================================");
        System.out.println("     Welcome to Humans vs. Goblins        ");
        System.out.println("==========================================");
        System.out.println();
        askName(human);
        askHowtoPlay(human);
    }

    public static void askName(Human human) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi traveler! What's your name?");
        String name = scan.nextLine();
        while (!Validators.validName) {
            try {
                Validators.validNameCheck(name);
            } catch (CustomException e) {
                name = scan.nextLine();
            }
        }
        human.setName(name);
    }

    public static void askHowtoPlay(Human human) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello " + human.getName() + "!");
        System.out.println("Would you like an explanation of how to play? y/n");
        String input = scan.nextLine().toLowerCase();
        while (!Validators.validHowtoPlay) {
            try {
                Validators.validHowtoPlayCheck(input);
            } catch (CustomException e) {
                input = scan.nextLine();
            }
        }

        if (input.trim().equals("y")) {
            System.out.println("...");
            System.out.println("Goblins have been attacking human settlements all across the land.");
            System.out.println("It's your job to get rid of them!");
            System.out.println("Move by entering 'a', 's', 'w', or 'd'. ");
            System.out.println("When you're adjacent to a goblin, you can choose to attack them!");
            System.out.println("Be careful though! They'll fight back.");
            System.out.println("You can learn the rest as you go along.");
            System.out.println("That's it! Good luck on your journey!");

            //add help command
        } else {
            System.out.println("Great! Good luck on your journey!");
        }
    }

    public static void askRestart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Oh dear! You died!");
        System.out.println("Would you like to play again? y/n");
        String input = scan.nextLine().toLowerCase();
        while (!Validators.validRestart) {
            try {
                Validators.validRestartCheck(input);
            } catch (CustomException e) {
                input = scan.nextLine();
            }
        }

        if (input.trim().equals("y")) {
            startNewGame();
            //WIP New Game Plus
        } else {
            System.out.println("Bye-bye now!");
            System.exit(0);
        }
    }

    public void dropItem() {

        //iterate through weapons list
        for (Weapon weapon : Weapon.weaponsList) {

        }


        //iterate through armors list



        System.out.println("The goblin dropped something!");

        //add it to the inventory if it's not full
        //if no weapon or armor is equipped, automatically equip it.


        //if inventory is full, ask if the players wants to discard an item.

    }

}
