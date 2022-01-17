package io.shodo.kata.tournament;

public class Highlander extends Warrior<Highlander> {

    public Highlander() {}

    public Highlander(final String skill) {
        super(skill);
    }

    @Override
    protected HitPoints initialHitPoints() {
        throw new RuntimeException("TODO");
    }

    @Override
    protected Weapon weapon() {
        throw new RuntimeException("TODO");
    }

}
