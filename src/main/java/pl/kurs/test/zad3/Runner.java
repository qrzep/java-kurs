package pl.kurs.test.zad3;
//Zadanie 03:
//        napisz metodę int[] superPrimes(int from, int to) ktora zwroci wszystkie liczby super-pierwsze z zakresu <from, to>
//takż liczbą jest np: 11, dlaczego? Bo liczba super pierwsza to taka która sama jest liczbą pierwszą oraz jej suma cyfr
//        też jest liczbą pierwszą. (a liczba pierwsza to taka ktora ma dokładnie dwa dzielniki, nie wiecej, nie mniej)
public class Runner {
    public static void main(String[] args) {
        int [] result1 = SuperPrime.superPrimes(-11, 11);
        int [] result2 = SuperPrime.superPrimes(-51, 3);
        int [] result3 = SuperPrime.superPrimes(0, 0);
    }
}
