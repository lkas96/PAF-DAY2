package vttp.batch5.paf.day._2.repository.models;

import java.util.Date;

public class Book {
    private String asin;
    private String title;
    private String author;
    private String imgUrl;
    private String prodUrl;
    private float stars;
    private int reviews;
    private float price;
    private Date publishedDate;
    private String category;
    public String getAsin() {
        return asin;
    }
    public void setAsin(String asin) {
        this.asin = asin;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getProdUrl() {
        return prodUrl;
    }
    public void setProdUrl(String prodUrl) {
        this.prodUrl = prodUrl;
    }
    public float getStars() {
        return stars;
    }
    public void setStars(float stars) {
        this.stars = stars;
    }
    public int getReviews() {
        return reviews;
    }
    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Date getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Book(String asin, String title, String author, String imgUrl, String prodUrl, float stars, int reviews,
            float price, Date publishedDate, String category) {
        this.asin = asin;
        this.title = title;
        this.author = author;
        this.imgUrl = imgUrl;
        this.prodUrl = prodUrl;
        this.stars = stars;
        this.reviews = reviews;
        this.price = price;
        this.publishedDate = publishedDate;
        this.category = category;
    }
    public Book(){

    }
    @Override
    public String toString() {
        return "Book [asin=" + asin + ", title=" + title + ", author=" + author + ", imgUrl=" + imgUrl + ", prodUrl="
                + prodUrl + ", stars=" + stars + ", reviews=" + reviews + ", price=" + price + ", publishedDate="
                + publishedDate + ", category=" + category + "]";
    }
    
}
