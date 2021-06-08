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
        board.toDoList.addTask("to do task");
        board.read(board.toDoList);
        board.inProgressList.addTask("in progress task");
        board.read(board.inProgressList);
        board.doneList.addTask("done task");
        board.read(board.doneList);

        System.out.println("--BEEN--");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("--BEEN--");
    }
}
