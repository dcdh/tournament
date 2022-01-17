package io.shodo.kata.tournament;

public class Unequipped implements Equipment {
    @Override
    public boolean canCancelDmg(final int turn, final Weapon opponentWeapon) {
        return false;
    }

    @Override
    public String toString() {
        return "Unequipped{}";
    }
}
