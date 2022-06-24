import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        startNewGame();

    }

    public static void startNewGame() {

        newGameIntroduction();

    }

    public static void resetGame() {

    }

    public static void newGameIntroduction() {
        Human human = new Human();
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
        } else {
            System.out.println("Great! Good luck on your journey!");
        }
    }

}
