package mooc.java3.poker_demo;

import java.util.*;

/**
 * Created by juno on 15-6-15.
 */
public class OnePoker {
    private String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int curIndex = 0;
    private List<Card> pokerCards;

    public OnePoker(){
        pokerCards = new ArrayList<Card>();
        for(int i = 0; i<cardNum.length; i++){
            pokerCards.add(new Card(CardType.SPADE, cardNum[i]));
        }
        for(int i = 0; i<cardNum.length; i++){
            pokerCards.add(new Card(CardType.HEART, cardNum[i]));
        }
        for(int i = 0; i<cardNum.length; i++){
            pokerCards.add(new Card(CardType.CLUB, cardNum[i]));
        }
        for(int i = 0; i<cardNum.length; i++){
            pokerCards.add(new Card(CardType.DIAMOND, cardNum[i]));
        }
    }

    public int getPokerSize(){
        return pokerCards.size();
    }

    public void shuffleCard(){
        Collections.shuffle(pokerCards);
    }

    public void showPokers(){
        System.out.println("扑克牌卡片有：");
        for (Card card: pokerCards){
            System.out.print(""+card.getCardType()+card.getNumber()+",");
        }
        System.out.println("");
    }

    public Card distribute(){
        Card card = pokerCards.get(curIndex);
        pokerCards.remove(card);
        curIndex += 1;
        return card;
    }

}
