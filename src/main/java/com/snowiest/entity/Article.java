package com.snowiest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Integer id;
    private String cover;
    private String title;
    private String summary;
    private String author;
    private String tag;
    private Integer like;
    private Integer eye;
    private Integer comment;
}
