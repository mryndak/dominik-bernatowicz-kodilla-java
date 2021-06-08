package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.read(board.toDoList);
        board.read(board.toDoList);
        board.read(board.inProgressList);

        System.out.println("--BEEN--");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--BEEN--");
    }
}
