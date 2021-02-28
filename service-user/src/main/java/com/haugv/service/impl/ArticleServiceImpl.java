package com.haugv.service.impl;

import com.haugv.entity.Article;
import com.haugv.mapper.ArticleMapper;
import com.haugv.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 98285
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public int createArticle(Article article) {
        return articleMapper.createArticle(article);
    }

    @Override
    public List<Article> getArticleList(String subject) {
        return articleMapper.getArticleList(subject);
    }
}
