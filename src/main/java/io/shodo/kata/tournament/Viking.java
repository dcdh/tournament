package io.shodo.kata.tournament;

public class Viking extends Warrior<Viking> {
    @Override
    protected HitPoints initialHitPoints() {
        return new HitPoints(120);
    }

    @Override
    protected Weapon weapon() {
        return new OneHandAxe();
    }
}
