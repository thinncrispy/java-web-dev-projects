package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void balancedBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void balancedBracketsWithinOtherCharacters() {
        String message = "balanced brackets within other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void emptyStringHasBalancedBrackets() {
        String message = "empty strings return true for balanced brackets";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void multipleSetsOfBrackets() {
        String message = "multiple sets of brackets return true for balanced brackets";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    // Negative Test Cases

    @Test
    public void openingBracketOnly() {
        String message = "Only an opening bracket returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void outOfOrderBrackets() {
        String message = "brackets that are out of order return false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void onlyOpenBracket() {
        String message = "a string containing a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void onlyBackwardsBrackets() {
        String message = "a string containing only backwards brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void onlyText() {
        String message = "a string containing no brackets returns false";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
}