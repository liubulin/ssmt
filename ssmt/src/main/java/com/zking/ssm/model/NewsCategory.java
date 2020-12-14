package com.zking.ssm.model;

import lombok.ToString;

import java.util.List;
@ToString
public class NewsCategory {
    private Integer id;

    private Integer nid;

    private Integer cid;

//    private List news;
//
//    private List category;
//
//    public List getCategory() {
//        return category;
//    }
//
//    public void setCategory(List category) {
//        this.category = category;
//    }
//
//    public List getNews() {
//        return news;
//    }
//
//    public void setNews(List news) {
//        news = news;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}