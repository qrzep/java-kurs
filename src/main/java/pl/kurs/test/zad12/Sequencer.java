package pl.kurs.test.zad12;

public class Sequencer {

    private static boolean checkIfAllZeroes(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArithmetic(int[] sequence) {
        if (sequence.length < 3) {
            return true;
        }
        int r = sequence[1] - sequence[0];
        for (int i = 2; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != r) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] sequence) {
        if (sequence.length < 3) {
            return true;
        }
        double q;
        if (sequence[0] != 0) {
            q = sequence[1] / sequence[0];
        } else {
            q = 0;
        }
        for (int i = 2; i < sequence.length; i++) {
            if (sequence[i - 1] == 0 || sequence[i] / sequence[i - 1] != q) {
                return false;
            }
        }
        return true;
    }

    public static String getSequenceName(int[] sequence) {
        if (sequence.length < 3) {
            return "INNY";
        }

        if (checkIfAllZeroes(sequence)) {
            return "INNY";
        }

        boolean isArithmetic = isArithmetic(sequence);
        boolean isGeometric = isGeometric(sequence);

        if (isArithmetic && isGeometric) {
            return "INNY";
        } else if (isArithmetic) {
            return "ARYTMETYCZNY";
        } else if (isGeometric) {
            return "GEOMETRYCZNY";
        } else return "INNY";
    }
}
