package es.upm.miw.iwvg_devops.rest;

import demo.Fraction;
import demo.Searches;
import demo.UsersDatabase;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserIdByAnyProperFraction() {
        assertEquals(List.of("1", "2", "3", "5"), new Searches().findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    void testFindUserNameByAnyImproperFraction() {
    }

    void testFindUserFamilyNameByAllSignFractionDistinct() {
    }

    void testFindDecimalFractionByUserName() {
    }

    void testFindDecimalFractionBySignFraction() {
    }

    void testFindFractionAdditionByUserId() {
    }

    void testFindFractionSubtractionByUserName() {
    }

    @Test
    void testFindFractionMultiplicationByUserFamilyName() {
        assertEquals(new Fraction(12, -240),
                new Searches().findFractionMultiplicationByUserFamilyName("López"));
    }

    @Test
    void findFirstFractionDivisionByUserId() {
        assertEquals(new Fraction(-6, 15),
                new Searches().findFirstFractionDivisionByUserId("3"));
    }

    @Test
    void findUserFamilyNameInitialByAnyProperFraction(){
        assertEquals(List.of("F.", "B.", "L.", "B."), new Searches().findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void findFirstDecimalFractionByUserName(){
        assertEquals(2.0,
                new Searches().findFirstDecimalFractionByUserName("Ana"));
    }

    @Test
    void findUserIdByAllProperFraction(){
        assertEquals(List.of(), new Searches().findUserIdByAllProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void findHighestFraction(){
        assertEquals(new Fraction(2, 1),
                new Searches().findHighestFraction());
    }
}
