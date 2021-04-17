package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class Calculate{
    Statistics statistics;
    int numberOfPost;
    int numberOfUser;
    int numberOfComment;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.numberOfUser = statistics.userNames().size();
        this.numberOfPost = statistics.postsCount();
        this.numberOfComment = statistics.commentsCount();

        if (numberOfUser == 0) {
            averageNumberOfCommentsPerPost = 0;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfPostsPerUser = 0;
        }
        else {
            if (numberOfPost == 0) {
                averageNumberOfCommentsPerPost = 0;
                averageNumberOfCommentsPerUser = 0;
                averageNumberOfPostsPerUser = 0;
            }
            else {
                averageNumberOfPostsPerUser = (double)numberOfPost / (double)numberOfUser;
                if (numberOfComment == 0) {
                    averageNumberOfCommentsPerPost = 0;
                    averageNumberOfCommentsPerUser = 0;
                }
                else {
                    averageNumberOfCommentsPerPost = (double)numberOfComment / (double)numberOfPost;
                    averageNumberOfCommentsPerUser = (double)numberOfComment / (double)numberOfUser;
                }
            }
        }
    }

    public void showStatistics() {
        System.out.println("numberOfUsers: " + numberOfUser);
        System.out.println("numberOfPosts: " + numberOfPost);
        System.out.println("numberOfComments: " + numberOfComment);
        System.out.println("averageNumberOfPostsPerUser: " + averageNumberOfPostsPerUser);
        System.out.println("averageNumberOfCommentsPerUser:" + averageNumberOfCommentsPerUser);
        System.out.println("averageNumberOfCommentsPerPost: " + averageNumberOfCommentsPerPost);
    }
}
