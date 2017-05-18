import java.util.ArrayList;

/**
 * Created by User on 18.05.2017.
 */
public class Card {
    public String suit;
    public String kind;
    //todo Добавьте необходимые конструктуры и/или методы, чтобы можно было создать карту с указанием его масти и достоинства
    public Card(String suit, String kind){
        ArrayList<String> suits = new ArrayList();
        suits.add("DIAMONDS");
        suits.add("CLUBS");
        suits.add("HEARTS");
        suits.add("SPADES");
        ArrayList<String> powers = new ArrayList();
        powers.add("2");
        powers.add("3");
        powers.add("4");
        powers.add("5");
        powers.add("6");
        powers.add("7");
        powers.add("8");
        powers.add("9");
        powers.add("10");
        powers.add("JACK");
        powers.add("QUEEN");
        powers.add("KING");
        powers.add("ACE");
        if (suits.contains(suit.toUpperCase()) & powers.contains(kind.toUpperCase())) {
            this.suit = suit;
            this.kind = kind;
        } else System.out.print("Invalid card!");
    }
}
