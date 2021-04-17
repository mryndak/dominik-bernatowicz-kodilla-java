package com.kodilla.stream.immutable;

public final class ForumUser {
    private String username;
    private String realName;

    public ForumUser(final String username, final String realName) {
        this.realName = realName;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
