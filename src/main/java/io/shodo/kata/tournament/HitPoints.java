package io.shodo.kata.tournament;

import java.util.Objects;

public final class HitPoints {

    private final int hitPoints;

    public HitPoints(final int hitPoints) {
        this.hitPoints = Math.max(hitPoints, 0);
    }

    public HitPoints takeDmg(final Weapon weapon) {
        return new HitPoints(this.hitPoints - weapon.dmg());
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
}
