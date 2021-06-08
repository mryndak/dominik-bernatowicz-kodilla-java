package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoTasks 1")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressTasks 1")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneTask 1")
    TaskList doneList;


    @Bean
    public Board addToDoList() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoTasks 1")
    @Scope("prototype")
    public TaskList addToDoT(){
        return new TaskList();
    }

    @Bean(name = "inProgressTasks 1")
    @Scope("prototype")
    public TaskList addInProcessT(){
        return new TaskList();
    }

    @Bean(name = "doneTask 1")
    @Scope("prototype")
    public TaskList addDoneT(){
        return new TaskList();
    }

}
