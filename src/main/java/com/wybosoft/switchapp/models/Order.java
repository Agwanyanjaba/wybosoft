package com.wybosoft.switchapp.models;

import lombok.Getter;
import lombok.Setter;

public class Order {

    @Getter
    @Setter
    private String orderID;

    @Getter
    @Setter
    private Date dateOfCreation;

    @Getter
    @Setter
    private String content;

}