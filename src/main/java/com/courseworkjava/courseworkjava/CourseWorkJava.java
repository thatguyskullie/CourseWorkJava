/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.courseworkjava.courseworkjava;

/**
 *
 * @author thatguykullie
 */
public class CourseWorkJava {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciNumbers();
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<____________>>>>>>>>>>>>>>>>");
        System.out.println();
        Tribonnacci tribonacci = new Tribonnacci();
        tribonacci.tribonacciNumbers();
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<____________>>>>>>>>>>>>>>>>");
        System.out.println();
        ExtractDigits extractDigits = new ExtractDigits();
        extractDigits.extractDigits();
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<____________>>>>>>>>>>>>>>>>");
        System.out.println();
        SquareBoard squareBoard = new SquareBoard();
        squareBoard.squareBoard();
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<____________>>>>>>>>>>>>>>>>");
        System.out.println();
        CheckerBoard checkerBoard = new CheckerBoard();
        checkerBoard.checkerBoard();
        
    }
}
