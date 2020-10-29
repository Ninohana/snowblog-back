package com.snowiest.service;

import com.snowiest.entity.Article;

public interface ArticleService {

    Article getById(Integer id);

    Integer add(Article article);
}
