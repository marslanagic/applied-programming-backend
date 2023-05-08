package com.project.repositories;

import com.project.models.Admin;
import com.project.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
