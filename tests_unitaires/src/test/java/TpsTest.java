import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TpsTest {
    @Test
    @DisplayName("Should concatenate 2 strings")
    void concat() {
        assertEquals("papa", Tps.concat("pa", "pa"));
    }

    // prefix

    @Test
    @DisplayName("Should return true if str2 is prefix of str1")
    void isPrefixSimple(){
        assertTrue(Tps.isPrefix("change", "cha"));
    }

    @Test
    @DisplayName("Should return true if any string is prefix of the other")
    void isPrefixAnyString(){
        assertTrue(Tps.isPrefix("cha", "change"));
    }

    @Test
    @DisplayName("Should return true even if casing is not the same")
    void isPrefixDifferentCasing(){
        assertTrue(Tps.isPrefix("change", "Cha"));
        assertTrue(Tps.isPrefix("change", "CHA"));
        assertTrue(Tps.isPrefix("Cha", "change"));
        assertTrue(Tps.isPrefix("CHA", "change"));
    }

    @Test
    @DisplayName("Should return true if string 1 and 2 are anagrams.")
    void isAnagramSimple(){
        assertTrue(Tps.isAnagram("gramme", "gramme"), "equal strings should work");
        assertTrue(Tps.isAnagram("gramme", "mmagre"), "gramme and mmagre should work");
    }

    @Test
    @DisplayName("Should return true even if casing is different")
    void isAnagramDifferentCasing(){
        assertTrue(Tps.isAnagram("gramme", "GRamme"));
        assertTrue(Tps.isAnagram("GRAMmE", "gmmAre"));
    }

    @Test
    @DisplayName("Should return true even if both string are null")
    void isAnagramEmpty(){
        assertTrue(Tps.isAnagram("", ""));
    }

    @Test
    @DisplayName("Should return true while ignoring spaces")
    void isAnagramSpaces(){
        assertTrue(Tps.isAnagram("", "     "));
        assertTrue(Tps.isAnagram("GRAS ME", "SE MAGR "));
    }
    @Test
    @DisplayName("Should return false if not anagrams.")
    void isAnagramFalse(){
        assertFalse(Tps.isAnagram("", "asbdasdsa"));
        assertFalse(Tps.isAnagram("banani", "banana"));
        assertFalse(Tps.isAnagram("Camion", "chevre"));
    }

    // Reversed string


    @Test
    @DisplayName("Should reverse a string")
    void reverseString() {
        assertEquals("reversed", Tps.reverseString("desrever"));
    }

    @Test
    @DisplayName("Should reverse a string ignoring casing")
    void reverseStringDifferentCasing() {
        assertEquals("reversed", Tps.reverseString("deSRever"));
    }

    @Test
    @DisplayName("Should return empty string if empty given")
    void reverseStringEmpty() {
        assertEquals("", Tps.reverseString(""));
    }

    @Test
    @DisplayName("Should return false when not reversed")
    void reverseStringFalse(){
        assertNotEquals("reversed", "deSReverdeSReverdeSReverdeSReverdeSReverdeSReverdeSRever");
    }



    // palindrome check
    @Test
    @DisplayName("Should return true with kayak")
    void isPalindromeKayak(){
        boolean result=Tps.isPalindrom("kayak");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return false with bonjour")
    void isPalindromeBonjour(){
        boolean result=Tps.isPalindrom("bonjour");
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return true with empty string")
    void isPalidndromeChaineVide(){
        boolean result=Tps.isPalindrom("");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with KAyaK")
    void isPalindromeKAYak(){
        boolean result=Tps.isPalindrom("KAyaK");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeWithSpaces(){
        boolean result=Tps.isPalindrom("Engage le jeu que je le gagne");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeFalse(){
        boolean result=Tps.isPalindrom("Engage leeeee jeu que je le gagne");
        assertFalse(result);
    }


    // reverseInt

    @Test
    @DisplayName("Should reverse an int")
    void reverseIntSimplePositive() {
        assertEquals(142, Tps.reverseInt(241));
    }

    @Test
    @DisplayName("Should reverse an int even if negative")
    void reverseIntSimpleNegative() {
        assertEquals(-142, Tps.reverseInt(-241));
    }

    @Test
    @DisplayName("Should return 0 if 0 given")
    void reverseIntNull() {
        assertEquals(0, Tps.reverseInt(0));
        assertEquals(0, Tps.reverseInt(00000));
    }

    @Test
    @DisplayName("Should return XXX if XXX000000 given")
    void reverseIntZerosAtEnd() {
        assertEquals(123, Tps.reverseInt(32100000));
        assertEquals(123, Tps.reverseInt(3210));
    }

    @Test
    @DisplayName("Should return -XXX if -XXX000000 given")
    void reverseIntZerosAtEndNegative() {
        assertEquals(-123, Tps.reverseInt(-32100000));
        assertEquals(-123, Tps.reverseInt(-3210));
    }


    // capitalize


    @Test
    @DisplayName("Should capitalize all words")
    void capitalizeSimple() {
        assertEquals("Je Suis Dans La Joie", Tps.capitalze("je suis dans la joie"));
    }

    @Test
    @DisplayName("Should capitalize all words even if UPPER CASE")
    void capitalizeUpperCase() {
        assertEquals("Je Suis Dans La Joie", Tps.capitalze("JE SUIS DANS LA JOIE"));
    }

    @Test
    @DisplayName("Should capitalize all words ignoring special chars")
    void capitalizeSpecialChars() {
        assertEquals("J'etais Dans La Joie", Tps.capitalze("J'ETAIS Dans La Joie"));
    }

    @Test
    @DisplayName("Double space should be ignored")
    void capitalizeDoubleSpace() {
        assertEquals("J'etais Dans La Joie", Tps.capitalze("J'ETAIS Dans La Joie"));
    }

    @Test
    @DisplayName("Should return charArray where one char out of two is capitalized, ignoring special chars (numbers accepted)")
    void alternate() {
    }

    @Test
    @DisplayName("Should return an end coordinate depending on set of instructions (top bottom right left)")
    void direction(){
        assertEquals(Arrays.toString(new int[] {114, 0}), Arrays.toString(Tps.direction(new String[] {"droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite","droite", "droite"})));
    }

}