package io.shodo.kata.tournament;

public final class BucklerEquipment implements Equipment {

    private boolean isDestroyed = false;

    @Override
    public boolean canCancelDmg(final int turn, final Weapon opponentWeapon) {
        isDestroyed = canDestroyBuckler(opponentWeapon) && hasReachedTurnToBeDestroyed(turn);
        return !isDestroyed && canCancelDmgForThisTurn(turn);
    }

    private boolean hasReachedTurnToBeDestroyed(final int turn) {
        return turn > 4;
    }

    private boolean canDestroyBuckler(final Weapon opponentWeapon) {
        return opponentWeapon.isAnAxe();
    }

    private boolean canCancelDmgForThisTurn(final int turn) {
        return turn % 2 == 0;
    }

    @Override
    public String toString() {
        return "BucklerEquipment{" +
                "isDestroyed=" + isDestroyed +
                '}';
    }
}
