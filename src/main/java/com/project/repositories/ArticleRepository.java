package com.project.repositories;

import com.project.models.Article;
import com.project.models.ArticleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    List<Article> findArticleByCategory(ArticleCategory a);
    List<Article> findArticleByHeading(String category);
    List<Article> findArticleByTrending(Boolean trending);


}
