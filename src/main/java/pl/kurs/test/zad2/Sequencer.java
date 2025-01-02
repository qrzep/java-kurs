package pl.kurs.test.zad2;

public class Sequencer {
    public static String getSequenceName(int[] sequence) {
        if (sequence.length < 3) {
            return "INNY";
        }
        boolean allZeroes = true;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] != 0) {
                allZeroes = false;
                break;
            }}
        if (allZeroes) { return "INNY";}

        boolean isArithmetic = true;
        boolean isGeometric = true;
        int r = sequence[1] - sequence[0];
        double q;
        if (sequence[0] != 0) {
            q = sequence[1] / sequence[0];
        }
        else {q = 0;}

        for (int i = 2; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != r) {
                isArithmetic = false;
            }
            if (sequence[i - 1] == 0 || sequence[i] / sequence[i - 1] != q) {
                isGeometric = false;
            }
            if (!isArithmetic && !isGeometric) {
                return "INNY";
            }
        }

        if (isArithmetic && isGeometric) {
            return "INNY";
        } else if (isArithmetic) {
            return "ARYTMETYCZNY";
        } else if (isGeometric) {
            return "GEOMETRYCZNY";
        } else return "INNY";
    }
}
