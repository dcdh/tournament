package io.shodo.kata.tournament;

import java.util.Objects;

public final class HitPoints {

    private final int hitPoints;

    public HitPoints(final int hitPoints) {
        this.hitPoints = Math.max(hitPoints, 0);
    }

    public HitPoints takeDmg(final int turn,
                             final Weapon attackerWeapon,
                             final Equipments attackerEquipments,
                             final Equipments equipments) {
        final int dmg = attackerWeapon.dmg(turn) - attackerEquipments.reduceDeliveredDamage() - equipments.reduceReceivedDamaged();
        if (dmg <= 0) {
            return this;
        }
        return new HitPoints(this.hitPoints - dmg);
    }

    public boolean isDead() {
        return hitPoints == 0;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof HitPoints)) return false;
        final HitPoints hitPoints1 = (HitPoints) o;
        return hitPoints == hitPoints1.hitPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hitPoints);
    }

    @Override
    public String toString() {
        return "HitPoints{" +
                "hitPoints=" + hitPoints +
                '}';
    }
}
