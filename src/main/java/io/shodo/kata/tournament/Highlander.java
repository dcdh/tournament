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
        return new GreatSword();
    }

    @Override
    public String toString() {
        return "Highlander{} " + super.toString();
    }
}
