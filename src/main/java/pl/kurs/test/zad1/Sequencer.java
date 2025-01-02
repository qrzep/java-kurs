package pl.kurs.test.zad1;

public class Sequencer {

    public static boolean isArithmetic(int[] sequence) {
        if (sequence.length < 3) {return true;}
        int r = sequence[1] - sequence[0];
        for (int i = 2; i < sequence.length; i++) {
            if (sequence[i] - sequence[i-1] != r) {
                return false;
            }
        }
        return true;
    }
}
