package io.shodo.kata.tournament;

public final class ArmorEquipment implements Equipment {

    @Override
    public boolean canCancelDmg(final int turn, final Weapon attackerWeapon) {
        return false;
    }

    @Override
    public int reduceReceivedDamaged() {
        return 3;
    }

    @Override
    public int reduceDeliveredDamage() {
        return 1;
    }

    @Override
    public String toString() {
        return "ArmorEquipment{}";
    }
}
