package com.zking.ssm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private Long bookId;

    private String bookName;

    private String bookNamePinyin;

    private Long bookCategoryId;

    private String bookAuthor;

    private BigDecimal bookPrice;

    private Long bookImage;

    private String publishing;

    private String bookDesc;

    private Integer bookState;

    private Date deployDatetime;

    private Integer salesVolume;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookNamePinyin() {
        return bookNamePinyin;
    }

    public void setBookNamePinyin(String bookNamePinyin) {
        this.bookNamePinyin = bookNamePinyin == null ? null : bookNamePinyin.trim();
    }

    public Long getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Long bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Long getBookImage() {
        return bookImage;
    }

    public void setBookImage(Long bookImage) {
        this.bookImage = bookImage;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing == null ? null : publishing.trim();
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc == null ? null : bookDesc.trim();
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public Date getDeployDatetime() {
        return deployDatetime;
    }

    public void setDeployDatetime(Date deployDatetime) {
        this.deployDatetime = deployDatetime;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookNamePinyin='" + bookNamePinyin + '\'' +
                ", bookCategoryId=" + bookCategoryId +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookImage=" + bookImage +
                ", publishing='" + publishing + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", bookState=" + bookState +
                ", deployDatetime=" + deployDatetime +
                ", salesVolume=" + salesVolume +
                '}';
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
    }
}