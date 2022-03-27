package glg.springframework.spring5WebApp.bootstrap;

import glg.springframework.spring5WebApp.domain.Author;
import glg.springframework.spring5WebApp.domain.Book;
import glg.springframework.spring5WebApp.repositories.AuthorRepository;
import glg.springframework.spring5WebApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author godhanigopal
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author robert = new Author("Rober", "Greene");
        Book lawsOfPower = new Book("48 laws of power", "978-0-14-028019-7");
        robert.getBooks().add(lawsOfPower);
        lawsOfPower.getAuthors().add(robert);
        authorRepository.save(robert);
        bookRepository.save(lawsOfPower);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Developer without IDE", "912-1-12-021019-4");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
