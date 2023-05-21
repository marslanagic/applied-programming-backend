package com.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "Article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "heading")
    private String heading;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "date")
    private Date date;

    @Column(name = "picture")
    private String picture;

    @Column(name = "trending")
    private boolean trending;

    @Column(name = "category")
    @Enumerated(value = EnumType.STRING)
    private ArticleCategory category;
}

