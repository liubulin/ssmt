package com.zking.ssm.model;

import lombok.ToString;

import java.util.List;

@ToString(exclude ="Category" )
public class News {
    private Integer newsId;

    private String title;

    private List Category;

    public List getCategory() {
        return Category;
    }

    public void setCategory(List category) {
        Category = category;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}