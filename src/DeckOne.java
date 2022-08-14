import java.util.ArrayList;
import java.util.List;

public class DeckOne {

    List<Cards> deckOne = new ArrayList<>();
    Cards card = new Cards();
    Cards card1 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card2 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card3 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card4 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card5 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card6 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card7 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card8 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card9 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());
    Cards card10 = new Cards(card.generateValue(), card.generateColor(), card.generateScarcity());

    public List<Cards> getDeckOne() {
        deckOne.add(card1);
        deckOne.add(card2);
        deckOne.add(card3);
        deckOne.add(card4);
        deckOne.add(card5);
        deckOne.add(card6);
        deckOne.add(card7);
        deckOne.add(card8);
        deckOne.add(card9);
        deckOne.add(card10);
        return deckOne;
    }
}
