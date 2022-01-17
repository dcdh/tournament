package io.shodo.kata.tournament;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BucklerEquipmentTest {

    @ParameterizedTest
    @CsvSource({"0,true", "1,false", "2,true", "3,false", "4,true", "5,false", "6,true"})
    public void should_cancel_dmg_or_not_when_weapon_is_sword(final int givenTurn, final boolean expectedCancel) {
        assertThat(new BucklerEquipment().canCancelDmg(givenTurn, new OneHandSword())).isEqualTo(expectedCancel);
    }

    @ParameterizedTest
    @CsvSource({"0,true", "1,false", "2,true", "3,false", "4,true", "5,false", "6,false"})
    public void should_cancel_dmg_or_not_when_weapon_is_axe(final int givenTurn, final boolean expectedCancel) {
        assertThat(new BucklerEquipment().canCancelDmg(givenTurn, new OneHandAxe())).isEqualTo(expectedCancel);
    }

}
