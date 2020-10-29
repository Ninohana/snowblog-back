package com.snowiest.mapper;

import com.snowiest.entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {

    @Select("SELECT * FROM article where id=#{id}")
    Article getById(Integer id);

    @Insert("INSERT INTO article(cover,title,summary,author,tag,`like`,eye,`comment`) VALUES (#{cover},#{title},#{summary},#{author},#{tag},#{like},#{eye},#{comment})")
    Integer add(Article article);
}
