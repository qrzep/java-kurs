package pl.kurs.test.zad1;
//Zadanie 01:
//        napisz metode boolean isArithmetic(int[] sequence), ktora zwroci informacje o tym czy dany
//        jako argument ciag jest arytmetyczny czy nie.
public class Runner {
    public static void main(String[] args) {
        int [] arr1 = {-1,-4,-7};
        int [] arr2 = {-1,-4,-7};
        int [] arr3 = {1, -4, 7};
        boolean result1 = Sequencer.isArithmetic(arr1);
        boolean result2 = Sequencer.isArithmetic(arr2);
        boolean result3 = Sequencer.isArithmetic(arr3);
    }
}
