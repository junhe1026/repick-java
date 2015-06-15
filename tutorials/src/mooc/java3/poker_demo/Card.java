package mooc.java3.poker_demo;

/**
 * Created by juno on 15-6-15.
 */
public class Card implements Comparable<Card> {


    private String cardType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    private String number;

    private int numberWeight;


    public Card(String t, String n){
        this.cardType = t;
        this.number = n;
        if (this.number.equals("J")){
            this.numberWeight = 11;
        }
        else if (this.number.equals("Q")){
            this.numberWeight = 12;
        }
        else if (this.number.equals("K")){
            this.numberWeight = 13;
        }
        else if (this.number.equals("A")){
            this.numberWeight = 14;
        }
        else{
            this.numberWeight = Integer.parseInt(this.number);
        }
    }


    @Override
    public int compareTo(Card card) {
        // 数字比较结果
        int numberCompareResult = this.numberWeight - card.numberWeight;
        if (numberCompareResult == 0){
            // 如果数字相同，比较花色
            return this.getCardTypeOrder() - card.getCardTypeOrder();
        }
        return numberCompareResult;
    }

    private int getCardTypeOrder(){
        if (this.cardType.equals(CardType.SPADE)){
            return 4;
        }
        if (this.cardType.equals(CardType.HEART)){
            return 3;
        }
        if (this.cardType.equals(CardType.CLUB)){
            return 2;
        }
        if (this.cardType.equals(CardType.DIAMOND)){
            return 1;
        }
        return 1;
    }

}
