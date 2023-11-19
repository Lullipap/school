package pinoyhenyo;
import java.util.Scanner;

class Node {
    String data;
    Node yes;
    Node no;

    Node(String data) {
        this.data = data;
        this.yes = null;
        this.no = null;
    }
}

public class Pinoy_Henyo {
    private static Node root;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\033[0;37m";

    public static void main(String[] args) {
        initializeTree();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println(ANSI_CYAN + "Welcome to CCDATRCL Pinoy Henyo - CODE SIDE MAFIA!" + ANSI_RESET);
            System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------" + ANSI_RESET);
            System.out.println("[1] Computer vs. Player");
            System.out.println("[2] Player 1 vs. Player 2");
            System.out.println("[3] Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (confirmReady(scanner)) {
                        computerVsPlayer(scanner);
                    } else {
                        System.out.println("Returning to the menu.");
                    }
                    break;
                case 2:
                    player1VsPlayer2(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 3);
    }

    private static void initializeTree() {
        
        //Branch for an animal
        root = new Node("Computer: Is it an animal?");
        
        root.yes = new Node("Computer: Can it Fly?");
        root.yes.yes = new Node("Computer: Its a Bird");
        root.yes.yes.no = new Node("Computer: Its a Bat");
        root.yes.yes.no.no = new Node("Computer: Its an Insect");
        
        root.yes.no = new Node("Computer: Does it have a tail?");
        root.yes.no.yes = new Node("Computer: Does it squeak?");
        root.yes.no.yes.yes = new Node("Computer: Its a Mouse");
        root.yes.no.yes.yes.no = new Node("Computer: Its a Hamster");
        root.yes.no.yes.yes.no.no = new Node("Computer: Its a Chinchilla");
        
        root.yes.no.no = new Node("Computer: Does it have fangs?");
        root.yes.no.no.yes = new Node("Computer: Its a Spider");
        
        root.yes.no.no.no = new Node("Computer: Does it Roar?");
        root.yes.no.no.no.yes = new Node("Computer: Its a Lion");
        root.yes.no.no.no.yes.no = new Node("Computer: Its a Tiger");
        
        root.yes.no.yes.no = new Node("Computer: Does it belong in a Farm?");
        root.yes.no.yes.no.yes = new Node("Computer: Its a Sheep");
        root.yes.no.yes.no.yes.no = new Node("Computer: Its a Cow");
        root.yes.no.yes.no.yes.no.no = new Node("Computer: Its a Chicken");
        
        root.yes.no.yes.no = new Node("Computer: Does it howl?");
        root.yes.no.yes.no.yes = new Node("Computer: Its a Wolf");
        root.yes.no.yes.no.yes.no = new Node("Computer: Its a Dog");
        
        //Branch for vehicles
        root.no = new Node("Computer: Does it have Wheels?");
        
        root.no.yes = new Node("Computer: Can it Fly?");
        root.no.yes.yes = new Node("Computer: Its a Plane");
        root.no.yes.no = new Node("Computer: Its a Car");
        
        root.no.yes.no.no = new Node("Computer: Its a Bicycle");
        root.no.yes.no.no.no = new Node("Computer: Its Roller skates");
        root.no.yes.no.no.no.no = new Node("Computer: Its a Skateboard");
        
        //Branch for boat
        root.no.no = new Node("Computer: Does it float in water?");
        root.no.no.yes = new Node("Computer: Its a Boat");
        
        //Branch for item
        root.no.no.no = new Node("Computer: Do you carry it?");
    
        root.no.no.no.yes = new Node("Computer: Its a Phone");
        root.no.no.no.yes.no = new Node("Computer: Its a Bag");
        
        root.no.no.no.no = new Node("Computer: Its a Desktop ");
        root.no.no.no.no.no = new Node("Computer: Its a Lightbulb");
        root.no.no.no.no.no.no = new Node("Computer: Its a Television");
        
        
        
    }

    private static boolean confirmReady(Scanner scanner) {
        System.out.println("Computer: Think of an object, and I will try to guess it in 7 questions or fewer. The Higher the score the better. Are you ready? [Y/N]");
        String userResponse = scanner.next().toUpperCase();
        return userResponse.equals("Y");
    }

    private static void computerVsPlayer(Scanner scanner) {
        Node currentNode = root;
        int questionsAsked = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println(currentNode.data);
            System.out.print("Enter 'yes' or 'no': ");
            String userResponse = scanner.next().toLowerCase();

            questionsAsked++;

            if (userResponse.equals("yes")) {
                if (currentNode.yes != null) {
                    currentNode = currentNode.yes;
                } else {
                    System.out.println(ANSI_RED + "I guessed it in " + questionsAsked + " questions! Your score: " + questionsAsked + ANSI_RESET);
                    return;
                }
            } else if (userResponse.equals("no")) {
                if (currentNode.no != null) {
                    currentNode = currentNode.no;
                } else {
                    System.out.println(ANSI_GREEN + "I give up! Your score: 10" + ANSI_RESET);
                    return;
                }
            } else {
                System.out.println(ANSI_RED + "Invalid input. Please enter 'yes' or 'no'." + ANSI_RESET);
                i--;
            }
        }

        System.out.println(ANSI_GREEN + "I couldn't guess it in 7 questions. Your score: 7" + ANSI_RESET);
    }

