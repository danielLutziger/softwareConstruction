package lecture7.Prototype;

import lecture7.cloneable.Deck;
import lecture7.cloneable.CardSource;

// Prototype Pattern
public class CardSourceManager
{
    private CardSource aPrototype = new Deck(); // Default

    public void setPrototype(CardSource pPrototype)
    {
        aPrototype = pPrototype;
    }

    public CardSource createCardSource()
    {
        return aPrototype.clone();
    }
}
