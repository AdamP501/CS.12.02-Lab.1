public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public int getWordCount(){
        return wordCount;
    }

    public String getDatePublished(){
        return datePublished;
    }

    public String getAuthor(){
        return author;
    }
}
