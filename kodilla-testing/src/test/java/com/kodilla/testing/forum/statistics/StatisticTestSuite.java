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
            int thePostCount = calculate.numberOfPost;

            // Then
            assertEquals(0,thePostCount);
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
            int thePostCount = calculate.numberOfPost;

            // Then
            assertEquals(1000,thePostCount);
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
            int theCommentCount = calculate.numberOfComment;

            // Then
            assertEquals(0,theCommentCount);
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
            double theCommentCount = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(0.1, theCommentCount);
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
            double theCommentCount = calculate.averageNumberOfCommentsPerPost;

            // Then
            assertEquals(10,theCommentCount);
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

            // Then
            assertEquals(100,theUserCount);
            calculate.showStatistics();
        }
    }
}
/*

    gdy liczba postów = 0,
        gdy liczba postów = 1000,
        gdy liczba komentarzy = 0,
        gdy liczba komentarzy < liczba postów,
        gdy liczba komentarzy > liczba postów,
        gdy liczba użytkowników = 0,
        gdy liczba użytkowników = 100.*/
