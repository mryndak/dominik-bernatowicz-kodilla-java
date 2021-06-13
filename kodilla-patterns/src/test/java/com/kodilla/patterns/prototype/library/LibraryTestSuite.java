package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("library1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5).forEach(n -> library.getBooks()
                .add(new Book("Book" + n, "Autor" + n, LocalDate.of(2000, n, 1))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when

        //then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
