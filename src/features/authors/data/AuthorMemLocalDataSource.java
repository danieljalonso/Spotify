package features.authors.data;

import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    public ArrayList<Author> authorsMemStorage;

    public ArrayList<Author> findAll() {
        Author author1 = new Author("1", "Extremoduro", "01-01-1970", "Española");
        authorsMemStorage.add(author1);

        Author author2 = new Author("2", "Oasis", "01-01-1980", "Inglesa");
        authorsMemStorage.add(author2);

        return authorsMemStorage;
    }

}
