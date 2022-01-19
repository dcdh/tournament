package io.shodo.kata.tournament;

public final class OneHandAxe implements Weapon {

    @Override
    public boolean isAnAxe() {
        return true;
    }

    @Override
    public int dmg(final int turn) {
        return 6;
    }
}
