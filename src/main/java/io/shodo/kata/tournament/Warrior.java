package io.shodo.kata.tournament;

public abstract class Warrior<T extends Warrior<T>> {

    public Warrior() {}

    public Warrior(final String skill) {
        throw new RuntimeException("TODO");
    }

    void engage(final Warrior warrior) {
        throw new RuntimeException("TODO");
    }

    public int hitPoints() {
        throw new RuntimeException("TODO");
    }

    public T equip(String equipment) {
        return (T) this;
    }

    protected abstract int initialHitPoints();

    protected abstract Weapon weapon();

}
