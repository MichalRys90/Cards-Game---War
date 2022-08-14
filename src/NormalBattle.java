import java.util.List;

public class NormalBattle {
    DeckOne deckOne = new DeckOne();
    DeckTwo deckTwo = new DeckTwo();

    public void getValuesFromDecks() throws InterruptedException {
        List<Cards> deck1 = deckOne.getDeckOne();
        List<Cards> deck2 = deckTwo.getDeckTwo();

        while ((deck1.size() > 0) && (deck2.size() > 0)) {
            System.out.println("Deck one choose: " + deck1.get(0).getValue() + " Deck two choose " + deck2.get(0).getValue());
            if (deck1.get(0).getValue() > deck2.get(0).getValue()) {
                deck2.remove(0);
            } else if (deck1.get(0).getValue() < deck2.get(0).getValue()) {
                deck1.remove(0);
            } else {
                deck1.remove(0);
                deck2.remove(0);
            }
            Thread.sleep(1000);
        }

        if (deck1.size() > deck2.size()) {
            System.out.println("\nThe winner is deck1, there is still " + deck1.size() + " cards\n\n");
        } else if (deck2.size() > deck1.size()) {
            System.out.println("\nThe winner is deck2, there is still " + deck2.size() + " cards\n\n");
        } else {
            System.out.println("\nIts a Draw!!\n\n");
        }
    }
}
