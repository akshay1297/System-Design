package creational.factory.contentManagementSystem;

// it will do object creation
public class BlogPostFactory extends ArticleFactory {
    @Override
    public Article createArticle() {
      return new BlogPost();
    }

    public static class ResearchPaperFactory extends ArticleFactory {
        @Override
        public Article createArticle() {
            return new ResearchPaper();
        }
    }
}
