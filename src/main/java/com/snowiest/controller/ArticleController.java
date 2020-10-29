package com.snowiest.controller;

import com.snowiest.entity.Article;
import com.snowiest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/h")
    @ResponseBody
    public String h() {
        return "Get Ok!";
    }

    @CrossOrigin
    @GetMapping("/article/{id}")
    @ResponseBody
    public Article showArticle(@PathVariable("id") Integer id) {
        return articleService.getById(id);
    }

    @GetMapping("/article")
    @ResponseBody
    public Integer a() {
        Article article = new Article();
        article.setCover("xxxxx");
        article.setAuthor("admin");
        article.setTitle("wwwwwwwwwwwwww");
        article.setLike(1);
        article.setEye(3);
        article.setComment(2);
        article.setTag("ori");
        article.setSummary("uuuuuuuuuuuu");
        Integer r = articleService.add(article);
        return r;
    }
}
