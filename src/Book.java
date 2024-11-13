public class Book extends ReadingItem {
    private String isbn;
    private String edition;
    private String title;

    public Book(String isbn, String edition, String title){
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;

    }

    public String toString(){
        return "\nName: " + this.getName() + ", Location: " + this.getLocation() + ", Price: " + this.getPrice() + ", Description: " + this.getDescription() + ", Book Name: " + title + ", Edition: " + edition + ", isbn: " + isbn + ", Word Count: " + this.getWordCount() + ", Author: " + this.getAuthor() + ", Date Published: " + this.getDatePublished();
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public String getEdition(){
        return edition;
    }

    public String getIsbn(){
        return isbn;
    }

}
