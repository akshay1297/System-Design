package creational.factory.contentManagementSystem;

public class ResearchPaper extends Article {

    private  String title;
    private String abstracts;
    private String authors;

    private String references;

    private String journal;

    @Override
    public void createStructure() {
        System.out.println("ResearchPaper structure created.");
    }

    @Override
    public void createMetadata() {
        System.out.println("ResearchPaper Metadata created.");
    }

    @Override
    public void createFormattingRules() {
        System.out.println("ResearchPaper Formatting rules created.");
    }
}
