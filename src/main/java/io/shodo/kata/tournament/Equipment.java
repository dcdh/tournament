package io.shodo.kata.tournament;

public interface Equipment {

    boolean canCancelDmg(int turn, Weapon attackerWeapon);

    int reduceReceivedDamaged();

    int reduceDeliveredDamage();

}
