package creational.factory.contentManagementSystem;

public class NewsArticleFactory extends ArticleFactory {
    @Override
    public Article createArticle() {
        return new NewsArticle();
    }
}
