package main;

import model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {

    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article("1", "Article 1", "Description 01"),
            new Article("2", "Article 2", "Description 02"),
            new Article("3", "Article 2", "Description 03")
    ));

    public List<Article> getAllArticles(){
        return articleList;
    }

    public Article getArticle(String id)
    {
        return articleList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addArticle(Article article) {
        articleList.add(article);
    }
}
