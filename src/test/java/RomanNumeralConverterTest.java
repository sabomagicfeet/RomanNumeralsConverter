import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter romanNumeralConverter;

    @BeforeEach
    public void setup() {
        romanNumeralConverter = new RomanNumeralConverter();
    }

    @Test
    void testRomanNumeralConverterI(){
        String romanNumber = "I";
        String expectedResult = "1";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterII(){
        String romanNumber = "II";
        String expectedResult = "2";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterIII(){
        String romanNumber = "III";
        String expectedResult = "3";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterIV(){
        String romanNumber = "IV";
        String expectedResult = "4";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterV(){
        String romanNumber = "V";
        String expectedResult = "5";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterVI(){
        String romanNumber = "VI";
        String expectedResult = "6";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterVII(){
        String romanNumber = "VII";
        String expectedResult = "7";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterVIII(){
        String romanNumber = "VIII";
        String expectedResult = "8";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterIX(){
        String romanNumber = "IX";
        String expectedResult = "9";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterX(){
        String romanNumber = "X";
        String expectedResult = "10";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterXXX(){
        String romanNumber = "XXX";
        String expectedResult = "It is not Roman Numeral 1 - 10";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRomanNumeralConverterASDF(){
        String romanNumber = "ASDF";
        String expectedResult = "It is not Roman Numeral 1 - 10";
        String actualResult = romanNumeralConverter.convertRomanNumeral(romanNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
