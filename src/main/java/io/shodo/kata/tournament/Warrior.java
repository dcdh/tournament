package io.shodo.kata.tournament;

public abstract class Warrior<T extends Warrior<T>> {

    private HitPoints hitPoints = initialHitPoints();

    public Warrior() {}

    public Warrior(final String skill) {
        throw new RuntimeException("TODO");
    }

    void engage(final Warrior<?> opponent) {
        while (true) {
            this.blow(opponent);
            if (opponent.isDead()) {
                return;
            }
            opponent.blow(this);
            if (this.isDead()) {
                return;
            }
        }
    }

    public int hitPoints() {
        return hitPoints.getHitPoints();
    }

    public T equip(final String equipment) {
        return (T) this;
    }

    protected abstract HitPoints initialHitPoints();

    protected abstract Weapon weapon();

    public void blow(final Warrior<?> opponent) {
        opponent.takeDmg(this);
    }

    public boolean isDead() {
        return hitPoints.isDead();
    }

    private void takeDmg(final Warrior<?> from) {
        this.hitPoints = this.hitPoints.takeDmg(from.weapon());
    }

}
