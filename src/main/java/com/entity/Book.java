package com.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private Integer bookNumber;

    private String bookPhoto;

    private Integer bookTypeid;

    private Integer authorid;

    private String publisher;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishtime;

    private Author author;

    private BookType bookType;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookNumber=" + bookNumber +
                ", bookPhoto='" + bookPhoto + '\'' +
                ", bookTypeid=" + bookTypeid +
                ", authorid=" + authorid +
                ", publisher='" + publisher + '\'' +
                ", publishtime=" + publishtime +
                ", author=" + author +
                ", bookType=" + bookType +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookPhoto() {
        return bookPhoto;
    }

    public void setBookPhoto(String bookPhoto) {
        this.bookPhoto = bookPhoto == null ? null : bookPhoto.trim();
    }

    public Integer getBookTypeid() {
        return bookTypeid;
    }

    public void setBookTypeid(Integer bookTypeid) {
        this.bookTypeid = bookTypeid;
    }

    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}