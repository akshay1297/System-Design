package creational.factory.contentManagementSystem;

import java.util.List;

public class BlogPost extends Article {
    private String title;
    private String body;
    private List<String> tags;
    private String author;

    @Override
    public void createStructure() {
        System.out.println("Blog Post structure created.");
    }

    @Override
    public void createMetadata() {
        System.out.println("Blog Post Metadata created.");
    }

    @Override
    public void createFormattingRules() {
        System.out.println("Blog Post Formatting rules created.");
    }
}
