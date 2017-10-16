package randomizer.utilities;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OHIPUtil {

    public ArrayList<String> generateHealthNumbers(int count) {

        ArrayList<String> list = new ArrayList<>(count);

        for (int i = 0; i < count; i++) {
            list.add(generateHealthNumber());
        }
        return list;
    }

    public String generateHealthNumber() {

        String randomNumber = Integer.toString(ThreadLocalRandom.current().nextInt(100000000, 999999999));
        return randomNumber + getHealthNumberCheckDigit(randomNumber);
    }

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
