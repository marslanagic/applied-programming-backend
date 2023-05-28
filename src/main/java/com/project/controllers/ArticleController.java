package com.project.controllers;

import com.project.models.Article;
import com.project.models.ArticleCategory;
import com.project.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Article createAdmin(@RequestBody Article article) {
        return articleService.createArticle(article);
    }

    @PutMapping("/{id}")
    public Article updateAdmin(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        return articleService.updateArticle(article);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(Math.toIntExact(id));
    }

    @DeleteMapping()
    public void deleteAll() {
        articleService.deleteAllArticles();
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Optional<Article> getArticleById(@PathVariable Integer id) {
        return articleService.getArticlesById(id);
    }

    @GetMapping("/category/{category}")
    public List<Article> getArticleByCategory(@PathVariable ArticleCategory category) {
        return articleService.getArticleByCategory(category);
    }

    @GetMapping("/heading/{heading}")
    public List<Article> getArticleByHeading(@PathVariable String heading) {
        return articleService.getArticleByHeading(heading);
    }

    @GetMapping("/trending")
    public Article getArticleByTrendingYes() {
        List<Article> articles = articleService.getArticleByTrending();
        Random random = new Random();
        return articles.get(random.nextInt(articles.size()));
    }
}


