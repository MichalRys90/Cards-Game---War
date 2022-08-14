import java.util.ArrayList;
import java.util.List;

public class DeckTwo {

    List<Cards> deckTwo = new ArrayList<>();
    Cards cards = new Cards();
    Cards card1 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card2 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card3 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card4 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card5 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card6 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card7 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card8 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card9 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());
    Cards card10 = new Cards(cards.generateValue(), cards.generateColor(), cards.generateScarcity());

    public List<Cards> getDeckTwo() {
        deckTwo.add(card1);
        deckTwo.add(card2);
        deckTwo.add(card3);
        deckTwo.add(card4);
        deckTwo.add(card5);
        deckTwo.add(card6);
        deckTwo.add(card7);
        deckTwo.add(card8);
        deckTwo.add(card9);
        deckTwo.add(card10);

        return deckTwo;
    }
}
