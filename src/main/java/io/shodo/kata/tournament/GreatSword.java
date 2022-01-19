package io.shodo.kata.tournament;

public class GreatSword implements Weapon {
    @Override
    public boolean isAnAxe() {
        return false;
    }

    @Override
    public int dmg(final int turn) {
        if (turn % 3 == 0 || turn % 3 == 1) {
            return 12;
        } else {
            return 0;
        }
    }
}
