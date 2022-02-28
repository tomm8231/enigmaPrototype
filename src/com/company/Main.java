package com.company;

public class Main {

    char[] letters = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M' , 'N', 'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};


    public int ceasarCryptLetterToNumber(char letter) {
        int number = 0;

        for(int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                number = i;
            }
        }
        return number;
    }

    public char ceasarCryptNumberToLetter(int number) {
        char letter = letters[number];
        return letter;
    }

    public static void main(String[] args) {
    Main obj = new Main();

    int testNumber = obj.ceasarCryptLetterToNumber('T');
    System.out.println(testNumber);

    char testLetter = obj.ceasarCryptNumberToLetter(5);
    System.out.println(testLetter);
    }
}
