package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Zadanie 7.1
        System.out.println("Poem beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("blabla", (text -> "ABC" + text + "ABC"));
        poemBeautifier.beautify("Random text", String::toUpperCase);
        poemBeautifier.beautify("TEXt", String::toLowerCase);
        poemBeautifier.beautify("What?", (text -> {
            int i = 0;
            String result = "";
            char[] tabOfLetters = text.toCharArray();
            for (char a : tabOfLetters){
                if((i % 2) == 0){
                    result += String.valueOf(a).toUpperCase();
                }
                else {
                    result += String.valueOf(a);
                }
                i++;
            }
            return result;
        }));

    }
}