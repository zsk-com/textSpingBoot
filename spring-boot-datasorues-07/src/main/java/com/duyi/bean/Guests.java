package com.duyi.bean;

public class Guests  {
    private Integer id;
    private String name;
    private String post;

    public Guests() {
    }

    public Guests(Integer id, String name, String post) {
        this.id = id;
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
