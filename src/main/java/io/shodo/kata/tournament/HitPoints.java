package io.shodo.kata.tournament;

import java.util.Objects;

public final class HitPoints {

    private final int hitPoints;

    public HitPoints(final int hitPoints) {
        this.hitPoints = hitPoints;
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
