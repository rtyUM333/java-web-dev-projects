package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);}

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void textInsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}

    @Test
    public void StartsWithTextReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}

    @Test
    public void StartsWithBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}

    @Test
    public void MultipleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));}

    @Test
    public void nestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));}

    @Test
    public void noRightBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}

    @Test
    public void mismatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}

    @Test
    public void imbalanceBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}

    @Test
    public void missingOneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));}

    @Test
    public void startWithMismatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));}

    @Test
    public void endsWithMismatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]["));}
}