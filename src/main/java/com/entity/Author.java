package com.entity;

public class Author {
    private Integer authorId;

    private String authorName;

    private String authorPhoto;

    private String authorInfo;

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorPhoto='" + authorPhoto + '\'' +
                ", authorInfo='" + authorInfo + '\'' +
                '}';
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAuthorPhoto() {
        return authorPhoto;
    }

    public void setAuthorPhoto(String authorPhoto) {
        this.authorPhoto = authorPhoto == null ? null : authorPhoto.trim();
    }

    public String getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(String authorInfo) {
        this.authorInfo = authorInfo == null ? null : authorInfo.trim();
    }
}