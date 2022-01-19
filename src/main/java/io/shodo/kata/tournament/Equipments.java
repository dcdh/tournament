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

    public boolean canCancelDmg(int turn, Weapon opponentWeapon) {
        return equipments.stream()
                .map(equipment -> equipment.canCancelDmg(turn, opponentWeapon))
                .reduce(Boolean.FALSE, Boolean::logicalOr);
    }

    @Override
    public String toString() {
        return "Equipments{" +
                "equipments=" + equipments +
                '}';
    }
}
