package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUser(int userQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++) {
            String user = "theUser" + n;
            resultList.add(user);
        }
        return resultList;
    }

    @Nested
    class testPost {
        @Test
        void testPostZero() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(1));
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(1,theUserCount);
            assertEquals(0,thePostCount);
            assertEquals(0,theCommentCount);
            assertEquals(0,thePPU);
            assertEquals(0,theCPU);
            assertEquals(0,theCPP);
            calculate.showStatistics();
        }

        @Test
        void testPostThousand() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(1));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(1,theUserCount);
            assertEquals(1000,thePostCount);
            assertEquals(0,theCommentCount);
            assertEquals(1000,thePPU);
            assertEquals(0,theCPU);
            assertEquals(0,theCPP);
            calculate.showStatistics();
        }
    }

    @Nested
    class testComment {
        @Test
        void testCommentZero() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(1));
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(0);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(1,theUserCount);
            assertEquals(10,thePostCount);
            assertEquals(0,theCommentCount);
            assertEquals(10,thePPU);
            assertEquals(0,theCPU);
            assertEquals(0,theCPP);
            calculate.showStatistics();
        }

        @Test
        void testCommentsLessPosts() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(1));
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(10);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(1,theUserCount);
            assertEquals(100,thePostCount);
            assertEquals(10,theCommentCount);
            assertEquals(100,thePPU);
            assertEquals(10,theCPU);
            assertEquals(0.1,theCPP);
            calculate.showStatistics();
        }

        @Test
        void testCommentsMorePosts() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(1));
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(100);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(1,theUserCount);
            assertEquals(10,thePostCount);
            assertEquals(100,theCommentCount);
            assertEquals(10,thePPU);
            assertEquals(100,theCPU);
            assertEquals(10,theCPP);
            calculate.showStatistics();
        }
    }

    @Nested
    class testUser {
        @Test
        void testUserZero() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(0));
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(100);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(0,theUserCount);
            calculate.showStatistics();
        }

        @Test
        void testUserHundred() {

            // Given
            Calculate calculate = new Calculate();
            when(statisticsMock.userNames()).thenReturn(generateListOfNUser(100));
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(10);
            calculate.calculateAdvStatistics(statisticsMock);

            // When
            int theUserCount = calculate.numberOfUser;
            int thePostCount = calculate.numberOfPost;
            int theCommentCount = calculate.numberOfComment;
            double thePPU = calculate.averageNumberOfPostsPerUser;
            double theCPU = calculate.averageNumberOfCommentsPerUser;
            double theCPP = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(100,theUserCount);
            assertEquals(100,thePostCount);
            assertEquals(10,theCommentCount);
            assertEquals(1,thePPU);
            assertEquals(0.1,theCPU);
            assertEquals(0.1,theCPP);
            calculate.showStatistics();
        }
    }
}
