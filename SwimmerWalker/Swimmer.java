package SwimmerWalker;

import SwimmerWalker.Breath;
import SwimmerWalker.Swim;

public class Swimmer implements Swim, Breath {

    @Override
    public void swim() {
        System.out.println("SwimmerWalker.Swim 100 meters.");
    }

    @Override
    public void breath() {
        System.out.println("SwimmerWalker.Breath normally.");
    }
}
