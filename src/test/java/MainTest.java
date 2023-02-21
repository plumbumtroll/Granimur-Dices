package test.java;

import main.java.Main;
import main.java.Models.Combination;
import main.java.Models.CombinationType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void defineCombinationTest_pair() {

        int[] hand = new int[] { 1, 2, 3, 1, 6, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Pair, new int[] { 1 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_doublePair() {

        int[] hand = new int[] { 6, 1, 3, 1, 6, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.DoublePair, new int[] { 6, 1 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_triplePair() {

        int[] hand = new int[] { 6, 1, 3, 1, 3, 6 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.TriplePair, new int[] { 6, 3, 1 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_three() {

        int[] hand = new int[] { 4, 2, 3, 4, 4, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Three, new int[] { 4 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_doubleThree() {

        int[] hand = new int[] { 4, 2, 2, 4, 4, 2 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.DoubleThree, new int[] { 4, 2 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_fullHouse() {

        int[] hand = new int[] { 4, 2, 2, 4, 4, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.FullHouse, new int[] { 4, 2 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_four() {

        int[] hand = new int[] { 4, 2, 5, 4, 4, 4 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Four, new int[] { 4 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_royalHouse() {

        int[] hand = new int[] { 4, 2, 2, 4, 4, 4 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.RoyalHouse, new int[] { 4, 2 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_five() {

        int[] hand = new int[] { 4, 4, 2, 4, 4, 4 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Five, new int[] { 4 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_six() {

        int[] hand = new int[] { 5, 5, 5, 5, 5, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Six, new int[] { 5 } );

        assertCombination(actualCombination, expectedCombination);
    }

    @Test
    public void defineCombinationTest_straight() {

        int[] hand = new int[] { 5, 5, 5, 5, 5, 5 };

        Combination actualCombination = Main.defineCombination(hand);
        Combination expectedCombination = new Combination(CombinationType.Straight, new int[] { } );

        assertCombination(actualCombination, expectedCombination);
    }

    private void assertCombination(Combination actualCombination, Combination expectedCombination) {
        Assert.assertNotNull("Actual combination was null", actualCombination);
        Assert.assertEquals(actualCombination.getType(), expectedCombination.getType());
        Assert.assertArrayEquals("Expected nominals of combination is " + Arrays.toString(expectedCombination.getNominals()) + ", but actual nominals was " + Arrays.toString(actualCombination.getNominals()),
                actualCombination.getNominals(),
                expectedCombination.getNominals());
    }
}