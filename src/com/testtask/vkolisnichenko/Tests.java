package com.testtask.vkolisnichenko;

/**
 * A class in which tests are implemented to test various
 * string methods, and the result is output to the console
 */
public class Tests {

    void runTests() {
        MyString firstString = new MyString("testString");
        MyString secondString = new MyString("java the best programming language");
        System.out.println("input String: " + firstString.get());
        runAllTests(firstString);
        System.out.println();
        System.out.println("input String: " + secondString.get());
        runAllTests(secondString);
        testConvertIntToString(firstString);

    }

    void runAllTests(MyString myString) {
        testContains(myString);
        testSubString(myString);
        testConcatenation(myString);

    }

    void testContains(MyString string) {
        boolean test2 = string.contains("estSt");
        boolean test1 = string.contains("123");
        boolean test3 = string.contains("ing");
        boolean test4 = string.contains("java the best programming language");

        System.out.println("contains 123: " + test1);
        System.out.println("contains estSt: " + test2);
        System.out.println("contains ing: " + test3);
        System.out.println("contains java the best programming language: " + test4);


    }

    void testSubString(MyString string) {
        String firstSubString = string.subString(4);
        String secondSubString = string.subString(1, 5);
        String thirdSubString = string.subString(string.length() - 1);

        System.out.println("After substring (4, ): " + firstSubString);
        System.out.println("After substring (1,5): " + secondSubString);
        System.out.println("After substring (length-1, ): " + thirdSubString);

    }

    void testConcatenation(MyString string) {
        String test1 = string.concatenation("123");
        String test2 = string.concatenation("kotlin");
        System.out.println("Concatenation 123: " + test1);
        System.out.println("Concatenation kotlin: " + test2);
    }

    void testConvertIntToString(MyString string) {
        int integer = 5;
        int i = 999;
        Number number = 435;

        String test1 = string.convertIntToString(integer);
        String test2 = string.convertIntToString((int) number);
        String test3 = string.convertIntToString(i);

        System.out.println("After convert 5 to string: " + test1.getClass());
        System.out.println("After convert 999 to string: " + test2.getClass());
        System.out.println("After convert 435 to string: " + test3.getClass());

    }


    void convertStringToFloat(MyString string) {
        float test = string.convertStringToFloat();
        System.out.println("After convert to float " + test);
    }


}
