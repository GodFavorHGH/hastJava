package com.haugv.mapper;

import com.haugv.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 98285
 */
@Mapper
public interface ArticleMapper {

    int createArticle(Article article);

    List<Article> getArticleList(@Param("subject") String subject);

}
