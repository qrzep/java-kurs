package pl.kurs.test.zad3;

public class SuperPrime {
    private static int[] addItemToIntArray (int[] inputArray) {
        int[] newArray = new int[inputArray.length+1];
        for (int i = 0; i < inputArray.length; i++){
            newArray[i] = inputArray[i];
        }
        return newArray;
    }

    private static int sumDigitsInNumber(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] superPrimes (int from, int to) {
        int[] resultArr = new int[0];
        int initPos = 0;
        while (from <= to) {
            if (isPrime(from) && isPrime(sumDigitsInNumber(from))) {
                resultArr = addItemToIntArray(resultArr);
                resultArr[initPos++] = from;
            }
            from++;
        }
        return resultArr;
    }
}
