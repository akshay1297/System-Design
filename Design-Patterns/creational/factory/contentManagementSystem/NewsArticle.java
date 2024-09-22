package creational.factory.contentManagementSystem;

import java.util.Date;

public class NewsArticle extends Article {
     private String headLine;
    private String content;

    private String source;

    private Date publicationDate;

    @Override
    public void createStructure() {
        System.out.println("NewsArticle structure created.");
    }

    @Override
    public void createMetadata() {
        System.out.println("NewsArticle Metadata created.");
    }

    @Override
    public void createFormattingRules() {
        System.out.println("NewsArticle Formatting rules created.");
    }
}
