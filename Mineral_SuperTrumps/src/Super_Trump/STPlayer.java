package Super_Trump;

import java.util.ArrayList;
/**
 * Created by Jacob Negri on 25/09/2016.
 */
public class STPlayer {
    private ArrayList<STCard> cards;

    private String playerId;

    public STPlayer(String playerId) {
        this.playerId = playerId;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public String toString() {
        return "Player Id =" + playerId + "\n cards = " + cards;
    }

    public ArrayList<STCard> playersHand(){
        return cards;
    }

    public ArrayList<STCard> getCards() {
        return cards;
    }
}
