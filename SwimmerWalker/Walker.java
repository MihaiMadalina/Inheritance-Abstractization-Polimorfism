package SwimmerWalker;

import SwimmerWalker.Breath;
import SwimmerWalker.Walk;

public class Walker implements Walk, Breath {

    @Override
    public void walk() {
        System.out.println("SwimmerWalker.Walk faster.");
    }

    @Override
    public void breath() {
        System.out.println("Just breath.");
    }
}
