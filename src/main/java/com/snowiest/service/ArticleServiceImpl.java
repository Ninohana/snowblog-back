package com.snowiest.service;

import com.snowiest.entity.Article;
import com.snowiest.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Article getById(Integer id) {
        return articleMapper.getById(id);
    }

    @Override
    public Integer add(Article article) {
        return articleMapper.add(article);
    }
}
