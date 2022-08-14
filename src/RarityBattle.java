import java.util.List;

public class RarityBattle {
    DeckOne deckOne = new DeckOne();
    DeckTwo deckTwo = new DeckTwo();

    public void gerRarityBattle() throws InterruptedException {
        List<Cards> deck1 = deckOne.getDeckOne();
        List<Cards> deck2 = deckTwo.getDeckTwo();
        int rareDeck1 = 0;
        int rareDeck2 = 0;
        for (int i = 0; i < deck1.size(); i++) {
            if (deck1.get(i).isScarcity()) {
                rareDeck1++;
            }
            if (deck2.get(i).isScarcity()) {
                rareDeck2++;
            }

            System.out.println("Card from deck one is rare? " + deck1.get(i).isScarcity() + " Card from deck two is rare? "
                    + deck2.get(i).isScarcity());
            Thread.sleep(1000);
        }
        if (rareDeck1 > rareDeck2) {
            System.out.println("\nMore rare card has: Deck one. The score is: " + rareDeck1 + "-" + rareDeck2);
        } else if (rareDeck2 > rareDeck1) {
            System.out.println("\nMore rare card has: Deck two. The score is: " + rareDeck1 + "-" + rareDeck2);
        } else {
            System.out.println("Its a draw The score is: " + rareDeck1 + "-" + rareDeck2);
        }
    }
}
