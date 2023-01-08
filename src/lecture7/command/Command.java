package lecture7.command;

import lecture5.flyweight.Card;

import java.util.Optional;

/**
 * Represents an abstract command in the Command design pattern.
 */
public interface Command
{
    Optional<Card> execute();
    void undo();
}