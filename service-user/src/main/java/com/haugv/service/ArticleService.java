package com.haugv.service;

import com.haugv.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 98285
 */
public interface ArticleService {

    int createArticle(Article article);

    List<Article> getArticleList(String subject);

}
