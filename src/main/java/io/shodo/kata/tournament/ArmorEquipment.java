package io.shodo.kata.tournament;

public final class ArmorEquipment implements Equipment {

    @Override
    public boolean canCancelDmg(final int turn, final Weapon opponentWeapon) {
        return false;
    }

}
