package pl.kurs.test.zad4;

public class Sequencer {
    private static String getMonotonicType(int[] sequence) {
        if (sequence.length < 2) {
            return "ROSNĄCY I MALEJĄCY";
        }

        boolean isIncreasing = true;
        boolean isStrictlyIncreasing = true;
        boolean isDecreasing = true;
        boolean isStrictlyDecreasing = true;
        boolean allEqual = true;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] < sequence[i - 1]) {
                isIncreasing = false;
                isStrictlyIncreasing = false;
            }
            if (sequence[i] <= sequence[i - 1]) {
                isStrictlyIncreasing = false;
            }
            if (sequence[i] > sequence[i - 1]) {
                isDecreasing = false;
                isStrictlyDecreasing = false;
            }
            if (sequence[i] >= sequence[i - 1]) {
                isStrictlyDecreasing = false;
            }
            if (sequence[i] != sequence[i - 1]) {
                allEqual = false;
            }
            if (!isDecreasing && !isIncreasing) {
                return "INNY";
            }
        }

        if (allEqual) {return "ROSNĄCY I MALEJĄCY";}
        else if (isStrictlyIncreasing) {return "SCISLE ROSNĄCY";}
        else if (isIncreasing) {return "ROSNĄCY";}
        else if (isStrictlyDecreasing) {return "SCISLE MALEJĄCY";}
        else if (isDecreasing) {return "MALEJĄCY";}
        else {return "INNY";}
    }

    private static int findMin(int[] sequence) {
        if (sequence.length == 1) {
            return sequence[0];
        }

        int min = sequence[0];

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] < min) {
                min = sequence[i];
            }
        }
        return min;
    }

    private static int findMax(int[] sequence) {
        if (sequence.length == 1) {
            return sequence[0];
        }

        int max = sequence[0];

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > max) {
                max = sequence[i];
            }
        }
        return max;
    }

    private static int findMostPopularNumber (int[] sequence) {
        if (sequence.length == 1) {
            return sequence[0];
        }

        int mostPopularNumber = sequence[0];
        int maxCount = 0;

        for (int i = 0; i < sequence.length; i++) {
            int counter = 0;
            for (int j = 0; j < sequence.length; j++) {
                if(sequence[j] == sequence[i]) {
                    counter++;
                }
            }
            if (counter > maxCount) {
                maxCount = counter;
                mostPopularNumber = sequence[i];
            }
        }
        return mostPopularNumber;
    }

    private static boolean areThereAllNaturalNumbers (int[] sequence) {
        if (sequence.length == 1) {
            return true;
        }
        int min = findMin(sequence);
        int max = findMax(sequence);
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : sequence) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        } return true;
    }

    public static int[] convertToIntArray (String inputString) {
        String[] stringArray = inputString.split(" ");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static void printReport (String inputString) {
        System.out.println("Generuje raport dla danych wejściowych: " + inputString);
        int[] intSequence = convertToIntArray(inputString);
        System.out.println("Dany ciąg jest: " + getMonotonicType(intSequence));
        System.out.println("Min: " + findMin(intSequence));
        System.out.println("Max: " + findMax(intSequence));
        System.out.println("Najpopularniejsza liczba: " + findMostPopularNumber(intSequence));
        System.out.println("Czy są wszystkie naturalne między min a max: " + areThereAllNaturalNumbers(intSequence));
        System.out.println("---------------------KONIEC---------------------------");
    }
}
