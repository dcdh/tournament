package io.shodo.kata.tournament;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class GreatSwordTest {

    @ParameterizedTest
    @CsvSource({"0,12", "1,12", "2,0", "3,12", "4,12", "5,0", "6,12"})
    public void should_return_expected_dmg(final int givenTurn, final int expectedDmg) {
        assertThat(new GreatSword().dmg(givenTurn)).isEqualTo(expectedDmg);
    }

}