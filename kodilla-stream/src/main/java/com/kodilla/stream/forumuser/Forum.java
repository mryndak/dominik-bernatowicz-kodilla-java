package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(001, "Karol", 'M',
                LocalDate.of(2000, 5, 12), 10));
        theForumUserList.add(new ForumUser(002,"Dominika", 'F',
                LocalDate.of(2005, 1, 11), 1));
        theForumUserList.add(new ForumUser(003,"Piotr", 'M',
                LocalDate.of(1990, 10, 16), 6));
        theForumUserList.add(new ForumUser(004,"Monika", 'F',
                LocalDate.of(1998, 6, 20), 100));
        theForumUserList.add(new ForumUser(005,"Karolina", 'F',
                LocalDate.of(2001, 2, 3), 2));
    }

    public List<ForumUser> getTheForumUserList() {
        return theForumUserList;
    }
}
