package io.shodo.kata.tournament;

public class Highlander extends Warrior<Highlander> {

    public Highlander() {}

    public Highlander(final String skill) {
        super(skill);
    }

    @Override
    protected int initialHitPoints() {
        throw new RuntimeException("TODO");
    }

    @Override
    protected Weapon weapon() {
        throw new RuntimeException("TODO");
    }

}
