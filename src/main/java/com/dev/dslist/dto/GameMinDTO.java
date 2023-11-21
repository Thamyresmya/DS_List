package com.dev.dslist.dto;


import com.dev.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    //Contrutor sem paramentro
    public GameMinDTO(){

    }

    //construtor que recebe uma entidade
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
