package mooc.java3.poker_demo;

import java.util.Scanner;

/**
 * Created by juno on 15-6-15.
 */
public class Game {
    public static void main(String[] args) throws InvalidPokerGameException {
        System.out.println("-------------创建扑克牌-------------");
        OnePoker poker = new OnePoker();
        System.out.println("-------------扑克牌创建出成功-------------");
        poker.showPokers();
        System.out.println("-------------开始洗牌-------------");
        System.out.println("-------------洗牌结束-------------");
        poker.shuffleCard();

        int playerNum = 2;
        Player[] players = new Player[playerNum];
        players[0] = new Player(1, "TOM");
        players[1] = new Player(2, "JACK");
        /*
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i<playerNum; i++){
            System.out.println("-------------请输入第"+(i+1)+"位玩家的ID和姓名：-------------");
            int id;
            while(true){
                System.out.println("-------------输入ID：-------------");
                try{
                    id = Integer.parseInt(scanner.next());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("ID必须为正整数");
                    continue;
                }
            }
            System.out.println("-------------输入姓名：-------------");
            String name = scanner.next();
            players[i] = new Player(id, name);
        }
        */
        for(int i = 0 ; i<playerNum; i++){
            System.out.println("---欢迎玩家:" + players[i].getName());
        }

        System.out.println("-------------开始发牌-------------");
        for(int i = 0 ; i<playerNum; i=i+2){
            players[i].receiveCards(poker.distribute());
            players[i+1].receiveCards(poker.distribute());
        }
        for(int i = 0 ; i<playerNum; i=i+2){
            players[i].receiveCards(poker.distribute());
            players[i+1].receiveCards(poker.distribute());
        }
        System.out.println("-------------发牌结束-------------");
        System.out.println("-------------开始游戏-------------");
        for(int i = 0 ; i<playerNum; i++){
            players[i].showPeakCard();
        }
        Card c1 = players[0].getPeakCard();
        Card c2 = players[1].getPeakCard();
        if (c1.compareTo(c2) > 0){
            System.out.println(players[0].getName()+"获胜");
        }
        else{
            System.out.println(players[1].getName()+"获胜");
        }
        System.out.println("-------------游戏结束-------------");
        System.out.println("玩家各自手牌为：");
        for(int i = 0 ; i<playerNum; i++){
            players[i].showCard();
        }
    }
}
