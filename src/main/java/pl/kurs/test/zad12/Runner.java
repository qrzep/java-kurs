package pl.kurs.test.zad12;
//Zadanie 01:
//        napisz metode boolean isArithmetic(int[] sequence), ktora zwroci informacje o tym czy dany
//        jako argument ciag jest arytmetyczny czy nie.
//Zadanie 02:
//        napisz metode String getSequenceName(int[] sequence) ktora zwroci:
//        - GEOMETRYCZNY - jesli podany ciag jest geometryczny
//        - ARYTMETYCZNY - jesli podany ciag jest arytmetyczny
//        - INNY - w przypadku gdy zadne z powyzszych

public class Runner {
    public static void main(String[] args) {
        int[] arrAri1 = {-1, -4, -7};
        int[] arrAri2 = {-1, -4, -7};
        int[] arrAri3 = {1, -4, 7};
        boolean result1 = Sequencer.isArithmetic(arrAri1);
        boolean result2 = Sequencer.isArithmetic(arrAri2);
        boolean result3 = Sequencer.isArithmetic(arrAri3);
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 9, 27};
        int[] arr3 = {5, 5, 5};
        int[] arr4 = {-1, -3, -9};
        int[] arr5 = {-3, -3, -3};
        int[] arr6 = {0, 1, 0};
        int[] arr7 = {0, 0, 0};
        int[] arr8 = {1, 1, 0, 1};
        int[] arr9 = {-3, 9, -27};
        String res1 = Sequencer.getSequenceName(arr1);
        String res2 = Sequencer.getSequenceName(arr2);
        String res3 = Sequencer.getSequenceName(arr3);
        String res4 = Sequencer.getSequenceName(arr4);
        String res5 = Sequencer.getSequenceName(arr5);
        String res6 = Sequencer.getSequenceName(arr6);
        String res7 = Sequencer.getSequenceName(arr7);
        String res8 = Sequencer.getSequenceName(arr8);
        String res9 = Sequencer.getSequenceName(arr9);

    }

}
