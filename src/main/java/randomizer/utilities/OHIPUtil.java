package randomizer.utilities;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represents a utility to check and generate Ontario health card numbers.
 */
public class OHIPUtil {

    /**
     * Generates heath card numbers.
     * @param count The number of health card numbers to generate.
     * @return An array of health card numbers.
     */
    public ArrayList<String> generateHealthNumbers(int count) {

        ArrayList<String> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            list.add(generateHealthNumber());
        }
        return list;
    }

    /**
     * Generates a single health card number.
     * @return A single health card numbers.
     */
    public String generateHealthNumber() {

        String randomNumber = Integer.toString(ThreadLocalRandom.current().nextInt(100000000, 999999999));
        return randomNumber + getHealthNumberCheckDigit(randomNumber);
    }

    /**
     * Generates the checksum for a health card number.
     * @param healthNumber Text representation of the health card number.
     * @return The checksum digit for the health card number.
     */
    private int getHealthNumberCheckDigit(String healthNumber) {

        int addedNumbers = 0;
        for (int i = 0; i < healthNumber.length(); i++) {

            int digit = Character.getNumericValue(healthNumber.charAt(i));

            if (i % 2 == 0) {
                int doubleNum = digit * 2;
                if (digit > 9){
                    String nArr = String.valueOf(doubleNum);
                    int digit1 = nArr.charAt(0);
                    int digit2 = nArr.charAt(1);
                    doubleNum = digit1 + digit2;
                }
                addedNumbers += doubleNum;
            } else {
                addedNumbers += digit;
            }
        }

        int checkDigit = (int) String.valueOf(addedNumbers).charAt(1);
        return (10 - checkDigit) % 10;
    }

    /**
     * Validates that an Ontario health card number (HCN) is correctly formatted using a checksum algorithm.
     * @param healthNumber Representing the health card number to validate.
     * @return True if the number is valid, false otherwise.
     */
    public Boolean validateHealthNumber(String healthNumber){

        int addedNumbers = 0;
        Boolean result = false;

        String[] healthNumArr = healthNumber.split("");

        for(int i = 0; i <= 9; i++){
            if (i % 2 == 0){
                int addedNum;
                int doubleNum = Integer.valueOf(healthNumArr[i])*2;
                if (doubleNum > 9){
                    String nArr = String.valueOf(doubleNum);
                    int digit1 = nArr.charAt(0);
                    int digit2 = nArr.charAt(1);
                    addedNum = digit1 + digit2;
                } else {
                    addedNum = doubleNum;
                }
                addedNumbers += addedNum;
            } else if (i != 9){
                addedNumbers += Integer.valueOf(healthNumArr[i]);
            } else {
                String[] nArray = String.valueOf(addedNumbers).split("");
                int digit = Integer.valueOf(nArray[1]);
                int n = (10 - digit) % 10;
                return (n == Integer.valueOf(healthNumArr[i]));
            }
        }

        return false;
        }


}
