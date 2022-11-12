import java.util.Scanner;

public class HighLowGameFinal {
    public static void main(String[] args) {
        playGame();
    }

    public static void printInstrutions() {
        System.out.println("***************************************");
        System.out.println("*   Welcome to the High Low Game!     *");
        System.out.println("*   A card will be drawn randomly     *");
        System.out.println("*   from a standard 52 card deck and  *");
        System.out.println("*   you have to try to predict if     *");
        System.out.println("*   the next card drawn at random     *");
        System.out.println("*   will be higher or lower.          *");
        System.out.println("*                                     *");
        System.out.println("*   The card order (low to high):     *");
        System.out.println("*   2 3 . . . 10 J Q K A              *");
        System.out.println("*   and ties are broken by            *");
        System.out.println("*   clubs, diamonds, hearts, spades   *");
        System.out.println("*                                     *");
        System.out.println("*   Enter 'h' for higher              *");
        System.out.println("*   Enter 'l' for lower               *");
        System.out.println("***************************************");
    }

    public static void playGame() {
        CardDeck deck = new CardDeck();
        Card currentCard, nextCard;

        Scanner myscanner = new Scanner(System.in); // use myscanner.next() to get user input
        String userSelection = ""; // store myscanner.next() into this variable
        boolean correctGuess = true; // true so long as user keeps guessing correctly

        int numCorrectGuesses = 0; // number of correct guess by user (used to compute score)
        double score = 0; // score is 2^numCorrectGuesses (score doubles each correct guess)

        printInstrutions();

        // start the game by drawing a card at random and printing it to the terminal
        System.out.println("Drawing a card at random . . . ");
        currentCard = deck.pickCardatRandom();
        System.out.println(currentCard);

        do {
            // get player's guess (checking user input is optional)
            do {
                System.out.println("Will the next randomly drawn card be higher (h) or lower (l)?");
                userSelection = myscanner.next();
            } while (userSelection.compareTo("h") != 0 && userSelection.compareTo("l") != 0);

            // draw next card at random and print it to the terminal
            System.out.println("Drawing a card at random . . . ");
            nextCard = deck.pickCardatRandom();
            System.out.println(nextCard);

            // decide if player guessed correctly
            if ((userSelection.compareTo("h") == 0 && nextCard.value > currentCard.value) ||
                    (userSelection.compareTo("l") == 0 && nextCard.value < currentCard.value)) {
                currentCard = nextCard;
                score = Math.pow(2.0, numCorrectGuesses);
                numCorrectGuesses++;
                System.out.println("You guessed right! Your score is *" + score + "*\n");
            } else {
                System.out.println("Sorry, you guessed wrong. Game over.");
                System.out.println("Your final score was *" + score + "*\n\n");
                correctGuess = false;
            }
        } while (correctGuess);

        myscanner.close();
    }
}
