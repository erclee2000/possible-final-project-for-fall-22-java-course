In this project you will use the programming skills from the course to create a game. 

Here are the steps:

1. Open the file HighLowGame.java and go to the method printInstrutions() to make sure you understand how the game is played

2. Open the file CardDeck.java. You will not have to change anything in this file. But there are a few things to make note of:
    * there is a class called Card and a class called CardDeck
    * Card has a toString() method that allows you to do this System.out.println(my_card) and a card will be printed to the terminal
    * CardDeck has a pickCardatRandom() method that, as the name indicates, will draw a card at random from the deck.

3. Compile and run HighLowGame.java
    * you should see the instructions printed to the screen

4. The game starts with a card drawn at random and printing that card to the screen
    * create a Card object called "currentCard" (this is similar to creating a variable)
    * assign your currentCard a value by using the pickCardatRandom() method of the "deck" object
    * print currentCard to the screen 
    * compile run test -- you should see currentCard printed to the terminal

5. Now prompt the user to enter 'h' or 'l' for their guess of the next card and store the user input
    * use myscanner.next() -- this will return you a String with the user's input ("h" or "l")
    * you will have to store what myscanner.next() returns in a String variable that you create (e.g., userSelection)
    * compile run test -- to test, print out to the terminal what your String variable contains 

6. Now draw another card at random and print it to the screen
    * create a Card object called "nextCard"
    * assign nextCard a value by using the pickCardatRandom() method of the "deck" object
    * print nextCard to the screen
    * compile run test -- you should see both the currentCard and the nextCard printed to the terminal

7. Now, using conditionals, check if the user's guess was correct
    * each Card object, including currentCard and nextCard that you created, has member varible called "value"
    * a Card's value is 1 (low) to 52 (high)
        * if you want the value of a Card to be printed for debugging purposes, you can remove the comment from the toString() method of the Card class.
    * if the user guessed "h" and your nextCard's value is greater than currentCard's value, then the guess was correct
    * if the user guess "l" and your nextCard's value is lower than currentCard's value, then the guess was also correct
    * otherwise, the user's guess was not correct
    * write the appropriate if-else statement and then print to the screen 
            "You guessed right!"
            or
            "You guess wrong. Game over."

8. If the user guessed right, they get to keep playing. So you'll now need to create a loop that repeats 5, 6, and 7 above
    * your loop terminates with a wrong guess; so you'll want to create a boolean guessedCorrect
    * you can use a do-while loop; the check in the while() part is if guessedCorrect == true
    * you will have to update currentCard with last card shown--this is similar to how you updated prev1 and prev2 in the fibonacci exercises

9. If you've reached this point, you've completed the main parts of the game! But no game is complete with a score.
    * create an int to keep track of the number of times the user has guessed correctly
    * increment this counter in the right place in you code
    * compile and test -- print out your counter and play a few rounds to make sure it is working properly
    * once your counter works, now you're ready to keep track of a score
    * the user earns double points for each correct guess
        * 1 correct guess the score should be 1
        * 2 correct guesses the score should be 2
        * 3 correct guesses the score should be 4
        * 4 correct guesses the score should be 8
        * and so on
    * create a variable to keep track of score; update the score in the right place in your code
        * hint: score is computed using your counter for the number of correct guesses
    * complie and test -- print out your score and play a few rounds to make sure it is working properly

10. After the last step, we have a fully functioning game. But what if the user accidently types something other than an "h" or "l"? Suppose the user accidently types "j" and hits enter. We do not want our game to break--instead we want to again prompt the user to enter an "h" or "l"
    * create a loop that keeps asking the user to enter an "h" or "l" if the user accidently enters an invalid input