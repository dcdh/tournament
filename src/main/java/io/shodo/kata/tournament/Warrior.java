package io.shodo.kata.tournament;

public abstract class Warrior<T extends Warrior<T>> {

    private HitPoints hitPoints = initialHitPoints();

    private Equipment equipment = new Unequipped();

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
        if ("buckler".equals(equipment)) {
            this.equipment = new BucklerEquipment();
        } else {
            throw new IllegalStateException("Unknown equipment");
        }
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
        final boolean canCancelDmg = equipment.canCancelDmg(turn, from.weapon());
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
                ", equipment=" + equipment +
                '}';
    }
}
