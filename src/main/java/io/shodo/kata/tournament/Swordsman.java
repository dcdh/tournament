package io.shodo.kata.tournament;

public class Swordsman extends Warrior<Swordsman> {

    public Swordsman() {}

    public Swordsman(final String skill) {
        super(skill);
    }

    @Override
    protected int initialHitPoints() {
        return 100;
    }

    @Override
    protected Weapon weapon() {
        return new OneHandSword();
    }
}
