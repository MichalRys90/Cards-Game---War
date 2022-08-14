import java.util.List;

public class ColorBattle {

    DeckOne deckOne = new DeckOne();
    DeckTwo deckTwo = new DeckTwo();

    public void getColorBattle() throws InterruptedException {
        List<Cards> deck1 = deckOne.getDeckOne();
        List<Cards> deck2 = deckTwo.getDeckTwo();
        int sumDeck1 = 0;
        int sumDeck2 = 0;

        for (int i = 0; i < deck1.size(); i++) {
            sumDeck1 += deck1.get(i).getColor();
            sumDeck2 += deck2.get(i).getColor();
            System.out.println("Card " + (i + 1) + " from deck one color is: " + deck1.get(i).getColor()
                    + " Card " + (i + 1) + " from deck Two color is: " + deck2.get(i).getColor()
                    + " The current score is: " + sumDeck1 + "-" + sumDeck2);
            Thread.sleep(1000);
        }
        if (sumDeck1 > sumDeck2) {
            System.out.println("\nWinner Deck is Deck One !!!\n\n");
        } else if (sumDeck1 < sumDeck2) {
            System.out.println("\nWinner deck is Deck Two !!!\n\n");
        } else {
            System.out.println("\nIts a draw!!\n\n");

        }
    }
}
