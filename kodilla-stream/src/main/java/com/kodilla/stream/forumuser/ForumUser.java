package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int signature;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private final int postQuantity;

    public ForumUser(int signature, String name, char sex, LocalDate birthday, int postQuantity) {
        this.signature = signature;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.postQuantity = postQuantity;
    }

    public int getSignature() {
        return signature;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "signature=" + signature +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postQuantity=" + postQuantity +
                '}';
    }

}
