package library;


public class Book {
    private Integer id;
    private String title;
    private String author;
    private String genre;
    private String year;
    private String cover;

    public Book() {

    }

    public Book(Integer id, String title, String author, String genre, String year, String cover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\n' +
                "title='" + title + '\n' +
                ", author='" + author + '\n' +
                ", genre='" + genre + '\n' +
                ", year=" + year +
                ", cover='" + cover + '\n' +
                '}';
    }

}
