package io.shodo.kata.tournament;

import java.util.ArrayList;
import java.util.List;

public final class Equipments {

    private final List<Equipment> equipments = new ArrayList<>();

    public void equip(final String equipment) {
        if ("buckler".equals(equipment)) {
            this.equipments.add(new BucklerEquipment());
        } else if ("armor".equals(equipment)) {
            this.equipments.add(new ArmorEquipment());
        } else {
            throw new IllegalStateException("Unknown equipment");
        }
    }

    public boolean canCancelDmg(int turn, Weapon attackerWeapon) {
        return equipments.stream()
                .map(equipment -> equipment.canCancelDmg(turn, attackerWeapon))
                .reduce(Boolean.FALSE, Boolean::logicalOr);
    }

    public int reduceReceivedDamaged() {
        return equipments.stream()
                .map(Equipment::reduceReceivedDamaged)
                .reduce(0, Integer::sum);
    }

    public int reduceDeliveredDamage() {
        return equipments.stream()
                .map(Equipment::reduceDeliveredDamage)
                .reduce(0, Integer::sum);
    }

    @Override
    public String toString() {
        return "Equipments{" +
                "equipments=" + equipments +
                '}';
    }
}
