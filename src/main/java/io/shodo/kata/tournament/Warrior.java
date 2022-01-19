package io.shodo.kata.tournament;

public abstract class Warrior<T extends Warrior<T>> {

    private HitPoints hitPoints = initialHitPoints();

    private Equipments equipments = new Equipments();

    public Warrior() {}

    public Warrior(final String skill) {
        throw new RuntimeException("TODO");
    }

    void engage(final Warrior<?> opponent) {
        int turn = 0;
        while (true) {
            this.blow(turn, opponent);
            if (opponent.isDead()) {
                return;
            }
            opponent.blow(turn, this);
            if (this.isDead()) {
                return;
            }
            turn = turn + 1;
        }
    }

    public int hitPoints() {
        return hitPoints.getHitPoints();
    }

    public T equip(final String equipment) {
        equipments.equip(equipment);
        return (T) this;
    }

    protected abstract HitPoints initialHitPoints();

    protected abstract Weapon weapon();

    private void blow(final int turn, final Warrior<?> opponent) {
        opponent.takeDmg(turn, this);
    }

    public boolean isDead() {
        return hitPoints.isDead();
    }

    private void takeDmg(final int turn, final Warrior<?> from) {
        final boolean canCancelDmg = equipments.canCancelDmg(turn, from.weapon());
        System.out.println(String.format("Before taking dmg %s", this.toString()));
        if (!canCancelDmg) {
            this.hitPoints = this.hitPoints.takeDmg(from.weapon());
            System.out.println(String.format("After taking dmg %s", this.toString()));
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "hitPoints=" + hitPoints +
                ", equipments=" + equipments +
                '}';
    }
}
