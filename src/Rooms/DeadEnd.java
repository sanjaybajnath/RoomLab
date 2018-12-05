package Rooms;

import People.Person;
import Game.Runner;

public class DeadEnd extends Room {
    public DeadEnd (int x, int y){
        super(x,y);
    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("This is a dead end. Go back.");
    }
}
