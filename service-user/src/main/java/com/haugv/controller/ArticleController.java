package com.haugv.controller;

import com.haugv.common.Result;
import com.haugv.entity.Article;
import com.haugv.service.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 98285
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("get")
    public Result getArticleList(@RequestParam("subject") String subject){
        List<Article> articles = articleService.getArticleList(subject);
        Result result = Result.successWithoutData();
        result.setData(articles);
        return result;
    }

    @PostMapping("create")
    public Result createArticle(Article article){
        int count = articleService.createArticle(article);
        return Result.successWithoutData();
    }
}
