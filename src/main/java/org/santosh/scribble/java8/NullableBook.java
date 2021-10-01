package org.santosh.scribble.java8;

import java.util.Optional;

public class NullableBook {
    Optional<String> bookName;
    public NullableBook (Optional<String> name) {
        bookName = name;
    }
    public Optional<String> getBookName() {
        return bookName;
    }

    public static void main(String[] args) {
        NullableBook book = new NullableBook(Optional.ofNullable(null));
        Optional<String> name = book.getBookName();
        name.ifPresent(System.out::println);
        System.out.println(name.isPresent());
    }
}
