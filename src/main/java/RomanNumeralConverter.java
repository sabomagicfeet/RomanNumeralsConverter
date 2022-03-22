import java.util.Scanner;

public class RomanNumeralConverter {

    public String convertRomanNumeral(String romanNumeral){
        String convertedNumber = "";

        switch(romanNumeral){
            case "I" :
                convertedNumber = "1";
                break;

            case "II" :
                convertedNumber = "2";
                break;

            case "III" :
                convertedNumber = "3";
                break;

            case "IV" :
                convertedNumber = "4";
                break;

            case "V" :
                convertedNumber = "5";
                break;

            case "VI" :
                convertedNumber = "6";
                break;

            case "VII" :
                convertedNumber = "7";
                break;

            case "VIII" :
                convertedNumber = "8";
                break;

            case "IX" :
                convertedNumber = "9";
                break;

            case "X" :
                convertedNumber = "10";
                break;

            default :
                convertedNumber = "It is not Roman Numeral 1 - 10";
                System.out.println(convertedNumber);
        }

        return convertedNumber;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a Roman Numeral (1 - 10)");
        String romanNumber = keyboard.nextLine();

        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        String arabicNumber = romanNumeralConverter.convertRomanNumeral(romanNumber);
        System.out.println("Roman Numeral " + romanNumber + " is " + arabicNumber);
    }

}
