public class Magazine extends ReadingItem{
    private String coverStoryTitle;
    private String printDate;

    public Magazine(String coverStoryTitle, String printDate){
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    public String toString(){
        return "\nName: " + this.getName() + ", Location: " + this.getLocation() + ", Price: " + this.getPrice() + ", Description: " + this.getDescription() + ", Magazine Cover Story Title: " + coverStoryTitle + ", Print Date: " + printDate + ", Word Count: " + this.getWordCount() + ", Author: " + this.getAuthor() + ", Date Published: " + this.getDatePublished();
    }

    public void setCoverStoryTitle(String coverStoryTitle){
        this.coverStoryTitle = coverStoryTitle;
    }

    public void setPrintDate(String printDate){
        this.printDate = printDate;
    }
}
