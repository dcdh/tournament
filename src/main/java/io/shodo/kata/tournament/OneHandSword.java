package io.shodo.kata.tournament;

public final class OneHandSword implements Weapon {

    @Override
    public boolean isAnAxe() {
        return false;
    }

    @Override
    public int dmg(final int turn) {
        return 5;
    }
}