    private static void player1VsPlayer2(Scanner scanner) {
        // Display game instructions for player vs. player mode
        System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Instructions:" + ANSI_RESET);
        System.out.println("Player 2, think of an item but do not reveal it.");
        System.out.println("Player 2, type 'quit' or 'q' if Player 1 guesses the item correctly.");
        System.out.println("Player 1, you have 10 questions to guess what Player 2 is thinking.");
        System.out.println(ANSI_WHITE + "--------------------------------------------------------------------------------" + ANSI_RESET);

        // Set the maximum number of guesses and initialize the game state
        int guessLimit = 10;
        int guessesTaken = 0;
        boolean guessedCorrectly = false;

        // Loop to allow Player 1 to make guesses until the limit is reached or the correct guess is made
        while (guessesTaken < guessLimit && !guessedCorrectly) {
            // Prompt Player 1 to ask a question
            System.out.print(ANSI_CYAN + "Player 1, ask your question (" + (guessLimit - guessesTaken) + " guesses left): " + ANSI_RESET);
            String question = scanner.nextLine().trim();

            // Allow Player 1 to give up by typing 'quit' or 'q'
            if ("quit".equalsIgnoreCase(question) || "q".equalsIgnoreCase(question)) {
                System.out.println(ANSI_GREEN + "Player 1 has given up. Player 2 wins!" + ANSI_RESET);
                break;
            }

            // Ensure Player 1 asks a question
            if (question.isEmpty()) {
                System.out.println(ANSI_RED + "You did not ask a valid question." + ANSI_RESET);
                continue; // Skip to the next iteration without counting this as a guess
            }

            // Wait for a valid response from Player 2
            boolean validResponse = false;
            while (!validResponse) {
                // Prompt Player 2 for an answer
                System.out.print("Player 2, please answer 'yes', 'no', or type 'quit'/'q' if the guess is correct: ");
                String response = scanner.nextLine().trim().toLowerCase();

                // Validate Player 2's response
                if (response.isEmpty()) {
                    System.out.println(ANSI_RED + "Invalid input. You must answer the question." + ANSI_RESET);
                } else if (response.matches("yes|no|quit|q")) {
                    // Correctly formatted responseS
                    validResponse = true;

                    // Check if Player 1's guess is correct
                    if ("quit".equals(response) || "q".equals(response)) {
                        System.out.println(ANSI_GREEN + "Player 1 guessed correctly! Player 1 wins!" + ANSI_RESET);
                        guessedCorrectly = true;
                    }
                } else {
                    // Response was not 'yes', 'no', 'quit', or 'q'
                    System.out.println(ANSI_RED + "Invalid response. Please answer 'yes', 'no', or type 'quit'/'q' if the guess is correct." + ANSI_RESET);
                }
            }

            // Increment the guess count after a valid interaction
            if (!guessedCorrectly) {
                guessesTaken++;
            }
        }

        // Check if the guess limit was reached without a correct guess
        if (!guessedCorrectly && guessesTaken >= guessLimit) {
            System.out.println(ANSI_RED + "Guess limit reached. Player 2 wins!" + ANSI_RESET);
        }
    }
}
