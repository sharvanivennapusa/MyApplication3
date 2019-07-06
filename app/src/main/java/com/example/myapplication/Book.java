package com.example.myapplication;

public class Book {
    private String Title;
    private String Category;
    private int Thumbnil;

    public Book(String title, String category, int thumbnil) {
        Title = title;
        Category = category;
        Thumbnil = thumbnil;
    }

    public Book(){

    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public int getThumbnil() {
        return Thumbnil;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setThumbnil(int thumbnil) {
        Thumbnil = thumbnil;
    }
}
