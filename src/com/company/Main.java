package com.company;

public class Main {

    char[] letters = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M' , 'N', 'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};


    public int ceasarCryptLetterToNumber(char letter) {
        int numberTemp = 0;

        for(int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                numberTemp = i;
            }
        }
        return numberTemp;
    }

    public char ceasarCryptNumberToLetter(int number) {
        char letterTemp = letters[number];
        return letterTemp;
    }

    public static void main(String[] args) {
    Main obj = new Main();

    int letterToNumber = obj.ceasarCryptLetterToNumber('T');

    char numberToLetter = obj.ceasarCryptNumberToLetter(5);

    }
}
