package mooc.java3.poker_demo;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by juno on 15-6-15.
 */
public class Player {

    private int id;
    private String name;
    private List<Card> cards;

    public String getName() {
        return name;
    }

    public Player(int id, String name){
        this.id = id;
        this.name = name;
        cards = new ArrayList<Card>();
    }

    public void receiveCards(Card card){
        cards.add(card);
    }

    public Card getPeakCard() throws InvalidPokerGameException {
        if (cards.size() == 0){
            throw new InvalidPokerGameException("没有手牌，不能获得最大的牌");
        }
        List<Card> cardList = new ArrayList<Card>(cards);
        Collections.sort(cardList);
        return cardList.get(cardList.size()-1);
    }

    public void showPeakCard() throws InvalidPokerGameException {
        Card c = getPeakCard();
        System.out.println("玩家" + name + "最大的手牌为：" + c.getCardType() + c.getNumber());
    }

    public void showCard(){
        System.out.print("玩家" + name + "手牌：");
        for (Card card: cards){
            System.out.print(""+card.getCardType()+card.getNumber()+",");
        }
        System.out.println("");
    }
}
