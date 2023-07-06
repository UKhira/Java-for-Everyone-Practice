// import java.time.LocalDate;

public class UserTest {
    public static void main(String[] args) {
        // User youngerUser = new User();

        // youngerUser.name = "Udith";
        // youngerUser.birthDay = LocalDate.parse("2002-10-29");

        User youngerUser = new User("Udith", "2002-10-29");

        // User olderUser = new User();

        // olderUser.name = "Kavishka";
        // olderUser.birthDay = LocalDate.parse("1996-03-23");

        // Book book = new Book();

        // book.title = "Sherlock Holmes";
        // book.author = "Sir. Arthur Conan Doyle";
        Book book = new Book("Sherlock Holmes","Sir. Arthur Conan Doyle", 270);

        AudioBook book2 = new AudioBook("Elites", "Mr.Enon","1hr");

        youngerUser.borrow(book.toString());
        youngerUser.borrow(book2);

        // System.out.printf("%s was born at %s. and He is %d years old. %n", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
        System.out.printf("%s was born at %s. and He is %d years old. %n", youngerUser.getName(), youngerUser.getBirthday(), youngerUser.age());
    
        // System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());
        System.out.printf("%s has borrowed these books: %s", youngerUser.getName(), youngerUser.borrowedBooks());
    
    }
}
