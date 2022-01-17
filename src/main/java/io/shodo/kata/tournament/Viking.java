package io.shodo.kata.tournament;

public class Viking extends Warrior<Viking> {
    @Override
    protected int initialHitPoints() {
        return 120;
    }

    @Override
    protected Weapon weapon() {
        return new OneHandAxe();
    }
}
