package creational.factory.contentManagementSystem;

public class Client {
    public static void main(String[] args){
       ArticleFactory blogFactory = new BlogPostFactory();
       blogFactory.createArticle().createMetadata();

        ArticleFactory newsArticleFactory = new NewsArticleFactory();
        newsArticleFactory.createArticle().createFormattingRules();


        ArticleFactory researchPaperFactory = new BlogPostFactory.ResearchPaperFactory();
        researchPaperFactory.createArticle().createMetadata();



    }
}
