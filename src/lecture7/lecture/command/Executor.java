package lecture7.lecture.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// keeps track of all executed commands to roll back again
public class Executor {
    private Stack<Command> commandList = new Stack<Command>();

    public Executor(){}

    public void executeCommand(Command c){
        System.out.println("EXECUTOR EXEC");
        c.execute();
        commandList.push(c);
    }

    public void undoLastCommand(){
        System.out.println("EXECUTOR UNDO");
        Command last = commandList.pop();
        last.undo();
    }
}
