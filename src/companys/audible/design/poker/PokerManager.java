package companys.audible.design.poker;

/**
 * Created by yuboyang on 7/15/17.
 * 扑克游戏需要有初始化和一个洗牌函数
 * http://www.1point3acres.com/bbs/thread-228661-1-1.html
 */
public class PokerManager {
    PokerCard[] cards;
    int dealtIndex;

    PokerManager(boolean isContainsJoker) {
        if (isContainsJoker) cards = new PokerCard[54];
        else cards = new PokerCard[52];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards[index++] = new PokerCard(i, j);
            }
        }

    }

    public void shuffle() {
        dealtIndex = 0;
        // fullfill the list
        for (int i = 0; i < cards.length; i++) {
            int index = (int) (Math.random() * i);
            PokerCard temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    public PokerCard dealCard() {
        if (dealtIndex >= this.cards.length) throw new IllegalStateException("w");
        return this.cards[dealtIndex++];
    }


    public static void main(String[] args) {
        PokerManager pm = new PokerManager(false);
        pm.shuffle();
        for (int i = 0; i < 52; i++) {
            PokerCard card = pm.dealCard();
            System.out.println(card.suit + ", " + card.value);
        }

    }
}
