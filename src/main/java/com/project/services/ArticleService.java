package com.project.services;

import com.project.models.Article;
import com.project.models.ArticleCategory;
import com.project.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }

    public void deleteArticle(Integer id) {
        articleRepository.deleteById(id);
    }

    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Optional<Article> getArticlesById(Integer id) {
        return articleRepository.findById(id);
    }

    public List<Article> getArticleByCategory(ArticleCategory a) {
        return articleRepository.findArticleByCategory(a);
    }

    public List<Article> getArticleByHeading(String heading) {
        return articleRepository.findArticleByHeading(heading);
    }

}
