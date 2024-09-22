package creational.factory.contentManagementSystem;

/*
Scenario: A Content Management System (CMS) with Different Types of Articles
Imagine you're building a CMS where different types of articles (e.g., BlogPost, NewsArticle, ResearchPaper) need to be created.
Each article type has its unique structure, metadata, and formatting rules.
The content creation logic might vary significantly between these types,
and the system should be able to extend easily to accommodate new article types in the future.

Requirements:
BlogPost: Has a title, body, tags, and an author.
NewsArticle: Has a headline, content, source, and a publication date.
ResearchPaper: Includes a title, abstract, authors, references, and a publication journal.
 */

public abstract class Article {


    public abstract void createStructure();
    public abstract void createMetadata();
    public abstract void createFormattingRules();


}
